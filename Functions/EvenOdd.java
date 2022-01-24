import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        evenOdd(n);
        sc.close();
    }

    static void evenOdd(int n){
        if(n%2==0){
            System.out.println(n+" is even");
        }
        else{
            System.out.println(n+" is odd");
        }
    }

}
