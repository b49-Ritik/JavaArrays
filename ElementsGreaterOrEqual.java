import java.util.ArrayList;
import java.util.Scanner;
public class ElementsGreaterOrEqual {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of elements to be inserted in array=>");
        int n=sc.nextInt();
        int myArray1[] = new int[n];
        int myArray2[] = new int[n];
        ArrayList<Integer>out = new ArrayList<Integer>();
        System.out.println("enter first array=>");
        for(int i=0;i<n;i++)
        {
            myArray1[i] = sc.nextInt();
        }
        System.out.println("enter second array=>");
        for(int i=0;i<n;i++)
        {
            myArray2[i] = sc.nextInt();
        }
        System.out.println("the output is=>");
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(myArray2[j]>=myArray1[i])
                {
                    count++;
                   
                }
                //out.add(count);
                
            }
            out.add(count);
        }
        System.out.println(out);
    }
}
