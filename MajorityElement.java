import java.util.Scanner;
public class MajorityElement {
static int FindMajority(int arr[],int n)
{
    int res=0,count=1;
    for(int i=1;i<n;i++)
    {
        if(arr[res]==arr[i])
            count++;
        else 
            count--;
        if(count==0)
        {
            res=i;
            count=1;
        }
    }
    count=0;
    for(int i=0;i<n;i++)
    {
        if(arr[res]==arr[i])
            count++;
    }
    //System.out.println(arr[res]);
    if(count<=n/2)
    {
        res=-1;
    }
    return res;
}
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("enter no of elements of array=");
   int n = sc.nextInt();
   int arr[] = new int[n];
    System.out.println("enter the array=");
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }
    int res=FindMajority(arr,n);
    System.out.println("the majority element is="+arr[res]+"repeated times"+res);
}
    
}
