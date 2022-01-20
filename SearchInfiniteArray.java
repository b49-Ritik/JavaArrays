import java.util.Scanner;
public class SearchInfiniteArray {
    static int binarySearch(int arr[],int x,int low,int high)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
    static int InfiniteArray(int arr[],int x)
    {
        if(arr[0]==x)
            return 0;
        int i=1;
        while(arr[i]<x){
            i = i*2;
            if(arr[i]==x)
                return i;
        }
        return binarySearch(arr,x,i/2+1,i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements in array=");
        int n =sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        System.out.println("enter the element to be searched=");
        int x = sc.nextInt();
        int res = InfiniteArray(arr,x);
        if(res==-1)
        {
            System.out.println("element not found");
        }
        else
            System.out.println("element found at index"+res);
       
    }
}
