
import java.util.Scanner;
public class string6 {


public static void main(String[] args) {
       //type your code here
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       char arr[]=str.toCharArray();
       
        System.out.print("[");
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]);
           if(i!=arr.length-1){
               System.out.print(", ");
           }
       }
        System.out.print("]");
    }
}