import java.util.*;

class Vehicle{

	int wheels;
	String colour;

	//here Vehicle is a constructor 

	Vehicle(int wheels){

		this.wheels = wheels;

		}
	//here also vehicle is a contructor , just like method overloading there is constructor overloading where the name is same but the signature is different
	Vehicle(String colours){

		this.colour = colours;

		}
	Vehicle(int wheels, String colours){
		this.wheels = wheels;
		this.colour = colours;
	}

	}

public class Constructor{

		public static void main(String[] args){

	
		Vehicle car = new Vehicle(4);
		Vehicle bike = new Vehicle("black");
		Vehicle brezza = new Vehicle(4,"White");

		System.out.println(car.wheels);
		System.out.println(bike.colour);
		System.out.println("Brezza has " + brezza.wheels + " wheels and " + brezza.colour + " colour.");
	}
	}