package Sharadha;
import java.util.Scanner;
public class Numbber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter saleprice:");
		double saleprice = sc.nextDouble();
		System.out.println("enter cost");
		double cost= sc.nextDouble();
		if(saleprice>cost)
		{
			double profit=saleprice-cost;
			System.out.println("profit");
		}
		else if(cost>saleprice)
		{
			double loss = cost-saleprice;
			System.out.println("loss");
			
		}
		else
		{
			System.out.println("profit or loss");
		}
    
	}

}
