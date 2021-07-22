import java.util.*;
import java.lang.Math;

public class Converts{

	public static void main(String[] args){


	Scanner scr = new Scanner(System.in);
	int num = scr.nextInt();
	int base = scr.nextInt();

	int n = 0;

	//int z = (int)Math.pow(num,base);
	//System.out.println(z);
	int i = 0;
	while(num>0){

		
		int a = num % base;
		num = num / base;
	
		n = n + a * (int)Math.pow(10,i);
		i++;
	
		}

	System.out.println(n);

	}
	}

		

