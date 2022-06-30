package oops;

import oops.encap.Product;
import oops.encap.Student;

public class OopsSamples {

    public static void main(String[] args) {


        Student obj = new Student();
        obj.id =3;
        obj.name ="Harsha";
        obj.schoolName ="New Horizon";
        obj.cgpa =9.77f;
        obj.gender =true;


        Student obj1 = new Student();
        obj1.id =4;
        obj1.name ="Sankeeth";
        obj1.schoolName ="BMS";
        obj1.cgpa =8.47f;
        obj1.gender =true;

        Product prod = new Product();
        prod.setMrp(34.4f);


    }
}
