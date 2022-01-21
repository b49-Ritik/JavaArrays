import java.util.Scanner;
public class MedianOfSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array=");
        int n= sc.nextInt();
        System.out.println("enter the size of second array=");
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        System.out.println("enter the first array=");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= sc.nextInt();
            
        }
        System.out.println("enter the second array=");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }
        int x= n+m;
        int arr3[] = new int[x];
        int pos=0;
        for(int items:arr1)
        {
            arr3[pos] = items;
            pos++;
        }
        for(int items:arr2)
        {
            arr3[pos]=items;
            pos++;
        }
        System.out.println("the merged array is=");
        for(int items:arr3)
        {
            System.out.println(items);
        }
        int count=0;
        for(int i=0;i<arr3.length;i++)
        {
           count++;
        }
        int low=0;
        int high=x-1;
        float median=0;
        int mid=(low+high)/2;
            if(count%2==0)
            {
                median = (arr3[mid]+arr3[mid+1])/2;
                System.out.println("%.2f"+median);
            }
            else{
                median = arr3[mid];
                System.out.println(median);
            }
    }
}
