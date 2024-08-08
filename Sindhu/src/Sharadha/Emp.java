package Sharadha;

public class Emp {
	static String companyaddress= "HYD"
	int empid=101;
	String ename=101;
	static Emp obj=new Emp();
	static {
		//obj=new Emp();
		System.out.println("id:"+obj.empid);
		System.out.println("name:"+obj.ename);
		
	}
	public static void display()
	{
		System.out.println("companyaddress:"+companyaddress);
		System.out.println("id:"+obj.empid);
		System.out.println("name:"+obj.ename);
		
	}
	public static void main(String[] args)
	{
		System.out.println("Empid:"+obj.empid);
		System.out.println("Ename:"+obj.ename);
		display();
	}

}
