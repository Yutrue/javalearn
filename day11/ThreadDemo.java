/*
 1.如何在自定义的代码中，自定义一个线程呢？
 
 	一：继承Thread类
 	步骤：
 	1.定义类继承Thread
 	
 	2.复写Thread类中的run方法
 		复写原因：
 			Thread类用于描述线程
 			该类就定义了一个功能，用于存储线程要运行的代码，该存储功能就是run方法
 	       目的：
 	               将自定义代码存储在run方法中，让线程运行
 	3.调用线程的start方法（作用：启动线程；调用run方法）
  
多线程的一个特性：随机性  
  
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
		
		Demo d = new Demo();//创建好一个线程
		d.start();//开启线程并执行该线程的run方法
		//d.run();//仅仅是对象调用方法，而线程创建了，并没有运行
		
		for(int x=0;x<100;x++)
			System.out.println("world run"+x);
	}

}
