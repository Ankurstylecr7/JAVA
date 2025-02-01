import java.util.Scanner;

public class typecasting{

    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);

        byte numb1 = sci.nextByte(),numb2 = sci.nextByte(),c;
        // c = numb1+numb2;  //by default it will consider it as int which is wrong
        c = (byte)(numb1+numb2);
        System.out.println(c);
        sci.close();
        
    }
}


