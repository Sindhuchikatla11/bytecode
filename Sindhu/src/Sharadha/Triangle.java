package Sharadha;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the angles");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b>c&&b+c>a&&a+c>b)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("not valid");
		}
	}

}
