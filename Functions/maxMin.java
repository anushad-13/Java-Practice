import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        max(a,b);
        min(a,b);
    }

    static void max(int a, int b){
        int max=(a>b) ?a : b;
        System.out.println("Maximum:"+max);
    }

    static void min(int a, int b){
        int min=(a<b)?a:b;
        System.out.println("Minimum:"+min);
    }
}
