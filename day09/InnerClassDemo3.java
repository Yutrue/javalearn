class InnerClassDemo3 
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}

class Outer
{
	int x=3;

	class Inner
	{
		void method()
		{
			System.out.println("method="+x);
		}
	}

	public void function()
	{
		new Inner().method();
	}
}