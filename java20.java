import java.util.Scanner;

public class java20 {
    public static void main(String[] args) {
        //int number =4;
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        String x=((number%2)==0) ?"even":"Odd";
        System.out.println(x);

    }
    
}
