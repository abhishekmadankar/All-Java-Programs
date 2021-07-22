class Parent{
	final void msg(){
System.out.println("We are listening");
}
}
class Child extends Parent{
void msg(){
System.out.println("We are crying");
}}

public static void main(String[] args){

Child a = new Child();
a.msg();