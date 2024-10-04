public class java56 {
    public static boolean isPrime(int n)
    {
        if(n==1)
        {
            System.out.println("Not Prime Nor Compooste");
        }
        else if(n==2)
        {
          return true;
        }
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void isPrimeRenge(int n)//for calculating the range of no from 1 to n
    {
        for(int i=2;i<n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        System.out.println(isPrime(1));
        isPrimeRenge(20);


    }
}
