import java.util.Scanner;

// You are using Java
class StringOps {
   //type your code here
   String manipulate(String str[]){
    
    int len=str.length;
    
    if(len==1){
        StringBuilder sb=new StringBuilder(str[0]);
        return sb.reverse().toString();
    }else if(len==2){
        StringBuilder sb=new StringBuilder();
        for(String s:str){
             sb.append(s);
        }
        return sb.toString();
    }else{
        return "Invalid input";
    }
    
     
   }
   
}

class Main {
    public static void main(String[] args) {
        StringOps seetha = new StringOps();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] input_data = input.split(" ");
        String result = seetha.manipulate(input_data);
        System.out.println(result);
    }
}
