package Singleinheritance;

 class RectangleArea {
	 int length;
	 int breadth;
	 RectangleArea(int length,int breadth){
		 this.length=length;
		 this.breadth=breadth;
	 }
}
 class Area extends RectangleArea
 {
	 Area(int length,int breadth){
		 super(length,breadth);
	 }
	 int calculateArea() {
		 return length*breadth;
	 }
 }
 public class Rectangle{
	 public static void main(String[] args) {
		 Area a= new Area(7,10);
		 int area=a.calculateArea();
		 System.out.println("the area of the rectangle is :"+area);
	 }
 }
