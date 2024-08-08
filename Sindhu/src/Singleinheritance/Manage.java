package Singleinheritance;

class person{
	String name;
	person(String name){
        this.name=name;
	}
	 void displayInfo() {
		 System.out.println("name:"+name);
	 }
}
class Employee extends person{
	int salary=300000;
	Employee(String name){
		super("name");
	}
	void displaySalary() {
		System.out.println("salary:"+salary);
	}
}
class Manager extends Employee{
	String department="software";
	Manager(String name){
		super("salary");
	}
	void displaydepartment() {
		System.out.println("department:"+department);
	}
}
public class Manage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager("sindhu");
		m.displayInfo();
		m.displaySalary();
		m.displaydepartment();

	}

}
