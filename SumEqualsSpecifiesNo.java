import java.util.Scanner;
public class SumEqualsSpecifiesNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        System.out.println("enter the specified elment=");
        int ele = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i+1;j<n;j++)
            {
                sum = arr[i]+arr[j];
                if(sum==ele&&i!=j)
                {
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}
