package oops;

 class person{
	private String name;
	private int age;
	public person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getname() {
		return name;
	}
	public int setage() {
		return age;
	}
	public void display_Info() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p= new person("sindhu",21);
		p.display_Info();

	}

}
