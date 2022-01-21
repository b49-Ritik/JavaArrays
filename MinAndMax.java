import java.util.Scanner;
public class MinAndMax {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of elements-");
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<n;i++)
    {
        if(arr[i]<min)
            min=arr[i];
        if(arr[i]>max)
            max=arr[i];
    }
    System.out.println("the minimum element is-");
    System.out.println(min);
    System.out.println("the maximum element is-");
    System.out.println(max);
} 
}
