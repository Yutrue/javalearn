class extendsDemo 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.show();
	}
}

class Fu
{
	int num=3;
}

class Zi extends Fu
{
	int num=4;
	void show(){
		//System.out.println(this.num);
		System.out.println(super.num);
	}
}