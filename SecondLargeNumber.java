import java.util.Scanner;
public class SecondLargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements of array-");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        int highest = Integer.MIN_VALUE;
        int secondhighest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>highest)
            {
                secondhighest = highest;
                highest =arr[i];
            }
            if(arr[i]<highest&&arr[i]>secondhighest)
            {
                secondhighest = arr[i];
            }
        }
        System.out.println("the second largest element is-"+secondhighest);
    }
}
