package Sharadha;
import java.util.Scanner;


public class vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter your character");
		char ch = sc.nextLine().charAt(0);
		if((ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
		{
			System.out.println("vowel");
			
		}
		else
		{
			System.out.println("not vowel");
		}
sc.close();
	}

}
