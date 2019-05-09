package ua.zp.brain.labs.oop.basics.statics.Packages.technics;

import java.util.Date;

public class PassportUtil {
    private PassportUtil() {
    }

    public static void warrantyReplace(Passport doc) {
        doc.setWarrantyStartDate(new Date());


    }

    public static void main(String[] args) {
        Passport pass = new Passport();
        pass.setWarrantyStartDate(new Date(123345));
        System.out.println(pass);
        warrantyReplace(pass);
        System.out.println(pass);
    }
}
