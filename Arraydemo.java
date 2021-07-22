class Arraydemo{
	double getArray(double[] temp){
	double sum1 = 0.0;
	for(double x : temp){

	sum1 = x + sum1;

	
}
	return sum1;
}

public static void main(String[] args){

	Arraydemo ad = new Arraydemo();
	double[] abc = {1.5,2.5,3.5,4.5};
	double sum = ad.getArray(abc);
	System.out.println(sum);
}
}
	