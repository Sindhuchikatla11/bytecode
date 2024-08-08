package Sharadha;
import java.util.Scanner;
public class Index {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)   {
        	
              System.out.println("Enter the Values ");
              arr[i] = sc.nextInt();
    }
    int result[] = new int[size];
int evenindex = 0;
int oddindex =1;
int zeroindex =size-1;
for(int i=0;i<size;i++)
if (arr[i]==0) {
    result[zeroindex]=0;
    zeroindex --;
}
else if(arr[i]%2==0){
    if (evenindex<size) {
        result[evenindex]=arr[i];
        evenindex+=2;
    }
    else{
      result[zeroindex]=arr[i];
      zeroindex--;
    }
}
else{
   if (oddindex<size) {
    result[oddindex]=arr[i];
    oddindex+=2;
   }
   else{
    result[zeroindex]=arr[i];
    zeroindex--;
   }
}
System.out.println("The rearranged array is:");
for (int i = 0; i < size; i++) {
    System.out.println("Index " + i + ": " + result[i]);
}
    sc.close();

 }
}