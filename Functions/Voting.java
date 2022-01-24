import java.util.Scanner;

class Voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        eligible(age);
        sc.close();
    }

    static void eligible(int age){
        if(age>18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    } 
}
