/*�����ڲ��࣬�ڲ���ļ�д��ʽ��
2.�����ǰ�᣺�ڲ�������Ǽ̳�һ�������ʵ�ֽӿ�
3.�����ڲ���ĸ�ʽ��new ������߽ӿ�(){�������������}
4.�����ڲ������һ��������������е��֣��������Ϊ�����ݵĶ���
*/

abstract class AbsDemo
{
	abstract void show();
}

class Outer
{
	int x=3;

	/*
	class Inner extends AbsDemo                          
	{
		void show()
		{
			System.out.println("show="+x);
		}
	}
	*/

	public void function()
	{
		//new Inner().show();
		new AbsDemo()
		{
			void show()
			{
				System.out.println("show="+x);
			}
		}.show();
	}
}

class InnerClassDemo4 
{
	public static void main(String[] args) 
	{
		new Outer().function();
	}
}