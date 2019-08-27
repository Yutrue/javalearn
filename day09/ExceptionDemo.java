class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		try
		{
			int x=d.div(4,0);
			System.out.println("x="+x);
		}
		catch (Exception e)
		{
			System.out.println("除零");
			System.out.println(e.getMessage());//异常信息
			System.out.println(e.toString());//异常名称：异常信息
			e.printStackTrace();//打印异常的堆栈的跟踪信息
		}
	}
}


class Demo 
{
	int div(int a,int b)
	{
		return a/b;
	}
}