import java.util.Scanner;
public class FirstOccurence {
    static int fOccur(int arr[],int low,int high,int x)
    {
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x)
                high = mid-1;
            else if(arr[mid]<x)
                low = mid+1;
            else
            {
                if(mid==0||arr[mid]!=arr[mid-1])
                    return mid;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int low=0;
        int high = n-1;
        System.out.println("enter the element to be searched=");
        int x = sc.nextInt();
        int res =fOccur(arr,low,high,x);
        if(res==-1)
        {
            System.out.println("not found");
        }
        else
            System.out.println(res);
    }
}
