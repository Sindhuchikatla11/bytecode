package Singleinheritance;

class shape{
	void draw() {
		System.out.println("draw a shape");
	}
}
class circle extends shape{
	void drawcircle() {
		System.out.println("draw a circle");
	}
}
class Coloredcircle extends circle{
	void setColor(String color) {
		System.out.println("circle is in black color");
	}
}
public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coloredcircle c=new Coloredcircle();
		c.draw();
		c.drawcircle();
		c.setColor("black");

	}

}
