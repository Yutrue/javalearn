/*
 1.������Զ���Ĵ����У��Զ���һ���߳��أ�
 
 	һ���̳�Thread��
 	���裺
 	1.������̳�Thread
 	
 	2.��дThread���е�run����
 		��дԭ��
 			Thread�����������߳�
 			����Ͷ�����һ�����ܣ����ڴ洢�߳�Ҫ���еĴ��룬�ô洢���ܾ���run����
 	       Ŀ�ģ�
 	               ���Զ������洢��run�����У����߳�����
 	3.�����̵߳�start���������ã������̣߳�����run������
  
���̵߳�һ�����ԣ������  
  
 */

class Demo extends Thread
{
	public void run()
	{
		for(int x=0;x<100;x++)
			System.out.println("demo run"+x);
	}
}

class ThreadDemo {

	public static void main(String[] args) 
	{
		
		Demo d = new Demo();//������һ���߳�
		d.start();//�����̲߳�ִ�и��̵߳�run����
		//d.run();//�����Ƕ�����÷��������̴߳����ˣ���û������
		
		for(int x=0;x<100;x++)
			System.out.println("world run"+x);
	}

}
