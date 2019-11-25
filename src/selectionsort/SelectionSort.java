package selectionsort;

public class SelectionSort {

	public static void main(String[] args) 
	{
	   int [] arr = selectionSort(new int[] {4,56,78,34,12,18});
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.println(arr[i]);
	   }
		   
	}
        public static int [] selectionSort(int a[])
        {
        	for(int x=0;x<a.length;x++)
        	{
        		int min=x;
        	for(int y=x+1;y<a.length;y++)
        	{
        		if(a[y]<a[min])
        		{
        			min=y;
        		}
        	}
        		int temp = a[x];
        	    a[x]=a[min];
        	    a[min]=temp;
        	}	
        	return a; 
    }
}

