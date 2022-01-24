import java.util.Scanner;
public class RecursiveSearch {
    static int find(int arr[],int index,int x)
    {
        if(index==arr.length)
        {
            return -1;
        }
        else
        {
            if(arr[index]==x)
                return index;
            else
                return find(arr,index+1,x);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
            
        }
        int index=0;
        int x= sc.nextInt();
        int res=find(arr,index,x);
        if(res==-1)
        {
            System.out.println("not found");
        }
        else
            System.out.println(res);
    }
}
