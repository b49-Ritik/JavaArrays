import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements to be inserted");
        int n =sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
            
        }
        for (int i = 0; i < n; i++) {
            int temp=0;
        
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp =arr[j];
                    arr[j]=  arr[i];
                    arr[i] = temp;
                    
                }
                
            }
        }
        System.out.println(arr[n-2]);
            
        }
}
