/*
 
���̵߳����г����˰�ȫ����

ԭ��
	����������ڲ���ͬһ���̹߳�������ʱ��һ���̶߳Զ������ִֻ��һ���֣���û��ִ����
	��һ���̲߳������ִ�У����¹������ݵĴ���
	
����취��
	�Զ��������������ݵ���䣬ֻ����һ���߳�ִ���꣬��ִ�й����У������̲߳����Բ���ִ��

Java���ڶ��̵߳İ�ȫ�����ṩ��רҵ�Ľ����ʽ

�� ͬ�������

synchronized(����)
{
	��Ҫ��ͬ���Ĵ���
}

������ͬ�������������߳̿�����ͬ����ִ��
δ���������̼߳�ʹ��ȡcpu��ִ��Ȩ��Ҳ����ȥ����Ϊû�л�ȡ��

ͬ����ǰ�᣺
1.����Ҫ�����������������ϵ��߳�
2.�����Ƕ���߳�ʹ��ͬһ����

���뱣֤ͬ����ֻ��һ���߳�������

�ô�������˶��̵߳İ�ȫ����

�׶ˣ�����߳���Ҫ�ж�������Ϊ������Դ


*/

class Ticket2 implements Runnable //extends Thread
{
	private /*static*/ int tick = 100;
	Object obj = new Object();
	public void run()
	{
		while(true)
		{
			synchronized(obj)
			{
				if(tick>0)
				{
					try{Thread.sleep(50);}catch(Exception e){}
					System.out.println(Thread.currentThread().getName()+"...sale : "+ tick--);
				}
			}
		}
	}
}

class TicketDemo2 {

	public static void main(String[] args) 
	{
		Ticket2 t = new Ticket2();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		/*
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		Ticket t4 = new Ticket();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		*/
	}

}
