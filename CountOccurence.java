import java.util.Scanner;
public class CountOccurence {
    static int Loccurence(int arr[],int low,int high,int x,int n)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x)
                high = mid-1;
            else if(arr[mid]<x)
                low = mid+1;
            else
            {
                if(mid==n-1||arr[mid]!=arr[mid+1])
                    return mid;
                else
                    low = mid+1;
            }
        }
        return -1;
    }
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
    static int CountOccurence(int arr[],int low,int high,int n,int x)
    {
       int f = fOccur(arr,low,high,x); 
       if(f==-1)
           return 0;
       else
           return (Loccurence(arr,low,high,x,n)-f+1);
    }

    public static void main(String[] args) {
   Scanner sc  = new Scanner(System.in);
        System.out.println("enter the no of elements to be inserted in array=>");
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to be searched=");
        int x = sc.nextInt();
        int low=0;
        int high =n-1;
        int c= CountOccurence(arr,low,high,n,x);
        if(c==-1)
        {
            System.out.println("no repeating element=");
        }
        else
            System.out.println(" Total ocuurence are="+c);
        int first = fOccur(arr,low,high,x);
        if(first==-1)
            System.out.println("element no found");
        else
            System.out.println("the first occurence of the repeating element is="+first);
        int last =Loccurence(arr,low,high,x,n);
        if(last==-1)
            System.out.println("not found");
        else
            System.out.println("the last index of the repeating element is="+last);
}
    
}
