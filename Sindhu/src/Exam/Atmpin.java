package Exam;
import java.util.Scanner;
public class Atmpin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int correctPin = 1234;
		boolean accessGranted = false;
		System.out.println("Enter ATM PIN Number:");
		while(!accessGranted)
		{
			System.out.print("Enter PIN:");
			int enteredPin= sc.nextInt();
		}
		
		if(enteredPin.equals(correctPin))
		{
			accessGranted= true;
			System.out.println("PIN Accepted Access Granted");
			
		}
		
		else
		{
			System.out.println("invalid");
		}
		
		

	}

}
