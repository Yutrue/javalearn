/*
 * ���󣺼򵥵���Ʊ����
 * �������ͬʱ��Ʊ

�����̵߳ĵڶ��ַ�ʽ��ʵ��Runable�ӿ�

���裺
1.������ʵ�ֽӿ� Runnable
2.����Runnable�ӿ��е�run����
		���߳�Ҫ���еĴ������ڸ�run������

3.ͨ��Thread�ཨ���̶߳���
4.��Runnable �ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��캯��
		Ϊʲô��
		ԭ���Զ����run���������Ķ���ʱRunnable�ӿڵ��������
				   ����Ҫ���߳�ȥִ��ָ�������run�������ͱ�����ȷ��run������������

5.����Thread���start���������̲߳�����Runnable�ӿ������run����

ʵ�ַ�ʽ�ͼ̳з�ʽ��ʲô������
		ʵ�ַ�ʽ�ô��������˵��̳еľ�����
		�ڶ����߳�ʱ������ʹ��ʵ�ַ�ʽ

���ַ�ʽ����
�̳�Thread���̴߳�������Thread����run������
ʵ��Runnable���̴߳������ڽӿڵ������run������

*/

class Ticket implements Runnable //extends Thread
{
	private /*static*/ int tick = 100;
	public void run()
	{
		while(true)
		{
			if(tick>0)
			{
				System.out.println(Thread.currentThread().getName()+"...sale : "+ tick--);
			}
		}
		
	}
}

class TicketDemo {

	public static void main(String[] args) 
	{
		Ticket t = new Ticket();
		
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