import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.println(input);
        
        String name=sc.nextLine();//for full name copy with space
        System.out.println(name);

        int number =sc.nextInt();
        System.out.println(number);

        float price=sc.nextFloat();
        System.out.println(price);

        double x=sc.nextDouble();
        System.out.println(x);

        boolean value=sc.nextBoolean();
        System.out.println(value);


    }
}
