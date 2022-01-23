import java.util.Scanner;

public class AvgofNnos{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the "+n+" elements respectively :");
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            sum += num;
        }
        double average = (double)sum / n;
        System.out.println(average);
        sc.close();
    }
}