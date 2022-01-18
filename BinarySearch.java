import java.util.Scanner;
public class BinarySearch {
    static int bsearch(int arr[],int n,int ele)
    {
        int low = 0,high=n-1;
        while(low<=high)
        {
            int mid = (low +high)/2;
            if(arr[mid]==ele)
                return mid;
            else if(arr[mid]>ele)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements of array->");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to be searched->");
        int ele = sc.nextInt();
        int res =bsearch(arr,n,ele);
        if(res==-1)
        {
            System.out.println("element not found->");
        }
        else
            System.out.println("element found at index="+res);
    }    
}
