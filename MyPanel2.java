package NumberBaseBallCom;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JTextField;


//Ŭ���ξ�Ʈ

public class MyPanel2 extends JPanel{


   JTextField jt; //JTextField�� ���� jt ����  
   int strike = 0; //������ strike ������ 0���� �ʱ�ȭ
   int ball = 0; //������ ball ������ 0���� �ʱ�ȭ
   int out = 0; //������ out ������ false�� �ʱ�ȭ

   void setData(int strike, int ball, int out)
   //������ ���� ���ڸ� ������ 2���� bool�� 1���� �޴� setData �Լ�
   {
      this.strike = strike; // �� strike ������ ���� strike�� ����
      this.ball = ball; // �� ball ������ ���� ball�� ����
      this.out = out; // �� out ������ ���� out�� ����
   }
  
  
   @Override
   public void paintComponent(Graphics g){
   //JPanelŬ������ �ִ� paintComponent �Լ��� �������̵�
   //������ ���� Graphics�� ���ڷ� �޴� paintComponet�Լ�
      super.paintComponent(g); //�θ� paintComponet�� ���� g�� �����ؼ� ȣ��
      g.setFont(new Font("�������",Font.BOLD,20)); 
      //Graphics�� setFont �Լ� ȣ��
      //ȣ��� Font ��ü�� �����ؼ� ȣ��
      //Font�� �����Ҷ� "���� ���"�� BOLD ������� 20
     
      if(strike == 3)
      //strike�� ���� 3�̸� �Ʒ� ��ɾ� ����
      {
         g.setFont(new Font("�������",Font.BOLD,60));
         //Font�� �����Ҷ� "���� ���"�� BOLD ������� 60
         g.drawString("Home Run!!!!", 30, 180);
         //"Home Run!!!!"������ x : 30 y : 100�� ���ڿ��� �׸���.
      }
     
      else
      {
      //�� ������ �ƴϸ� �Ʒ� ��ɾ� ����
         if(strike == 0)
         //���� strike�� 0�̸� �Ʒ� ��ɾ� ����
         {
            g.setColor(Color.RED);
            //�÷� ����
            g.drawString("S", 30, 222);
            //"S"�� x : 30 y : 222�� ���ڿ��� �׸���.
            g.drawOval(50,200,30,30);
            //��� �ִ� ���� x : 50 y: 200�� 30����� ����� �׸���.
            g.drawOval(90,200,30,30);
            //��� �ִ� ���� x : 90 y: 200�� 30����� ����� �׸���.
         }
         else if(strike == 1)
         //���� strike�� 1�̸� �Ʒ� ��ɾ� ����
         {
            g.setColor(Color.RED);
            //�÷� ����
            g.drawString("S", 30, 222);
            //"S"�� x : 30 y : 222�� ���ڿ��� �׸���.
            g.fillOval(50,200,30,30);
            //���� �ִ� ���� x : 50 y: 200�� 30����� ����� �׸���.
            g.drawOval(90,200,30,30);
            //��� �ִ� ���� x : 50 y: 200�� 30����� ����� �׸���.
         }
         else
         //���� �������� ��� �ƴϸ� �Ʒ� ��ɾ� ����
         {
            g.setColor(Color.RED);
            //�÷� ����
            g.drawString("S", 30, 222);
            //"S"�� x : 30 y : 222�� ���ڿ��� �׸���.
            g.fillOval(50,200,30,30);
            //���� �ִ� ���� x : 50 y: 200�� 30����� ����� �׸���.
            g.fillOval(90,200,30,30);
            //���� �ִ� ���� x : 50 y: 200�� 30����� ����� �׸���.
         }

         if(ball == 0)
         //���� ball�� 0�̸� �Ʒ� ��ɾ� ����
         {
            g.setColor(Color.BLUE);
            //�÷� ���
            g.drawString("B", 30, 262);
            //"B"�� x : 30 y : 262�� ���ڿ��� �׸���.
            g.drawOval(50,240,30,30);
             //��� �ִ� ���� x : 50 y: 240�� 30����� ����� �׸���.
            g.drawOval(90,240,30,30);
            //��� �ִ� ���� x : 90 y: 240�� 30����� ����� �׸���.
            g.drawOval(130,240,30,30);
            //��� �ִ� ���� x : 130 y: 240�� 30����� ����� �׸���.
         }
         else if(ball == 1)
         {
            g.setColor(Color.BLUE);
            //�÷� ���
            g.drawString("B", 30, 262);
            //"B"�� x : 30 y : 262�� ���ڿ��� �׸���.
            g.fillOval(50,240,30,30);
             //���� �ִ� ���� x : 50 y: 240�� 30����� ����� �׸���.
             g.drawOval(90,240,30,30);
            //��� �ִ� ���� x : 90 y: 240�� 30����� ����� �׸���.
            g.drawOval(130,240,30,30);
            //��� �ִ� ���� x : 130 y: 240�� 30����� ����� �׸���.
         }
         else if(ball == 2)
         {
            g.setColor(Color.BLUE);
            //�÷� ���
            g.drawString("B", 30, 262);
            //"B"�� x : 30 y : 262�� ���ڿ��� �׸���.
            g.fillOval(50,240,30,30);
            //���� �ִ� ���� x : 50 y: 240�� 30����� ����� �׸���.
            g.fillOval(90,240,30,30);
            //���� �ִ� ���� x : 90 y: 240�� 30����� ����� �׸���.
            g.drawOval(130,240,30,30);
            //��� �ִ� ���� x : 130 y: 240�� 30����� ����� �׸���.
         }
         else
         {
            g.setColor(Color.BLUE);
            //�÷� ���
            g.drawString("B", 30, 262);
            //"B"�� x : 30 y : 262�� ���ڿ��� �׸���.
            g.fillOval(50,240,30,30);
            //���� �ִ� ���� x : 50 y: 240�� 30����� ����� �׸���.
            g.fillOval(90,240,30,30);
            //���� �ִ� ���� x : 90 y: 240�� 30����� ����� �׸���.
            g.fillOval(130,240,30,30);
            //���� �ִ� ���� x : 130 y: 240�� 30����� ����� �׸���.
         }

         if(out == 0)
         //�������� �ƿ��� false�̸� �Ʒ� ��ɾ� ����
         {
            g.setColor(Color.ORANGE);
            //�÷� ������
            g.drawString("O", 30, 302);
            //"O"�� x : 30 y : 302�� ���ڿ��� �׸���.
            g.drawOval(50,280,30,30);
            //��� �ִ� ���� x : 50 y: 280�� 30����� ����� �׸���.
         }
         else
         //���� ������ �ƴϸ� �Ʒ� ��ɾ� ����
         {
            g.setColor(Color.ORANGE);
            //�÷� ������
            g.drawString("O", 30, 302);
            //"O"�� x : 30 y : 302�� ���ڿ��� �׸���.
            g.fillOval(50,280,30,30);
            //���� �ִ� ���� x : 50 y: 280�� 30����� ����� �׸���.
         }
      }
     

   }
}


