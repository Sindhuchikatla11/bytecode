package Sharadha;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,2,3,4,5,6,7,8,9,10};
		int size=arr.length;
		System.out.println("odd number are:");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==1) {
				System.out.println(arr[i]+" ");
			}	}
			System.out.println("even numbers are:");
		for(int j=0;j<size;j++)
			{
				if(arr[j]%2==0) {
					System.out.println(arr[j]+" ");
				}
			}
		
	

	}

}
