import java.util.Scanner;
public class java62 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no;
        System.out.println("Enter an integer");
        no=sc.nextInt();

        if(isEven(no))
        {
            System.out.print("No is even");
        }
        else{
            System.out.println("No is odd");
        }
    }
    public static boolean isEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }

        else{
            return false;
        }
        
    }
    
}
