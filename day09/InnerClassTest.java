
interface Inter
{
	void method();
}

class Test
{
	//补足代码，通过匿名内部类
	/*
	static class Inner implements Inter
	{
		public void method ()
		{
			System.out.println("method run");
		}
	}
	*/

	static Inter function()
	{
		return new /*Inner()*/Inter()
		{
			public void method ()
			{
				System.out.println("method run");
			}
		};
	}
}



class InnerClassTest 
{
	public static void main(String[] args) 
	{
		Test.function().method();
		//System.out.println("Hello World!");
		
	}
}


class InnerTest
{
	public static void main(String[] args)
	{
		new Object()
		{
			public void function()
			{
				System.out.println("Hello World!");
			}
		}.function();
	}
}