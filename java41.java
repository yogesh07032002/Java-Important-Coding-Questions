import java.util.Scanner;

public class java41 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        boolean isPrime=true;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)//n is the multiple of that no which is not 1 or n
            {
                isPrime=false;
            }
        }
        if(isPrime==true)
        {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
    
}
