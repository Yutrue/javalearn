class Demo
{
	private int age = 0;

	Demo(int age)
	{
		this.age = age;
		System.out.println(age);
	}

	boolean compare(Demo d)
	{
		System.out.println(d.age);
		return this.age==d.age;   //this Ϊ���øú����Ķ�������ã���Ϊ�������Ķ���  this.age=20  d.age=21
	}

	public static void main(String[] args )
	{
		Demo d = new Demo(20);
		Demo d2 = new Demo(21);
		d.compare(d2);
	}
}