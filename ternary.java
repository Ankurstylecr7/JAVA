import java.util.Scanner;

public class ternary {

    Scanner sc=new Scanner(System.in);
    static int a=30;
    public static void main(String[] args) {
        System.out.println((a>90)?"a":((a>80)?"b":((a>70)?"c":"d")));
    }
}