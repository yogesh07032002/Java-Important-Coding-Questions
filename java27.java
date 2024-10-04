import java.util.Scanner;//see on google.

public class java27 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter year");

      int year=sc.nextInt();

      boolean x=(year%4)==0;
      boolean y=(year%100)!=0;
      boolean z=((year%100==0)&&(year%400==0));

      if(x&&(y||z))
      {
        System.out.println("leap");

      }
      else{
        System.out.println("Not Leap");
      }

    }
    
}
