import java.util.Scanner;

public class q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int negsum=0;
        int poseven=0;
        int posodd=0;
        while(true){
            
            System.out.print("Enter an integer (0 to exit) : ");
            int num = sc.nextInt();
            if (num == 0){
                break;
            }
            if(num<0){
                 negsum=negsum+num;
                }
            else if(num%2==0){
                    poseven=poseven+num;
                }
            else {
                    posodd=posodd+num;
                }
        }
        System.out.println(negsum);
        System.out.println(poseven);
        System.out.println(posodd);
        sc.close();
    }
}

