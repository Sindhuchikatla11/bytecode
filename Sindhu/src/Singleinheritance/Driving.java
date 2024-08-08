package Singleinheritance;

class vehicle {
	String type="generic vehicle";
	void displayType() {
		System.out.println("vehicle type:"+type);
	}
	
}
class car extends vehicle {
	String type = "swift";
	void displaycarType() {
		System.out.println("car type:"+type);
	}
}

public class Driving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	car c=new car();
	c.displayType();
	c.displaycarType();

	}

}
