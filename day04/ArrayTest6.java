class ArrayTest6 
{
	public static void main(String[] args) 
	{
		toBin(-6);
	}

	public static void toBin(int num)
	{
		//����һ�������Ƶı�
		char[] chs={'0','1'};

		//����һ����ʱ�洢����
		char[] arr=new char[32];

		//����һ�����������ָ��
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
