package NumberBaseBallCom;


//����
public class RCom
{
   int com[]; //������ com�̶�� �迭 ����
   public RCom() { // RCom ���ڸ� ���� �ʴ� ������
      // TODO Auto-generated constructor stub
      com = new int[3]; // com ������ ������ �迭 ��ü�� ���� �Ŀ� ����


      com[0] =(int)(Math.random()*9+1); // com�� 0�� �ε����� 1~9���� �߿� ���� ���� ����
      com[1] =(int)(Math.random()*9+1); // com�� 1�� �ε����� 1~9���� �߿� ���� ���� ����

      while(com[0] == com[1]) // com�� 0�� �ε����� 1�� �ε����� ������ �ݺ�
      {
         com[1] =(int)(Math.random()*9+1); // com�� 1�� �ε����� 1~9���� �߿� ���� ���� ����
      }
      com[2] =(int)(Math.random()*9+1); // com�� 2�� �ε����� 1~9���� �߿� ���� ���� ����
      while(com[0] == com[2] || com[1] == com[2])
      // com�� 0�� �ε����� 2�� �ε����� ������ �ݺ� �Ǵ� com�� 1�� �ε����� 2�� �ε����� ������ �ݺ�
      {
         com[2] =(int)(Math.random()*9+1); //com�� 2�� �ε����� 1~9���� �߿� ���� ���� ����
      }
   }

   public int[] getCom()
   //������ �迭�� �����ϰ� ���ڸ� �ƹ��͵� �������� getCom �Լ�
   {
      return com; // com ������ ����
   }
}


