import java.net.Socket;
import java.util.Scanner;

public class java64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer ");
        int digit=sc.nextInt();
        System.out.println("THe Sm is "+sumDigit(digit));
    }
public static int sumDigit(int n)
{
    int sumDigit=0;
    while (n>0) {
        int lastDigit=n%10;
        sumDigit+=lastDigit;
        n/=10;
        
    }
    return sumDigit;
} 
}
