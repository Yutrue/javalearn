class car 
{
	String color="red";
	int num=4;
	void run()
	{
		System.out.println(color+"..."+num);	
	}
}

class carDemo 
{
	public static void main(String[] args) 
	{
		car c = new car();
		c.color="blue";
		c.run();
		car c1=new car();
		c1.run();
	}
}
