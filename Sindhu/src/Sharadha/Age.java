package Sharadha;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age1:");
		int age1 = sc.nextInt();
		System.out.println("enter age2:");
		int age2 = sc.nextInt();
		System.out.println("enter age3:");
		int age3 = sc.nextInt();
		if(age1<age2&&age1<age3)
		{
			System.out.println("age1 is smaller");
		}
		else if(age2<age3)
		{
			System.out.println("age2 is smaller");
		}
		else
		{
			System.out.println("age3 is smaller");
		}
	}

}
