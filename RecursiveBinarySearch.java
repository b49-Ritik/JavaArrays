import  java.util.Scanner;
public class RecursiveBinarySearch {
    static int bsearch(int arr[],int x,int low,int high ){
    {
        if(low>high)
            return -1;
    }
    int mid =(low+high)/2;
    if(arr[mid]==x)
    {
        return mid;
    }
    else if(arr[mid]>x)
        return bsearch(arr,x,low,mid-1);
    else
        return bsearch(arr,x,mid+1,high);
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
        int low=0;
        int high =n-1;
        int res =bsearch(arr,ele,low,high);
        if(res==-1)
        {
            System.out.println("element not found->");
        }
        else
            System.out.println("element found at index="+res);

}
    
}
