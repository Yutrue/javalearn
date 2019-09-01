/*
 
多线程的运行出现了安全问题

原因：
	当多条语句在操作同一个线程共享数据时，一个线程对多条语句只执行一部分，还没有执行完
	另一个线程参与进来执行，导致共享数据的错误
	
解决办法：
	对多条操作共享数据的语句，只能让一个线程执行完，在执行过程中，其他线程不可以参与执行

Java对于多线程的安全问题提供了专业的解决方式

即 同步代码块

synchronized(对象)
{
	需要被同步的代码
}

对象如同锁，持有锁的线程可以在同步中执行
未持有锁的线程即使获取cpu的执行权，也进不去，因为没有获取锁

同步的前提：
1.必须要有两个或者两个以上的线程
2.必须是多个线程使用同一个锁

必须保证同步中只有一个线程在运行

好处：解决了多线程的安全问题

弊端：多个线程需要判断锁，较为消耗资源


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
