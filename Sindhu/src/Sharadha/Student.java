package Sharadha;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total_marks=600;
		int telugu = sc.nextInt();
		int hindi = sc.nextInt();
		int english = sc.nextInt();
		int maths = sc.nextInt();
		int science = sc.nextInt();
		int social = sc.nextInt();
	    double result;
	    result=(double)(telugu+hindi+english+maths+science+social)/total_marks;
	    result*=100;
	    System.out.println("result:"+result);
	    if(result>=90)
	    {
	    	System.out.println("O");
	    }
	    else if(result>=80)
	    {
	    	System.out.println("A+");
	    }
	    else if(result>=70)
	    {
	    	System.out.println("A");
	    }
	    else if(result>=60)
	    {
	    	System.out.println("B+");
	    }
	    else if(result>=50)
	    {
	    	System.out.println("B");
	    }
	    else if(result>=40)
	    {
	    	System.out.println("C");
	    }
	    else 
	    {
	    	System.out.println("fail");
	    }
	  
	    }
	

}
