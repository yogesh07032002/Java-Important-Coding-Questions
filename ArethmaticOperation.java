import java.util.*;
public class ArethmaticOperation {
  void add(int a,int b) {
	  int c=a+b;
	  System.out.println(c);
  }
  void sub(int a,int b) {
	  int c=a-b;
	  System.out.println(c);
	  
  }
  void mul(int a,int b) {
	  int c=a*b;
	  System.out.println(c);
	  
  }
  void div(int a,int b) {
	  int c=a/b;
	  System.out.println(c);
  }
  void mod(int a,int b) {
	  int c=a%b;
	  System.out.println(c);
  }
  void area(int l,int b) {
	  int c=l*b;
	  System.out.println(c);
  }
  void perimeter(int l,int b) {
	  int c=2*(l+b);
	  System.out.println(c);
  }
 public static void main(String args[])
 {
	 ArethmaticOperation AO=new ArethmaticOperation();
	 AO.add(10, 20);
	 AO.sub(20,10);
	 AO.mul(2, 30);
	 AO.div(10, 2);
	 AO.area(5, 10);
	 AO.perimeter(2, 3);
	 AO.mod(22, 10);
 }
  
  
}
