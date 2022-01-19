import java.util.Scanner;
public class RemoveElement {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("emter the no of elements");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to delete-");
        int ele = sc.nextInt();
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==ele)
                index =i;
        }
        for(int i=index;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        for(int i=0;i<n-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
