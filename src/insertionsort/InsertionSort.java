package insertionsort;

public class InsertionSort {

	public static void main(String[] args) 
	{

		   int [] arr = insertionSort(new int[] {4,56,78,34,12,18});
		   for(int i=0;i<arr.length;i++)
		   {
			   System.out.println(arr[i]);
		   }
	}
	
	public static int[] insertionSort(int[] a)
	{
		for(int i =1;i<a.length;i++)
		{
			int element = a[i];
			int j=i-1;
			while(j>=0 && a[j]>element)
            {
	           a[j+1]=a[j];
	           j--;
            }
			a[j+1]=element;
		}
		return a;
	}

}
