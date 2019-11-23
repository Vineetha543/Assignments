package recursivesearch;

public class RecursiveBinary 
{
    public static void main(String[] args) 
    {
		System.out.println(recursiveBinarySearch(new int[] {12,23,34,45,56,67,78,89}, 0, 7, 78));
	}
    
    public static int recursiveBinarySearch(int [] a, int p, int r, int x)	
    {
    	System.out.println("[ " + p + ".... "+ r + " ] ");
    	if(p>r)
    	{
    		return -1;
    	}
    	else 
    	{
    		int mid=(p+r)/2;
    		if(a[mid] == x)
    		{
    			 return mid;
    		}
    		else if(a[mid]>x)
    		{
    			return recursiveBinarySearch(a, p, mid-1, x);
    		}
    		else
    		{
    			return recursiveBinarySearch(a, mid+1, r, x);
    		}
    	}
    	
    }
}
