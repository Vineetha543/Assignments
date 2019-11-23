package binarysearch;

public class Binary 
{
   public static void main(String[] args)
   {
	   Binary b=new Binary();
	   System.out.println(b.binarySearch(new int[] {1,3,4,6,7,8,19,34,56,78} , 19));;
	   
   }
   public  int binarySearch(int a[] , int x)
   {
	   int p=0;
	   int r=a.length-1;
	   
	   while(p<=r)
	   {
		   int mid = (p+r)/2;
	       if(x<a[mid])
	       {
	    	   r=mid-1;
	       }
	       else if(x>a[mid])
	       {
	    	   p=mid+1;
	       }
	       else
	       {
	    	   return mid;
	       }
	    	   
       }
	return -1;

   }
}
