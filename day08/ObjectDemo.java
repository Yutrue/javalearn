 class Demo //extends Object
 {
	private int num;
	Demo(int num)
	 {
		this.num=num;
	}

	public boolean equals(Object obj)
	 {
		if(!(obj instanceof Demo))
			return false;
		Demo d = (Demo)obj;
		return this.num == d.num;
	}
 }

class Person
{
}

class ObjectDemo 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo(4);
		Demo d2 = new Demo(5);

		Person p = new Person();

		System.out.println(d1.equals(p));
	}
}
