public class Java50 {
    public static void swap(int a,int b)
    {
         a=10;
         b=20;

         int temp=a;
         a=b;
         b=temp;

         System.out.println("a ="+a);
         System.out.println("b ="+b);

    }
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        swap(a,b);

    }
    
}
//java always works on call by value
//call by value means the value which is created int function which is print in functin then it gives change output but if we print the value in the in the main function then value print as it is which is define in the main function
//eg. use sout in main function the see the result change before and after.
//cALL BY VALUE MEANS ONLY COPY OF ORGINAL
//CALL BY REFERENCE MEANS ORIGINAL VALUE GIVEN.