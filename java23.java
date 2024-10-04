import java.util.Scanner;

public class java23 {//wrong next rivision check on google.
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operator=sc.next().charAt(0);
        switch(operator)
        {
            case 1: System.out.println(a+b);
            break;

            case 2: System.out.println(a-b);
            break;

            case 3: System.out.println(a*b);
            break;

            case 4: System.out.println(a/b);
            break;

            case 5:System.out.println(a%b);
        }

    }

}
