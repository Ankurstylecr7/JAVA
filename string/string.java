import java.util.Scanner;

//String are immutable
public class string{
    public static void main(String[] args) {
            //Type your code here
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            char ch=sc.next().charAt(0);
            boolean flag=false;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==ch){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(ch+" not found in the string");
            }else{
                System.out.println("First occurrence of "+ch+": "+str.indexOf(ch));
                System.out.println("Last occurrence of "+ch+": "+str.lastIndexOf(ch));
            }
            
        }

}
