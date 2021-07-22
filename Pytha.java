import java.util.*;


public class Pytha{

	public static void main(String[] args){

	Scanner scr = new Scanner(System.in);
	
	

	int a = scr.nextInt();


	int b = scr.nextInt();


	int c = scr.nextInt();
	
	int a1 = a * a;
	int b1 = b * b;
	int c1 = c * c;
	

	if(a1 + b1 > c1){
	
		if(b1 + c1 == a1){
			System.out.println("True");
					}	
		else{
			System.out.println("False");
			}
		}
	else{
		
		if(a1 + b1 == c1){
			System.out.println("True");
					}

		else{
			System.out.println("False");
					}
	      }

}
}

