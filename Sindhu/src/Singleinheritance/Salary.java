package Singleinheritance;

 class Employee {
	 String name;
	 int empid;
	 int basicsalary;
	 Employee(String name,int empid,int basicsalary){
		 this.name=name;
		 this.empid=empid;
		 this.basicsalary=basicsalary;
	 }
	 void displayEmployeedetails() {
		 System.out.println("employee name:"+name);
		 System.out.println("employee id:"+empid);
		 System.out.println("basicsalary:"+basicsalary);
	 }
 }
 class income extends Employee {
	 double emi;
	 double home_expenditure;
	 double loans;
	 double totalsalary;
	 income(String name,int empid,int basicsalary){
		 super(name,empid,basicsalary);
	 }
	 void calculateSalary() {
		 emi=0.1*basicsalary;
		 home_expenditure=0.3*basicsalary;
		 loans=0.2*basicsalary;
		 totalsalary=basicsalary+emi+home_expenditure+loans;
		 
	 }
	 void displaySalarydetails() {
		 calculateSalary();
		 displayEmployeedetails();
		 System.out.println("emi:"+emi);
		 System.out.println("home_expenditure:"+home_expenditure);
		 System.out.println("loans:"+loans);
		 System.out.println("totalsalary:"+totalsalary);
	 }
	 
 }
 
 public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 income i=new income("sindhuja",102003, 50000);
			
			i.displaySalarydetails();
			
		
			
  }

}
