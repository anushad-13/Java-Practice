import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a,b);
        sc.close();
    }

    static void sum(int a, int b){
        System.out.println(a+b);
    }
}
