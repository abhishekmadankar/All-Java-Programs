class Student{

 int rollNo = 123;
 double marks =5.5;
 String name = "Abhishek";
}
class ObjectDemo{

  void display(Student stu){
	System.out.println(stu.rollNo);
	System.out.println(stu.marks);
	System.out.println(stu.name);
}

public static void main(String[] args){

Student st = new Student();
ObjectDemo ob = new ObjectDemo();
ob.display(st);
}
}