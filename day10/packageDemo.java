package pack;

/*
Ϊ�˼���������д��ʹ��һ���ؼ��֣�import.
import  ������ǰ��е���.
���鲻Ҫʹ��ͨ��� * ����Ҫ�õ����е��ĸ��ർ�ĸ�

D:\WorkSpace\Github\javalearn\myclass\packa\DemoA.class
D:\WorkSpace\Github\javalearn\myclass\haha\packa\DemoZ.class

import packa.*;
import packa.haha.*;

���鶨������Ҫ�ظ�������ʹ��url����ɶ��壬url��Ψһ��

*/

class  packageDemo
{
	public static void main(String[] args) 
	{
		packa.DemoA a = new packa.DemoA();
		a.show();

		//packb.DemoB b = new packb.DemoB();
		//b.method();
	}
}


/*
�ܽ᣺
		�����֮����з��ʣ������ʵİ��е����Լ����еĳ�Ա����Ҫpublic���Ρ�

		��ͬ�İ��е����໹����ֱ�ӷ��ʸ����б�protectedȨ�����εĳ�Ա

�����֮�����ʹ�õ�Ȩ��ֻ�����֣�public  protected

����
                    public   protected   default   private
ͬһ������      ok             ok           ok           ok
ͬһ������      ok             ok           ok
����                 ok             ok
��ͬ����          ok 

*/