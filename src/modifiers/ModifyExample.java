package modifiers;

public class ModifyExample {

    static String schoolName ="Josephs";
    final String studentName = "";

    public static void main(String[] args) {
        ModifyExample obj = new ModifyExample();
        obj.getFavouriteHeadPhone();
        obj.getFavouriteSoundBar();
        obj.getFavouriteTv();
        obj.getFavouriteMobilePhone();
        schoolName = "Christ";
//        obj.studentName = "Siddu";
        getNumberOfCars();
    }


    static int getNumberOfCars() {
        return 20;
    }

    void getFavouriteMobilePhone() {
        System.out.println("Samsung Galaxy");
    }

    protected void getFavouriteTv() {
        System.out.println("Samsung Tv");
    }

    private void getFavouriteSoundBar() {
        System.out.println("JBL");
    }

    public void getFavouriteHeadPhone() {
        System.out.println("Bose");
    }
}
