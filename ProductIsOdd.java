import java.util.Scanner;
public class ProductIsOdd {
    static void oddProduct(int[]arr)
    {
        int product =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                product= arr[i]*arr[j];
                if(product%2!=0&&i!=j)
                {
                    System.out.print((arr[i]+""+arr[j])+" ");
                    //System.out.println(arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements to be inserted in array->");
        int  n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("enter the elemenst in array=>");
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        oddProduct(arr);
    }
}