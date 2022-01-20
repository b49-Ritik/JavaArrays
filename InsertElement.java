import java.util.Scanner;
public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the no of elements-");
        int n=sc.nextInt();
        int []arr = new int[n+1];
        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        System.out.println("enter the element-");
        int ele =sc.nextInt();
        System.out.println("enter the position at which element to be inserted-");
        int pos = sc.nextInt();
        int index = pos-1;
        for(int i=n-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=ele;
        for(int i=0;i<=n;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}
