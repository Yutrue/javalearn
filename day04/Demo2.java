class Demo2
{
	private int age=0;
	private String name = null;

	Demo2(int age)	//构造函数
	{
		this.age = age;
		System.out.println(age);
	}

	Demo2(String name,int age)
	{
		this(age);
		System.out.println(age);

		this.name = name;                        //这两个是一个，this 就相当于 对象(数据)                                       //
		System.out.println(name);

		this.age = age;
		System.out.println(age);
	}

	public static void main(String[] args)
	{
		Demo2 d= new Demo2(20);
		//Demo2 d2= new Demo2("zhangshuai",21);
	}
}