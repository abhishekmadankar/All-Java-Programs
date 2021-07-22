import java.util.*;

public class Pf{

	public static void main(String[] args){

	Scanner scr = new Scanner(System.in);
	int num = scr.nextInt();

	for(int i = 2; i <= num/2 ; i++){


	if(num % i ==0){


		for(int k =2 ; k <= i/2; k++){

		if( i % k ==0){
		
		int count1=0;
		for(int l=2 ; l*l<=k ;l++){
	if(k % l ==0){
	count1++;
}
}
if(count1==0){
System.out.println(k);
}
}
}
		
		
		int count =0;
		for(int j=2 ; j*j<=i ; j++){

	
	if(i % j==0){

		count ++;
		}
	}

	if(count==0){
	System.out.println(i);
}
}
}
}
}

	

			


			