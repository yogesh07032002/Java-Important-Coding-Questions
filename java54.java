public class java54 {
    //methods are of two types user defined and inbuiled methods.
    //function overloading=multiple functions with same name but different parameters and function overloading depent only on the parameters not on the return type of the statement.
    public static int sum(int a,int b)
    {
        return a+b;
    }

    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        int r1=sum(10,20);
        int r2=sum(10,30,50);
        System.out.println("The Sum of two No is "+r1);
        System.out.println("The sum of three no is "+r2);
    }
    
}
