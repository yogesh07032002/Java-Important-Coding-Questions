import java.util.*;
public class java38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter Your Number");
            int n=sc.nextInt();
            if(n%10==0)
            {
                break;
            }
            System.out.println(n);
        }while(true);

    }
    
}
