package Singleinheritance;

class Person {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void displayInfo() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
}
}
 class studentn extends Person{
	 int rollnumber=3456688;
	 studentn(String name,int age){
		 super("sindhu",21);
	 }
	 void displaystudentInfo() {
		 System.out.println("rollnumber:"+rollnumber);
	 }
 }

public class Info {

	public static void main(String[] args) {
		studentn s=new studentn("sindhu",21);
		s.displayInfo();
		s.displaystudentInfo();

	}
}




