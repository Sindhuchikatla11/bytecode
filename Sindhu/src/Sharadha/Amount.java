package Sharadha;
import java.util.Scanner;
public class Amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int note500, note200, note100, note50, note20, note10, note5, note2, note1;
         note500=note200=note100=note50=note20=note10=note5=note2=note1=0;
         if(amount>500)
         {
        	 note500=amount/500;
        	 amount-=note500*500;
        	 System.out.println("note500:"+note500);
         }
         if(amount>200)
         {
        	 note200=amount/200;
        	 amount-=note200*200;
        	 System.out.println("note200:"+note200);
         }
         if(amount>100)
         {
        	 note100=amount/100;
        	 amount-=note100*100;
        	 System.out.println("note100:"+note100);
         }
         if(amount>50)
         {
        	 note50=amount/50;
        	 amount-=note50*50;
        	 System.out.println("note50:"+note50);
        	 
         }
         if(amount>20)
         {
        	 note20=amount/20;
        	 amount-=note20*20;
        	 System.out.println("note20:"+note20);
        	 
         }
         if(amount>10)
         {
        	 note10=amount/10;
        	 amount-=note10*10;
        	 System.out.println("note10:"+note10);
        	 
         }
         if(amount>5)
         {
        	 note5=amount/5;
        	 amount-=note5*5;
        	 System.out.println("note5:"+note5);
         }
         if(amount>2)
         {
        	 note2=amount/2;
        	 amount-=note2*2;
        	 System.out.println("note2:"+note2);
         }
         if(amount>1)
         {
        	 note1=amount/1;
        	 amount-=note1*1;
        	 System.out.println("note1:"+note1);
         }
        

	}

}
