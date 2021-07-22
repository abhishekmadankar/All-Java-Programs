import java.util.*;

public class Reverse{

	public static void main(String[] args){

		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
	
		while(n!=0){

		int digit = n%10;
		System.out.println(digit);
		n=n/10;
		
		}
		
		
}
}