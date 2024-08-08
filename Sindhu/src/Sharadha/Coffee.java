package Sharadha;

public class Coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String coffeesize="medium";
		int price = 0;
		switch(coffeesize) {
		case "small":
			System.out.println("price 50");
			break;
		case "medium":
			System.out.println("price 100");
			break;
		case "large":
			System.out.println("price 200");
			break;
		default:
			System.out.println("no coffee");
		}
		
		{
	if(price==100)
	{
		System.out.println("coffeesize");
	}

	}
}
}