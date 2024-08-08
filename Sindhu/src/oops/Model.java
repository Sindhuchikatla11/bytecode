package oops;

interface shape{
	public void display();
}
class circle{
	public void show()
	{
		System.out.println("show circle");
	}
}
class square extends circle implements shape {
	public void display()
	{
		System.out.println("display square");
	}
}
class cube extends square implements shape{
	public void draw()
	{
		System.out.println("draw cube");
	}
}
public class Model {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   cube obj=new cube();
	   obj.draw();
	   obj.display();
	   obj.show();
       
	}

}
