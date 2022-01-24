import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double rad=sc.nextDouble();
        circle(rad);
        sc.close();
    }

    static void circle(double rad){
        double pi=3.14;
        double circum=2*pi*rad;
        double area=pi*rad*rad;
        System.out.println("Circumference:"+circum);
        System.out.println("Area:"+area);
    }
}
