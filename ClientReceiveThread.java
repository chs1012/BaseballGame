package NumberBaseBallCom;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ClientReceiveThread extends JFrame implements ActionListener, Runnable{
	//
	private Socket m_Socket;

	MyPanel2 p; //MyPanel2�� ���� p ����
	JTextField jt; //JTextField�� ���� jt ����
	JButton jb; // JButton�� ���� jb ����

	public ClientReceiveThread(){

		Container c = getContentPane();
		//Container�� ���� c ������ getContentPane�Լ��� ȣ���Ͽ� Container ��ü�� ����
		c.setLayout(new BorderLayout());       
		//Container�� setLayout�Լ� ȣ�� ���ڷ� BorderLayout ��ü�� �����ؼ� �ѱ�
		p = new MyPanel2(); // p ������ Mypanel2�� ��ü�� ���� �� ����
		jt = new JTextField(15); 
		// jt ������ JTextField�� ���̸� 15�� ���ϰ� ��ü�� ���� �� ����
		p.add(jt); //MyPanel2���ٰ� JTextField �߰�
		jb = new JButton("�Է�"); 
		// jb ������ JButton�� �� "�Է�"���� ���ϰ� ��ü�� ���� �� ����
		jb.addActionListener(this); 
		// JButton addActionListener�Լ��� ȣ�� �� Ŭ���� �ڽ��� �����ؼ� ȣ��
		// ActionListener �߰�
		jb.setFont(new Font("�������",Font.BOLD,18));
		//JButton setFont �Լ� ȣ��
		//�Լ� ȣ��� Font�� "�������", BOLD, ũ�� 18�� �����Ͽ� ������ ���ڷ� �ѱ�
		p.add(jb); // MyPanel2�� JButton �߰�

		c.add(p); // Container�� MyPanel2 �߰�

		setSize(400,400); //ȭ�� ������ x : 400 y: 400

		setVisible(true); //�����ٰ����� ���� �Լ� : true

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		//�⺻ �ݱ� ����� JFrame�� ������ ���
	}

	// ������ ���� ��Ʈ����ũ ���� ������ ȭ�� �ٽ� �׸���
	public void run() { 

		try { 

			BufferedReader tmpbuf = new BufferedReader(
					new InputStreamReader(m_Socket.getInputStream())); 

			String receiveString; 
			while(true) 
			{  
				receiveString = tmpbuf.readLine(); 
				System.out.println(receiveString);

				if(receiveString == null)
				{ 
					System.out.println("�߰��ÿ�"); 
					break;  
				} 
				else 
				{   
					System.out.println(receiveString);
					p.setData(receiveString.charAt(0)-'0', receiveString.charAt(1)-'0', 
							receiveString.charAt(2)-'0');
					//MyPanel2�� setData �Լ� ȣ��
					//���ڷ� strike, ball, out ���� ���ڷ� �ѱ�
					p.repaint();
				} 
			}  
		}catch(IOException e) 
		{  
			e.printStackTrace();
		}
		System.exit(0);
	} 
	public void setSocket(Socket _socket) 
	{ 

		m_Socket = _socket; 
	}

	// ���� -> ������ ����
	public void actionPerformed(ActionEvent e) {
		PrintWriter sendWriter = null;
		try {
			sendWriter = new PrintWriter(m_Socket.getOutputStream());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		sendWriter.println(jt.getText());		
		sendWriter.flush();
	}

}
