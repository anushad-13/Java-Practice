import java.util.*;
public class Factorial {
    public static void main(String atgs[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        int i=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
