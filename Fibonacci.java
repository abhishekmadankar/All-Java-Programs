class Fibonacci{

	int fib(int n){

	if((n==0) || (n==1)){

	return 1;
}
else

	return fib(n-1) + fib(n-2);
}

public static void main(String[] args){

	Fibonacci fs = new Fibonacci();
	for(int i = 0;i<=10;i++){
		int res = fs.fib(i);
		System.out.println("Fibonacci of "+i+" is "+res);
}
}
}
