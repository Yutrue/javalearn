/*
 * ��ϰ�����������̣߳������߳̽�������
 * 
 * �̶߳����Լ�Ĭ�ϵ����ƣ� Thread-��ţ���0��ʼ��
 * 		static Thread.currentThread():��ȡ��ǰ�߳�����
 * 		getname() :��ȡ�߳�����
		�����߳����ƣ�setname() ����  ���캯��
 *   	
 * 
 * */
class Test extends Thread
{
	//private String name;
	Test(String name)
	{
		//this.name = name;
		super(name);
		
	}
	public void run()
	{
		for(int x=0;x<60;x++)
			System.out.println(this.getName()+" test run"+x);
	}
}

class ThreadTest {

	public static void main(String[] args) {

		Test t1 = new Test("one");
		Test t2 = new Test("two");
		t1.start();
		t2.start();
		
		for(int x=0;x<60;x++)
			System.out.println("main run"+x);

	}

}