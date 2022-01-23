import java.util.*;
public class Armstrong {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();
    }

    static boolean isArmstrong(int n){
        int orig=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+(rem*rem*rem);
        }
        if(sum==orig){
            return true;
        }
        else{
            return false;
        }
    }
    
}
