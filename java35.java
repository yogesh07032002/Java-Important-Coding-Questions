public class java35 {
    public static void main(String[] args) {
        int n=12345;
        int rev=0;
        while(n>0)
        {
            int lastDigit=n%10;
             rev=(rev*10)+lastDigit;
             n=n/10;
        }
        System.out.println(rev);
    }
    
}
