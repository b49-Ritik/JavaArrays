import java.util.Scanner;
public class SecondSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements-");
        int n = sc.nextInt();
        System.out.println("enter the array-");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest)
            {
                secondsmallest = smallest;
                smallest = arr[i];
            }
            if(arr[i]>smallest&&arr[i]<secondsmallest)
            {
                secondsmallest = arr[i];
            }
        }
        System.out.println("the second smallest element is-"+secondsmallest);
    }
}
