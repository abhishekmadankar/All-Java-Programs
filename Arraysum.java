import java.util.*;

public class Arraysum{

		public static void main(String[] args){

			Scanner scr = new Scanner(System.in);
			int num1 = scr.nextInt();
			int[] arr1 = new int[num1];
			

			


			for(int i = 0 ; i < num1 ; i++){

		
				arr1[i] = scr.nextInt();

					
					}

			
			int num2 = scr.nextInt();
			int[] arr2 = new int[num2];

			for(int j = 0 ; j < num2 ; j++){

		
				arr2[j] = scr.nextInt();

					
					}
			int k = 0;

			if(num2 >= num1){
			k=num2;
				}
			if(num1 > num2){
			k=num1;
			}
			
			//System.out.println(k);


			int[] sum = new int[k];
			int y = 0;	
			for(int l = k ; l>0 ; l--){

			if(num1 == 0){
				num1 = 1;
				arr1[num1-1] = 0;
					}
			if(num2 == 0){
				num2 = 1;
				arr2[num2-1] = 0;
					}
			
			sum[y] = arr1[num1-1] + arr2[num2-1];
			//sum = arr1[num1-1] + arr2[num2-1];
			//System.out.println(sum);
			num1 = num1 - 1;
			num2 = num2 - 1;
			y=y+1;
			
			}

			for(int z = y-1; z >=0 ; z--){
				System.out.println(sum[z]);
			}

}
}
 			


				

			