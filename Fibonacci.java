import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Fibonacci series up to" + n + "terms:");
        for(int i=0;i<n;i++){
            System.out.print(fib(i) + " ");

        }
        sc.close();
    }
         public static int fib(int n)
         {
             if(n<=1)
             {
             return n;
             }
             return fib(n-1)+fib(n-2);
        }
    
}
