/*
 * ����
 * ͬ����Ƕ��ͬ��
 * */

class Ticket implements Runnable
{
	private int tick = 100;
	Object obj = new Object();
	boolean flag = true;
	public void run()
	{
		if(flag)
		{
			while(true)
			{
				synchronized(obj)
				{
					show();
				}				
			}			
		}
		else
			while(true)
				show();		
	}
	public synchronized void show()
	{
		synchronized(obj)
		{
			
		}
		
	}
}

class DeadLockTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
