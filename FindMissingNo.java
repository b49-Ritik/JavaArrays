//array must be sorted 
import java.util.Scanner;
public class FindMissingNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements of array=");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array=");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        int s = arr[0];
        int l = arr[n-1];
        int sum1=0,sum2=0;
        for(int i=s;i<=l;i++)
        {
            sum1 = sum1+i;
        }
        for(int i=0;i<n;i++)
        {
            sum2 = sum2+arr[i];
        }
        System.out.println("the missing no is="+(sum1-sum2));
    }
}
