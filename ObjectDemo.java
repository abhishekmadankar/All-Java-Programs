class Student{

 int rollNo = 123,m1 = 60, m2 =70, m3 = 80;
 
}
class ObjectDemo{

  void calculate(Student stu){
	
	int sum = stu.m1 + stu.m2 + stu.m3;
	System.out.println(sum);
	int avg = sum/3;
	System.out.println(avg);



}

public static void main(String[] args){

Student st = new Student();
ObjectDemo ob = new ObjectDemo();
ob.calculate(st);
}
}