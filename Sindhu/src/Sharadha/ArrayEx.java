package Sharadha;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7};
		int b[]= {2,4,6,8};
		int c[]=new int[a.length+b.length];
		int pos=0;
		for(int i=0;i<a.length;i++)
		{
			c[pos]=a[i];
			pos++;
			//c[i]=a[i]
		}
		for(int j=0;j<b.length;j++)
		{
			c[pos]=b[j];
			pos++;
			
		}
		for(int k:c)
			System.out.print(k+" ");

	}

}
