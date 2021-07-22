import java.util.*;

public class Main{

	public static void Find(String[] args){

		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i<n;i++){
		
			arr[i] = scr.nextInt();
		
		}

		int num = scr.nextInt();
		int c = 0;
		
		 for(int j = 0 ; j<n ; j++){
	
			if(arr[j] == num){
				System.out.println(j);
				c++;
				break;
				}
			
		}
		if(c==0){
		    
		    System.out.println(-1);
		}
		
		
			
}
}

