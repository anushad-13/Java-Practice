import java.util.*;
public class LeapYear {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean leap=true;
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            leap=true;
        }
        else{leap=false;}
        System.out.println(leap);
        sc.close();


    }
    
}
