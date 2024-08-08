package Sharadha;
import java.util.Scanner;
public class Current {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("enter units");
    int units = sc.nextInt();
    if(units<=100)
    {
    	units = units*5;
    	System.out.println(units);
    }
    else if(units<=100&&units>=200)
    {
    	units = units*7;
    	System.out.println(units);
    }
    else if(units<=200)
    {
    	units = units*15;
    	System.out.println(units);
    	
    }
    else
    {
    	System.out.println("invalid");
    }
	}

}
