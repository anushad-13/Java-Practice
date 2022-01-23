import java.util.*;
class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        digitSum(n);
        sc.close();
    }
    
    static void digitSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
