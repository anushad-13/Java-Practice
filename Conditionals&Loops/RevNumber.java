import java.util.*;
class RevNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans  = 0;
        int temp = num;
        while(num > 0) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }
        if (temp == ans) {
                System.out.println("Number is Palindrome");
        } else {
                System.out.println("Number is not Palindrome");
        }
        sc.close();

    }
}
