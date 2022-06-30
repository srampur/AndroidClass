package oops.polymorphism;

public class PolyExample {
    public static void main(String[] args) {
        PolyExample obj = new PolyExample();
        obj.getContactName("Harsha");
        obj.getContactName(324523564);
    }

    void getContactName(long phoneNo){

    }

    void getContactName(String name){

    }

    void getContactName(String name, long phoneNo){

    }

    void getContactName(long phoneNo,String name){

    }


    // 2 Types Compile / Runtime Methover loading/ overriding
}
