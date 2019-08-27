//冒泡排序
class bubbleSort
{
	public static void main(String[] args) 
	{
		int[] arr ={6,8,1,7,2,6,4,8};
		//printArray(arr);
		bubbleSort(arr);
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

	public static void bubbleSort(int[] arr)
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=0;y<arr.length-x-1;y++)//-x:让每一次比较的元素减少，-1：避免角标越界
			{
				if(arr[y]>arr[y+1])
				{
					int temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}				
			}
		}
	}
}
