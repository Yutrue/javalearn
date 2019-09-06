
class Car 
{
	private int num;

	//构造代码块
	{
		System.out.println("构造代码块");
	}

	void run()
	{
		System.out.println("car run");
	}

	public static void show(Car c)
	{
		System.out.println("show run");
	}

	public static void main(String[] args) 
	{
		new Car().run();		//使用匿名对象
		show(new Car());
	}
}
