package oops.inheritance;

public class AnandBhavan extends ZomatoPartner{
    public static void main(String[] args) {
        ZomatoPartner obj = new ZomatoPartner();
        obj.swiggyPartnerID();
        obj.getSwiggyOrderID();
    }

    void orderMenu() {
        System.out.println("Order Menu from A2B");
    }

    void getSwiggyOrderID() {
        System.out.println("A2B13545");
    }
}
