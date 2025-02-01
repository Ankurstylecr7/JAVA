package p2;  // Same package as Father
import p1.*;

class Child {
    public static void main(String[] args) {
        Father obj = new Father();
        
        // System.out.println(obj.prival); // ❌ Not accessible (private)
        System.out.println(obj.defval);    // ✅ Accessible (default, same package)
        System.out.println(obj.proval);    // ✅ Accessible (protected, same package)
        System.out.println(obj.pubval);    // ✅ Accessible (public)
    }
}


