import java.util.Scanner;

public class java11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float Eraser = sc.nextFloat();
        float avg = pencil + pen + Eraser;
        System.out.println(avg);
        float GST = (avg / 18.0f) * 100;
        System.out.println(GST);
    }

}
