class ArrayTest6 
{
	public static void main(String[] args) 
	{
		toBin(-6);
	}

	public static void toBin(int num)
	{
		//定义一个二进制的表
		char[] chs={'0','1'};

		//定义一个临时存储容器
		char[] arr=new char[32];

		//定义一个操作数组的指针
		int pos=arr.length;
		//System.out.print(arr.length);

		while(num!=0)
		{
			int temp=num&1;//

			arr[--pos]=chs[temp];

			num=num>>>1;//
		}
		
		for(int x=pos;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}
}
