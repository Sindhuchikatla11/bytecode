package Sharadha;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int currentsalary = sc.nextInt();
		int joiningsalary = sc.nextInt();
		if(currentsalary>joiningsalary)
		{
			System.out.println("bonus is approved");
		}
		else
		{
			System.out.println("rejected");
		}
	}

}
