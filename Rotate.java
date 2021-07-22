import java.util.*;
import java.lang.Math;

public class Rotate{

	public static void main(String[] args){

	Scanner scr = new Scanner(System.in);
	
	int num = scr.nextInt();

	int rot = scr.nextInt();


	int temp = num;	
	int count = 0;
	
	while(temp!=0){
	
	temp = temp/10;
	count++;
		
	}
	//System.out.println(count);
	if(rot>count){
	rot = rot % count;
}

	if(rot < 0 ){
	    while(rot<0){

	rot = rot + count;
	    }
}

	int rem = num % (int)Math.pow(10,rot);
	//System.out.println(rem);

	int quo = num / (int)Math.pow(10,rot);
	//System.out.println(quo);

	int temp1 = quo;
	int counts = 0;
	while(temp1!=0){
	
	temp1 = temp1/10;
	counts++;
		
	}

	int nn = rem*(int)Math.pow(10,counts) + quo;

	System.out.println(nn);


	






}
}