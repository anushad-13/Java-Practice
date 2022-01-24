import java.util.Scanner;

public class SumofNnos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sum(n);
        sc.close();
    }

    static void sum(int n){
        System.out.println("Sum of n natural numbers:"+(n*(n+1)/2));
    }
}
