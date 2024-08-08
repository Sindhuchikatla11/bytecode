package Sharadha;
import java.util.Scanner;
public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character");
		char ch = sc.nextLine().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("uppercase");
		}
		else if(ch>='a'&&ch<='z')
		{
			System.out.println("lowercase");
		}
		else
		{
			System.out.println("invalid");
		}
	}

}
