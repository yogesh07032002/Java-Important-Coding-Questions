import java.util.Scanner;

public class java18 {
  

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Income=sc.nextInt();
        int tax=0;
        if(Income<500000)
        {
            System.out.println("0% tax");
    
        }
        else if(Income>=500000&&Income<=1000000)
        {
            tax= (int) (Income*0.2);
            System.out.println(tax);
        }
        else{
            tax=  (int) (Income*0.3);
            System.out.println(tax);
        }
        
    }
    
}
