package Assignment2;


public class Adt {

	public static void main(String[] args) 
	{
	   Counter c = new Counter("counter");
	   c.increment();
	   c.increment();
	   System.out.println(c.getCurrentValue());
	   System.out.println(c.toString());
	   
	      
	   
  
	}

}
