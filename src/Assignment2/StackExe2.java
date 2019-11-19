package Assignment2;

public class StackExe2
{  
	public static void main(String[] args)
	{
		Stack2 s2 = new Stack2(5);
		System.out.println(reverseString("vineetha"));
	}
	
	public static String reverseString(String str)
	{
		int stackSize = str.length();
		Stack2 s2 = new Stack2(stackSize);
       for(int j=0;j<str.length();j++)
       {
    	   char ch=str.charAt(j);
    	   s2.push(ch);
    	   
       }
       String result = " ";
       while(!s2.isEmpty())
       {
    	   char ch = s2.pop();
           result=result+ ch;
       } 
       return result;
	}
}

