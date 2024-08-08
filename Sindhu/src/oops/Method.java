package oops;

abstract class Vehicle{
	String name;
	String model;
	Vehicle(String name,String model){
		this.name=name;
		this.model=model;
	}
	public void display_details() {
		System.out.println("name:"+name);
		System.out.println("model:"+model);
	}
	public abstract void Vehicle_feature();
}
class car extends Vehicle{
	car(){
		super("swift","a");
	}
	public void Vehicle_feature() {
		System.out.println("car has high speed capacity");
	}
}
class bike extends Vehicle{
	bike(){
		super("royal","b");
	}
	public void Vehicle_feature() {
		System.out.println("bike has high recovery");
	}
}
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    car obj=new car();
    obj.Vehicle_feature();
    obj.display_details();
    bike obj1=new bike();
    obj1.Vehicle_feature();
    obj1.display_details();
	}

}
