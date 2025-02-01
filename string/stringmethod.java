
import java.util.Scanner;
public class stringmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name="Ankur";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('k','u'));
        //System.out.println(name.replace("r", "ier"));
        System.out.println(name.startsWith("Ank"));
        System.out.println(name.endsWith("ur"));
        System.out.println(name.equals("Ankur"));
        System.out.println(name.equalsIgnoreCase("AnKUr"));
        System.out.println("I am escape sequence\tdouble quote");

        String name1="Aaankkuuurrur";
        System.out.println(name1.charAt(4));
        System.out.println(name1.indexOf('u'));
        System.out.println(name1.indexOf('u',9));
        //it will search index of u after or from 9th index onwards
        System.out.println(name1.lastIndexOf("u"));
        System.out.println(name1.lastIndexOf("u",10));


        String nm="_Ankur_";
        System.out.println(nm.replace("_",""));
    }
}
