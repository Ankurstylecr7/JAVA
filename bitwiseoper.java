
    public class bitwiseoper{

    public static void main(String[] args) {
        int b=11;
        int a=b;
        // System.out.println("a & b = "+(a&b));
        // System.out.println("a & b = "+(a|b));
        // System.out.println("a & b = "+(a^b));
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        while(a>0){
            a=a%2;
            sb.append(a);
            if(a==1){
                cnt++;
            }
        }
        if(cnt%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        

        //or
        // if(a&1==0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }
        // System.out.prinltn((a&1==0)?"Even":"Odd");

    }
}