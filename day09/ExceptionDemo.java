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
			System.out.println("����");
			System.out.println(e.getMessage());//�쳣��Ϣ
			System.out.println(e.toString());//�쳣���ƣ��쳣��Ϣ
			e.printStackTrace();//��ӡ�쳣�Ķ�ջ�ĸ�����Ϣ
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