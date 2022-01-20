import java.util.Scanner;
public class CheckEquality {
    static int Equal(int arr1[],int arr2[],int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr1[i]==arr2[i])
                return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements of array=");
        int n =sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("entere first array=");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
            
        }
        System.out.println("enter second array=");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]= sc.nextInt();
            
        }
        int res=Equal(arr1,arr2,n);
        if(res==-1)
        {
            System.out.println("arrays are not equal");
        }
        else
            System.out.println("arrays are  equal");
    }
}
