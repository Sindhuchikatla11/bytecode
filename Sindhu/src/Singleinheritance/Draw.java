package Singleinheritance;

class shape{
	void draw() {
		System.out.println("drawing a shape");
	}
}
class circleee extends shape {
	void drawCircleee() {
		System.out.println("drawing a circle");
	}
}

public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circleee c=new circleee();
		c.draw();
		c.drawCircleee();
		

	}

}
