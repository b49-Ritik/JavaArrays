import java.util.Scanner;
public class SumElement {
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of elements to be entered-");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the element ina array");
    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum+=arr[i];
    }
    System.out.println("the total is-"+sum);
}
}
