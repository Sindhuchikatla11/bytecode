package Constructors;

public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void introduce() {
		System.out.println("hello,my name is "+name +"and am " + age +"year old.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a=new Person("sindhuja",21);
		a.introduce();

	}

}
