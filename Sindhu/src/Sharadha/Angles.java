package Sharadha;
import java.util.Scanner;
public class Angles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of side1:");
		int side1 = sc.nextInt();
		System.out.println("enter the length of side2:");
		int side2= sc.nextInt();
		System.out.println("enter the length of side3:");
		int side3= sc.nextInt();
		if(side1==side2&&side2==side3)
		{
			System.out.println("equaliteral triangle");
	}
		else if(side1==side2||side2==side3||side3==side1)
		{
			System.out.println("isosceles triangle");
		}
		else
		{
			System.out.println("scalene triangle");
		}
		
}
}