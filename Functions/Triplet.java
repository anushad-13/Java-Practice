import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(istriplet(a, b, c)){
            System.out.println("Numbers are Pythagorean triplets");
        }
        else{
            System.out.println("Numbers are not Pythagorean triplets");
        }
        sc.close();
    }

    static boolean istriplet(int a,int b,int c){
        if (a < b && b < c) {
            if (a * a + b * b == c * c) {
                return true;
            }
        }
        return false;
    }       
    
}
