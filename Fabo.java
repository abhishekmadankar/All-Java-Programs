import java.util.*;
  
  public class Fabo{
  
  public static void main(String[] args) {
      // write your code here

		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();

		int first = 1 ; 
		int sec = 1 ;
		

		System.out.println(first);
		System.out.println(sec);		


		for(int i = 1 ; i<=n-2 ; i++){

		int m = first + sec ; 
		System.out.println(m);
		first = sec;
		sec = m ;
}


   }
  }