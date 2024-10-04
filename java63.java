import java.util.Scanner;;
public class java63 {
    public static void main(String args[])
    {
        System.out.println("Please Enter the No");
        Scanner sc=new Scanner(System.in);

        int palindrome=sc.nextInt();
        
        if(isPalindrome(palindrome))
        {
            System.out.println(palindrome+"is pallindrome");

        }
        else{
            System.out.println(palindrome+"is not palindrome");
        }
        
    }
    public static boolean isPalindrome(int n)
    {
        int palindrome=n;
        int reverse=0;

        while(palindrome!=0)
        {
            int remainder=palindrome%10;
            reverse=reverse*10+remainder;
            palindrome=palindrome/10;
        }
        if(reverse==n)
        {
            return true;

        }
        else{
        return false;
        }
    }
    
}
