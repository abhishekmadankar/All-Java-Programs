public class Dog{

	//instance variables
	String name;
	String breed;
	int age;
	String colour;

	//Constructor declaration of class
	public Dog(String name,String breed,int age,String colour)
	{
		this.name = name;
		this.breed=breed;
		this.age=age;
		this.colour=colour;
	}

	//method1
	public String getName()
	{
		return name;
	}
	public String getBreed()
	{
		return breed;
	}
	public int getAge()
	{
		return age;
	}
	public String getColour()
	{
		return colour;
	}


	@Override
	
	public String toString(){

	return("Hi, my name is "+ this.getName()+ ".\nMy breed is " + this.getBreed()+".\nMy age is "+ this.getAge()+".\nMy colour is "+ this.getColour());
}

public static void main(String[] args)
{
	Dog tuffy = new Dog("Bruno","Labrador",4,"brown");
	System.out.println(tuffy.toString());
}
}	










