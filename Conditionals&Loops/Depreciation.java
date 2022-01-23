import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount");
        long amount=sc.nextLong();
        System.out.println("enter Depreciation percentage");
        long deppercent=sc.nextLong();
        System.out.println("enter  number of years");
        long year=sc.nextLong();
        long temp=amount;
        for(int i=0;i<year;i++)
        temp=((100-deppercent)*temp)/100;
        System.out.println("after depreciation = "+temp);
        sc.close();
    }
}
