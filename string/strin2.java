 class RemoveDuplicatesUtility {
    //type your code here
    public static String removeDuplicates(String userInput){
        StringBuilder sb=new StringBuilder();
        boolean seen[]=new boolean[128];
    
        for(int i=0;i<userInput.length();i++){
            char ch=userInput.charAt(i);
            if(!seen[ch]){
                sb.append(ch);
                seen[ch]=true;
            }
        }
        return sb.toString();
    }
    
}


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        String result = RemoveDuplicatesUtility.removeDuplicates(userInput);
        System.out.println(result);

        scanner.close();
    }
}