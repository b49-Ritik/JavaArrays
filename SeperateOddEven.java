import java.util.ArrayList;
import java.util.Scanner;
public class SeperateOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("enter no of rows");
            int n= sc.nextInt();
            System.out.println("enter no of columns-");
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            ArrayList<Integer>even =new ArrayList<Integer>();
            ArrayList<Integer>odd =new ArrayList<Integer>();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[i][j]%2==0)
                    {
                        even.add(arr[i][j]);
                    }
                    else
                    {
                       odd.add(arr[i][j]);
                    }
                }
            }
            System.out.println("the even array is-");
            for(int items:even)
            {
                System.out.println(items);
            }
            System.out.println("the odd array is-");
            for(int items:odd){
                System.out.println(items);
            }
            
    }
}
