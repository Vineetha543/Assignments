
public class Zoo {
 
	public static void main(String args[]) 
	{
		Animal a1 = new Animal("Lion",67,"male",418);
		Animal a2 = new Animal("Tiger",87,"male",567);
		Animal a3 = new Animal("Horse",56,"female",345);
		 
		a1.animalInfo();
		a2.animalInfo();
		a3.animalInfo();
		
		
	  Birds b1 = new Birds();
	  b1.flying();
	  
	  Fishes f1 = new Fishes();
	  f1.swim();
		
	}
}
