package Singleinheritance;

class Vehicle{
	void start() {
		System.out.println("vehicle starts");
	}
}
class car extends Vehicle{
	void drive() {
		System.out.println("car drives by the man");
	}
}
class SportsCar extends car{
	void accelerate() {
		System.out.println("sportscar accelerated in the race");
	}
}
public class Drive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar s=new SportsCar();
		s.start();
		s.drive();
		s.accelerate();

	}

}
