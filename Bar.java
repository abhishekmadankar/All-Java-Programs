//Bar Chart


import java.util.*;

public class Bar{

		public static void main(String[] args){

			Scanner scr = new Scanner(System.in);
			int num = scr.nextInt();

			int[] arr = new int[num];
	
			for(int i = 0 ; i<num ; i++){

				arr[i] = scr.nextInt();

				}

			int high = 0;

			high = arr[0];

			for(int j = 0 ; j < num; j++){

				if(arr[j] > high){

					high = arr[j];
	
					}

                                   }
		int temp = high;

	
			for(int k = 0; k < num ; k++){

				for(int l = high; l > 0 ; l--){


					if(temp - arr[k] > 0){

						System.out.println(" ");
						}

					if(temp - arr[k] <= 0 ){

						System.out.println("*");
						}
					}
						System.out.println("\n");
				}

}
}







				