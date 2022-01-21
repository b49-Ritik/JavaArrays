import java.util.Scanner;
public class ConcatinateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements-");
        int n=sc.nextInt();
        System.out.println("enter the first array-");    
        int []arr = new int[n];
        int arr1[] = new int[n];
        int length = arr.length+arr1.length;
        int []arr2 = new int[length];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the second array-");
        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        int pos=0;
        for(int element :arr)
        {
            arr2[pos] = element;
            pos++;
        }
        for(int element : arr1)
        {
            arr2[pos] = element;
            pos++;
        }
        System.out.println("the array after merging is-");
        for(int items : arr2)
        {
            System.out.println(items);
        }
        
    }
}
