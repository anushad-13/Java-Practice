//import java.util.*;
class digitArmstrong {
    public static void main(String args[]) {
        //Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        //Armstrong(n);

        //to print all 3 digit armstrong numbers
        for(int i=100;i<1000;i++){
            if(Armstrong(i)){
                System.out.println(i+" ");
            }
        }
        //sc.close();

    }
    //check if a number is an armstrong number or not
    static boolean Armstrong(int n){
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
