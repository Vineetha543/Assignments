package recursivesearch;

public class RecursiveLinear 
{
  public static void main(String[] args)
  {
	  System.out.println(recursiveLinearSearch(new int[] {3,56,76,98,67,33}, 0,67));
  }
  public static int recursiveLinearSearch(int [] a, int i, int x)
  {
	   if(i > a.length-1)
	   {
		   return -1;
	   }
	   else if(a[i] == x)
	   {
		   return i;
	   }
	   else
	   {
		   System.out.println("index at: " +i);
		   return recursiveLinearSearch(a, i+1, x);
	   }
  }
}
