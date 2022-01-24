import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isPalindrome(n);
        sc.close();
    }

    static void isPalindrome(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}