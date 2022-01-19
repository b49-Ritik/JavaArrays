import java.util.Scanner;
public class ReverseArray {
public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
    System.out.println("enter the no of element-");
    int n =sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(int i=n-1;i>=0;i--)
    {
        System.out.println(arr[i]);
    }
    
}
    
}
