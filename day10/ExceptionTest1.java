/*
��һ��Բ�κͳ�����
�����Ի�ȡ���������������ַǷ�����ֵ����Ϊ��ȡ�����������
����ͨ���쳣����ʾ
�ȶ����������л������

*/

class NoValueException extends RuntimeException
{
	NoValueException(String msg)
	{
		super(msg);
	}
}

interface Shape
{
	void getArea();
}

class Rec implements Shape
{
	private int len,wid;

	Rec(int len,int wid) //throws NoValueException
	{
		if(len<=0 || wid<=0)
			throw new NoValueException("���ַǷ�ֵ");
		this.len = len;
		this.wid = wid;
	}

	public void getArea()
	{
		System.out.println(len*wid);
	}
}

class Circle implements Shape
{
	private int radius;
	public static final double PI = 3.14;

	Circle(int radius)
	{
		if(radius<=0)
			throw new NoValueException("�Ƿ�");
		this.radius = radius;
	}

	public void getArea()
	{
		System.out.println(radius*radius*PI);
	}
}

class ExceptionTest1 
{
	public static void main(String[] args) 
	{
		
		Rec r = new Rec(3,4);
		r.getArea();
		
		Circle c  = new Circle(-8);
		c.getArea();
		System.out.println("over");
	}
}