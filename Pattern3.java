import java.util.*;

   public class Pattern3{

	public static void main(String[] args){

		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		int a = num-1;
		for(int i = 1 ; i<=num ; i++){
			
				for(int k = a; k > 0 ; k--){
					System.out.print("	");
						}
				for(int j = 1 ; j <= i ; j++){
				System.out.print("*	");

					}
				System.out.println(" ");
				a--;
}
}
}
				