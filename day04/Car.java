
class Car 
{
	private int num;

	//��������
	{
		System.out.println("��������");
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
		new Car().run();		//ʹ����������
		show(new Car());
	}
}
