import java.util.Scanner;
class VowelCounter {

    // You are using Java
    public static void main(String[] args) {
        //Type your code here
    Scanner scanner=new Scanner(System.in);
    String str=scanner.nextLine();
    StringBuilder sb=new StringBuilder(str);
    String vowels="aeiouAEIOU";
    int vowelCount=0,consonantCount=0;
    
    for(int i=0;i<sb.length();i++){
        char ch=sb.charAt(i);
        if(vowels.indexOf(ch)!=-1){
            vowelCount++;
        }else if(Character.isLetter(ch)){
            consonantCount++;
        }
    }
            System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        scanner.close();
    }
}