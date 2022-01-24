import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        product(a,b);
        sc.close();
    }

    static void product(int a, int b){
        System.out.println(a*b);
    }
}
