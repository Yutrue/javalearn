class Demo2
{
	private int age=0;
	private String name = null;

	Demo2(int age)	//���캯��
	{
		this.age = age;
		System.out.println(age);
	}

	Demo2(String name,int age)
	{
		this(age);
		System.out.println(age);

		this.name = name;                        //��������һ����this ���൱�� ����(����)                                       //
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