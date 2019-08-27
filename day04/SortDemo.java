import java.util.*;
class SortDemo 
{
	public static void main(String[] args) 
	{
		int arr[] = {15,5,6,8,1,52,48,9,4,6,8,1};
		//bubbleSort(arr);
		//selectSort(arr);
		Arrays.sort(arr);

		printArray(arr);
		
	}

	public static void selectSort(int arr[])
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for (int y=x+1; y<arr.length;y++ )
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

	public static void bubbleSort(int arr[])
	{
		for (int x=0;x<arr.length-1;x++ )
		{
			for (int y=0;y<arr.length-x-1 ;y++ )
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

	public static void printArray(int arr[])
	{
		for (int x=0;x<arr.length ; x++)
		{
			System.out.println(arr[x]);
		}
	}

}
