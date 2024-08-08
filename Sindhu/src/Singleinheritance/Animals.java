package Singleinheritance;

class Animal{
	void eat() {
		System.out.println("animal eats meat");
	}
}
class dog extends Animal{
	void bark() {
		System.out.println("dog brak on road");
	}
}
class labardor extends dog{
	void displayColor() {
		System.out.println("it is in white color");
	}
}
public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		labardor l=new labardor();
		l.eat();
		l.bark();
		l.displayColor();

	}

}
