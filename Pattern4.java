import java.util.*;

	public class Pattern4{

		public static void main(String[] args){


	Scanner scr = new Scanner(System.in);
	int n = scr.nextInt();
	int num = n;
	for(int i = 1 ; i <= n ; i++){

	
		for(int j = 1 ; j < i ; j++){

			System.out.print(" ");
			
			}
		for(int k = num ; k>0 ; k--){
			System.out.print("*");
			
			}
		num--;
		System.out.println(" ");
}
}
}