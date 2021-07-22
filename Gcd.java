import java.util.*;

public class Gcd{

	public static void main(String[] args){


	Scanner scr = new Scanner(System.in);
	int num1 = scr.nextInt();
	int num2 = scr.nextInt();
	int gc = 0;
	int i ;
	int j ;
	int lc = 0;
	int lcm1;
	int lcm2;
	int p;
	int temp;
	int temps=0;

	if(num1 < num2){
	temp = num1;
}
	else{
	temp = num2;
}



	for( i=1 ; i <= temp ; i++){
	
	if(num1 % i==0 && num2 % i ==0){
	
	gc++;
	temps = i;

	}
	
	}


	int p1 = temps ;
	if(gc==1){
	System.out.println(gc);
	}else{
	 p = temps ;
	System.out.println(p);
	
	
	}



	int a = num1 * num2;
	if(gc==1){
		lcm1 = a/gc;
		System.out.println(lcm1);
}
	else{

		lcm2 = a/p1;
		System.out.println(lcm2);
}
		
	



}
}

	

