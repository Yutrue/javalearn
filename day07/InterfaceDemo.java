interface Inter
{
	public static final int NUM=4;
	public abstract void show();
}

class Test implements Inter
{
	public void show(){}
}

class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		System.out.println(t.NUM);
		System.out.println(Test.NUM);
		System.out.println(Inter.NUM);
	}
}
