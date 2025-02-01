
import java.util.Scanner;



public class integer{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        if(sc.hasNextInt()){
            int c=sc.nextInt();
            System.out.println("Integer "+c);
        }else{
            System.out.println("Not an Integer");
        }

        Integer number = 5;
        boolean res;
    
        if (res = number instanceof Integer){
            System.out.println("number is an object of Integer. Hence: " + res);
        } else {
            System.out.println("number is not an object of Integer.Hence: " + res);
        }
    }
}
