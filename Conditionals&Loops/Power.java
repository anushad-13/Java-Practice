import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter a power: ");
        int p = sc.nextInt();
        int power = 1;
        System.out.print(n+" to the power of "+p+" is = ");
        while(p!=0){
            power *= n;
            p--;
        }
        System.out.println(power);
        sc.close();
    }
}
