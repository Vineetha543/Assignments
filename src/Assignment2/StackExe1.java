package Assignment2;

public class StackExe1 
{ 
	public static void main(String[] args)
	{
		Stack1 s1 = new Stack1(03);
		s1.push(10);
		s1.push(30);
		s1.push(50);
		s1.push(70);
		s1.push(90);
		s1.push(110);
		
		while(!s1.isEmpty())
		{
			long value = s1.pop();
			System.out.println(value);
		}
	}

}
