/*
 * ����
 *		������һ�����
 *		�����������ֱ��300Ԫ��ÿ�δ�100��������
 * 
 * Ŀ�ģ��ó����Ƿ��а�ȫ���⣬�У���ν����
 * 
 * ��������⣿
 * 1.��ȷ��Щ�����Ƕ��߳����д���
 * 2.��ȷ��������
 * 3.��ȷ���߳����д�������Щ����ǲ����������ݵ�
 * 
 * */

class Bank
{
	private int sum;
	//Object obj = new Object();
	public synchronized void add(int n) //ͬ��������ͬ������������this
	{
		//synchronized(obj)
		//{
			sum = sum + n;
			System.out.println("sum="+sum);	
		//}
	}
}

class Cus implements Runnable
{
	private Bank b = new Bank();
	public void run()
	{
		for(int x=0;x<3;x++)
		{
			b.add(100);
		}
		
	}
}


class BankDemo {

	public static void main(String[] args) 
	{
		Cus c = new Cus();
		Thread t1 = new Thread(c); 
		Thread t2 = new Thread(c); 
		t1.start();
		t2.start();

	}

}
