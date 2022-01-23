import java.util.*;
public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char x=sc.next().charAt(0);
        alphabet(x);
    }

    static void alphabet(char x){
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
