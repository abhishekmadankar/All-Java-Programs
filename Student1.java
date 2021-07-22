class Student1{

int rollNo;

Student1(int x){

rollNo = x;
}

void display(){

System.out.println(rollNo);
}

public static void main(String[] args){
Student1 s1 = new Student1(12);
s1.display();
Student1 s2 = new Student1(130);
s2.display();
}
 }