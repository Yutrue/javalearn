class IfTest 
{
	public static void main(String[] args) 
	{
		//需求一：根据用户定义的数值不同，打印对应的星期英文
		int x=1;
		if(x>7 || x<1)
			System.out.println(x+ " Not Week！");
		else if(x==1)
			System.out.println(x+ " is Monday！");
		else if(x==2)
			System.out.println(x+ " is Tuesday！");
		else if(x==3)
			System.out.println(x+ " is Wednesday！");
		else if(x==4)
			System.out.println(x+ " is Thursday！");
		else if(x==5)
			System.out.println(x+ " is Friday！");
		else if(x==6)
			System.out.println(x+ " is Saturday！");
		else
			System.out.println(x+ " is Sunday！");

		//需求二：根据用户指定月份，打印该月份属于的季节

	}
}
