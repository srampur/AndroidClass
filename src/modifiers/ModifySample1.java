package modifiers;

public class ModifySample1 {

    public static void main(String[] args) {
        ModifyExample obj = new ModifyExample();
        obj.getFavouriteHeadPhone();
        obj.getFavouriteTv();
        obj.getFavouriteMobilePhone();
        ModifyExample.main(new String[]{});
        System.out.println(ModifyExample.schoolName);
        ModifyExample.schoolName = "Bethany";
    }
}
