package Singleinheritance;

class mathutility{
   int number;
   static int square(int number) {
	   return number*number;
   }
static int cube(int number2) {
	// TODO Auto-generated method stub
	return 0;
}
}
class calculator extends mathutility {
	static int cube(int number) {
		return number*square(number);
	}
}
public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=2;
		int squareresult=mathutility.square(number);
		System.out.println("square of the number:"+squareresult);
		int cuberesult=calculator.cube(number);
		System.out.println("cube of the number:"+cuberesult);

	}

}
