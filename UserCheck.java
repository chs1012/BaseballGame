package NumberBaseBallCom;

//����

public class UserCheck
{
	int strike; // ���� ���� strike ����
	int ball; // ���� ���� ball ����
	int out; // �� ���� out ����
	public void check(int[] com, int[] user) {
		//UserCheck �����ڷ� ���ڷ� ������ �迭 �ΰ��� �޴´�.
		// TODO Auto-generated constructor stub
		
		strike = 0;
		ball = 0;
		out = 0;
		
		for(int i = 0; i<3 ; i++) 
			// ������ i�� �ʱ�ȭ�� 0�̰� i�� 3���� ������ �ݺ��ϰ� �ݺ��� i�� 1�� �����Ѵ�.
		{
			for(int j = 0; j<3 ; j++)
				// ������ j�� �ʱ�ȭ�� 0�̰� j�� 3���� ������ �ݺ��ϰ� �ݺ��� j�� 1�� �����Ѵ�.
			{
				if(com[i] == user[j])
					// com�� i�ε��� ���� user�� j�ε��� ���� ������ �Ʒ� ��ɾ� ����
				{
					if(i==j)
						//���� �� i�� j�� ������ �Ʒ� ��ɾ� ����
						strike++; // ���� strike�� 1����
					else
						// ���� ������ �ƴϸ� ����
						ball++; // ���� ball�� 1����
				}
			}
		}

		if(strike == 0 && ball== 0)
			out = 1;
	}

	public String getValue()
	{
		
		return strike+""+ball+""+out;
	}

//
//	public int getStrike()//������ ��ȯ�ϰ� ���ڰ� ���� getStrike �Լ�
//	{
//		return strike; // strike ���� ���� ����
//	}
//	public int getBall()//������ ��ȯ�ϰ� ���ڰ� ���� getBall �Լ�
//	{
//		return ball; // ball ���� ���� ����
//	}
//	public boolean getOut() //bool�� ��ȯ�ϰ� ���ڰ� ���� getOut �Լ�
//	{
//		if(strike == 0 && ball== 0)
//			//���� strike�� 0�̰� ���� ball�� 0�̸� �Ʒ� ��ɾ� ����
//			return true; //true�� ����
//		else
//			//���� ������ �ƴϸ� �Ʒ� ��ɾ� ����
//			return false; //false�� ����
//	}

}


