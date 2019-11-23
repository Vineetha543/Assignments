package linearsearch;

public class Linear 
{
    public static void main(String[] args) 
    {
    	System.out.println(linearSearch(new int[] {1,3,56,34,23,65,75}, 65) );
    }
	  public static int linearSearch(int a[], int x)	
	  {
		  int answer=-1;
		  for(int i=0;i<a.length;i++)
		  {
			 if(a[i]==x)
			 {
				 answer=i;
			 }
		  }
		  return answer;
	
	  }
}
