package Sharadha;
import java.util.Scanner;
public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int weekday = sc.nextInt();
		String s="weekday";
		switch(weekday) {
		case 1:
		   System.out.println("sunday");
		   break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
			default:
				System.out.println("default case");
	}
	
		

	}

}
