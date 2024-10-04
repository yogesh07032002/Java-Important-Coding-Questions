public class java57 {//remening code wrong see videos again.1.bintodec & dectobin
    public static void decToBin(int n) {
        int pow = 0;
       int  myNo=n;
        int binNo = 0;

        while (n > 0) {
            int rem = n % 2;
            binNo = binNo * (rem * (int) Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of the no is "+myNo+"="+binNo);
    }

    public static void main(String args[]) {
         decToBin(7);
    }

}
