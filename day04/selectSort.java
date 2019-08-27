/*选择排序：内循环结束一次，最值出现在头角标位置*/
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
		for(int x=0;x<arr.length-1;x++)//最小的放在角标最小的
		{
			for(int y=x+1;y<arr.length;y++)	//+1依次比较
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
