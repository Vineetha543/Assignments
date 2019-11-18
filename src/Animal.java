
public class Animal 
{
	String name;
    int age;
    String gender;
    int weightInPounds;
    
	public Animal(String name, int age, String gender, int weightInPounds) {
		this.name=name;
		this.age = age;
		this.gender = gender;
		this.weightInPounds = weightInPounds;
	}
	 
	public void animalInfo()
	{
		System.out.println("the name of animal is " + name);
		System.out.println("the age of " + name + " is "+ age);
		System.out.println("gender is " + gender);
		System.out.println("weight of " + name + " is " + weightInPounds + "Pounds");
		System.out.println("--------------------");
	}
	public void eating()
	{
		System.out.println("eating");
	}
	public void sleeping()
	{
		System.out.println("sleeping");
	}
}
