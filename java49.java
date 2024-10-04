import java.util.Scanner;

public class java49 {
    public static void printHelloWorld()//function create
    {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Yogesh PAtil");
    }

    public static void calculateSum(int a,int b)//the parameters which are written in defination of the function they are called parameters or formal parameters
    {
        
        int sum=a+b;
        System.out.println(sum);

    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        printHelloWorld();//function call
        calculateSum(a, b);//the value which is used while calling the function they are called arguments or actual parameters
        
       
    }

}
// returnType name()
// {
// body
// return statement
// }