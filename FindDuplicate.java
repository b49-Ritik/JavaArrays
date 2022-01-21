import java.util.Scanner;
public class FindDuplicate {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("enter thr elements of array-");
    int n=sc.nextInt();
    int []arr= new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int count =0;
    System.out.println("the duplicate elements are-");
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j]&&i!=j)
                System.out.println(arr[j]);
        }    
        }
    }
}
    
