import java.util.Scanner;

// You are using Java
class EncoderDecoder {
     //type your code here
     
     String encode(String msg[]){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<msg.length;i++){
            sb.append(msg[i]);
            if(i!=msg.length-1){
                sb.append("#");
            }
        }
        return sb.toString();
     }
     
     String[] decode(String encoded){
         return encoded.split("#");
     }
}


class Main {
    public static void main(String[] args) {
        EncoderDecoder encoderDecoder = new EncoderDecoder();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] messages = userInput.split(" ");
        String encoded = encoderDecoder.encode(messages);
        System.out.println("Encoded: " + encoded);
        String[] decoded = encoderDecoder.decode(encoded);
        System.out.println("Decoded: ");
        for (String message : decoded) {
            System.out.println(message);
        }

        scanner.close();
    }
}