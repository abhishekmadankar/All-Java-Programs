import java.util.*;

public class Span{

	public static void main(String[] args){

		Scanner scr = new Scanner(System.in);

		int num = scr.nextInt();
		int[] arr;
		arr = new int[num];

		for(int i = 0 ; i < num ; i++){

		arr[i]=scr.nextInt();
		
		}

	int big,small;
	
	big = small = arr[0];

	for(int j=0;j<num ;j++){

		if(arr[j]>big){
			big = arr[j];
		}
		if(arr[j]<small){
			small = arr[j];
		}

		}
	int ans = big-small;
	



		System.out.println(ans);



}
}
		