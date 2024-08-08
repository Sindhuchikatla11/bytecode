package Exam;
import java.util.Scanner;
public class Recharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int currentbalance = sc.nextInt();
		int recharge = 299;
		if(currentbalance>recharge)
		{
			System.out.println("the recharge done");
		}
		else if(recharge>currentbalance)
		{
			System.out.println("the recharge was not done");
		}
		else
		{
			System.out.println("invalid");
		}

	}

}
