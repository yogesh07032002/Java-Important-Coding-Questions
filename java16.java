import java.util.Scanner;

public class java16 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        if(number%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
