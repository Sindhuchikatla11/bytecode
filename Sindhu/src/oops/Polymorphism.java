package oops;

 class Worker{
	String name;
	String jobtype;
	public void Info(String name,String jobtype) {
		System.out.println("name:"+name);
		System.out.println("jobtype:"+jobtype);
	}
	public void Info(String Skill,int salary) {
		System.out.println("Skill:"+Skill);
		System.out.println("salary:"+salary);
	}
	public void Info(int age,String gender) {
		System.out.println("age:"+age);
		System.out.println("gender:"+gender);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w=new Worker();
		w.Info("sindhu","software");
		w.Info("java",50000);
		w.Info(21,"female");
	}

}
