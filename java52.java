public class java52 {
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    
}//multiplication always start with 1 .beacuse the if we multiply with the 0 the which we get is always zero;
