import java.util.Scanner;

public class PrimeNosInRange{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        prime(a,b);
        sc.close();
    }

    static void prime(int a,int b){
        for(int i=a;i<=b;i++){
            if (i == 1 || i == 0)
                continue;
 
            // flag variable to tell
            // if i is prime or not
            int flag = 1;
 
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag==1){
                System.out.println(i);
            }
        }
    }
}
