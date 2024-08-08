package oops;

class Animal {
	String name;
	int age;
	Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
      void displaygetDetails() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
class Mammal extends Animal{
	String name="dog";
	int age=5;
	Mammal(String name,int age){
		super("dog",5);
	}
	void diplayMammalInfo() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
class Bird extends Animal{
	String name="parrot";
	int age=9;
	Bird(String name,int age){
		super("parrot",9);
	}
	void displayBirdInfo() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
class Fish extends Animal{
	String name="whale";
	int age=20;
	Fish(String name,int age){
		super("whale",20);
	}
	void displayFishInfo() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}

public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal m=new Mammal("dog",5);
		Bird b=new Bird("parrot",9);
		Fish f=new Fish("whale",20);
		m.displaygetDetails();
		m.diplayMammalInfo();
		b.displayBirdInfo();
		f.displayFishInfo();
		

	}

}
