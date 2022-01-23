import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sub=sc.nextInt();
        int sum=0;
        for (int i=0;i<sub;i++){
            int marks=sc.nextInt();
            sum+=marks;
        }
        double avg=sum/sub;
        System.out.println(avg);
        sc.close();
    }
}
