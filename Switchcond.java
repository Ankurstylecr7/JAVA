
import java.util.Scanner;
public class Switchcond{

    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        int numb = sci.nextInt();

        switch(numb){
            case 1->System.out.println("1");
            case 2->System.out.println("2");
            case 3->System.out.println("3");
            default->System.out.println("default");
        }

    }
}
