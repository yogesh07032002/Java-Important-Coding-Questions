public class java45 {//patterns
    public static void main(String args[])
    {
        for(int line=1;line<=4;line++)
        {
            for(int star=1;star<=line;star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
//trick to solve pattern
//1.no of lines-outer loop
//2.no of star or no of char print-inner loop
//3.what print