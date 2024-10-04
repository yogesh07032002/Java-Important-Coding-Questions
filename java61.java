import java.util.Scanner;
public class java61 {//exercise fnction and method
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the First No.");
        double x=sc.nextDouble();

        System.out.print("Enter the second No.");
        double y=sc.nextDouble();

        System.out.print("Enter the third No.");
        double z=sc.nextDouble();

        System.out.println("The avarage value is"+avarage(x,y,z)+"\n");
    }
    public static double avarage(double x,double y,double z)
    {
        return (x+y+z)/3;
    }
}
