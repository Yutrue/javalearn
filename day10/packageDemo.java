package pack;

/*
为了简化类名的书写，使用一个关键字，import.
import  导入的是包中的类.
建议不要使用通配符 * ，需要用到包中的哪个类导哪个

D:\WorkSpace\Github\javalearn\myclass\packa\DemoA.class
D:\WorkSpace\Github\javalearn\myclass\haha\packa\DemoZ.class

import packa.*;
import packa.haha.*;

建议定包名不要重复，可以使用url来完成定义，url是唯一的

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
总结：
		包与包之间进行访问，被访问的包中的类以及类中的成员，需要public修饰。

		不同的包中的子类还可以直接访问父类中被protected权限修饰的成员

包与包之间可以使用的权限只有两种：public  protected

可以
                    public   protected   default   private
同一个类中      ok             ok           ok           ok
同一个包中      ok             ok           ok
子类                 ok             ok
不同包中          ok 

*/