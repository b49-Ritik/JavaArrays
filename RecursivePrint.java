import java.util.Scanner;
public class RecursivePrint {
    static void f1(int n)
    {
        
        if(n!=0)
        {
            System.out.println(n);
            f1(n-1);
        }
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        f1(n);
    }
            
}
