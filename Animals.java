import java.util.*;


class Dogs{

	int age;
	String colour , breed;
	public void run(){

		System.out.println("Runs at the speed of 20kmph");
	
			}
	public void description(){
		
		System.out.println("Tommy's age is " + age + " and it's colour is " + colour);	


		}

}


public class Animals{

		public static void main(String[] args){

	Dogs tommy = new Dogs();
	
	tommy.age = 6;
	tommy.colour = "black";
	tommy.breed = "labrador";
	tommy.description();
	tommy.run();
	

		
	}

}
