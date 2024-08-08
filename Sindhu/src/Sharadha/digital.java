package Sharadha;
import java.util.Scanner;

public class digital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char n = sc.nextLine().charAt(0);
		if(n>='A'&&n<='Z' ||  n>='a'&&n<='z') {
			System.out.println("character");
		}
		else if(n>='0'&&n<='9')
		{
         System.out.println("digital");
        
	}
	
		else
		{
			System.out.println("special character");
		}
}

}