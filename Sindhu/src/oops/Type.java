package oops;

abstract class Employee{
	String name;
	String company;
	String worktype;
	String work;
	Employee(String name,String company,String worktype,String work){
		this.name=name;
		this.company=company;
		this.worktype=worktype;
		this.work=work;
	}
	public void display_details() {
		System.out.println("name:"+name);
		System.out.println("company:"+company);
		System.out.println("worktype:"+worktype);
		System.out.println("work:"+work);
	}
	public abstract void Employee_work();
}
class manager extends Employee{
	manager(){
		super("sindhu","tcs","manager","workassign");
	}
	public void Employee_work() {
		System.out.println("manager assigns work");
	}
}
class intern extends Employee{
	intern(){
		super("laddu","hhgj","intern","training");
		
	}
	public void Employee_work() {
		System.out.println("intern trained by the manager");
	}
}
public class Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager m=new manager();
		m.Employee_work();
		m.display_details();
		intern i=new intern();
		i.Employee_work();
		i.display_details();

		
	}

}
