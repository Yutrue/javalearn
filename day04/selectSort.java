/*ѡ��������ѭ������һ�Σ���ֵ������ͷ�Ǳ�λ��*/
class selectSort 
{
	public static void main(String[] args) 
	{
		int[] arr ={6,8,1,7,2,6,4,8};
		printArray(arr);
		selectSort(arr);
		printArray(arr);
	}

	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0;x<arr.length;x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
	}

	public static void selectSort(int[] arr)
	{
		for(int x=0;x<arr.length-1;x++)//��С�ķ��ڽǱ���С��
		{
			for(int y=x+1;y<arr.length;y++)	//+1���αȽ�
			{
				if(arr[x]>arr[y])
				{
					int temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}		
	}
}
