public class java34 {
    //for gettting last number=num%10
    //for remove last digit number=num/10
    public static void main(String args[])
    {
        int n=123456789;
        while(n>0)
        {
            int lastDigit=n%10;
            System.out.print(lastDigit +" ");
            n=n/10;
        }
        System.out.println();
    }
    
}
