import java.util.Scanner;

public class CI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        double p = sc.nextDouble();
        System.out.println("Enter Rate of interest");
        double r = sc.nextDouble();
        System.out.println("Enter time");
        double t = sc.nextDouble();

        System.out.println(compoundInterest(p, r, t));
        sc.close();

    }
    static double compoundInterest(double p,double r,double t) {
        return p * Math.pow((1 + r/100),t) - p;
    }

}
