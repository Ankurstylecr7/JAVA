import java.util.Scanner;

public class java1{

    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);

        int numb = sci.nextInt();
        String str1 = sci.next();
        sci.nextLine();
        String str2 = sci.nextLine();
        char ch = sci.next().charAt(0);
        long Longnumb=sci.nextLong();

        System.out.println("Number is:  " +numb);
        System.out.println("String is:  " +str1);
        System.out.println("String is:  " +str2);
        System.out.println("Character is:  " +ch);
        System.out.println("Long Number is: " +Longnumb);
        sci.close();
    }
}
