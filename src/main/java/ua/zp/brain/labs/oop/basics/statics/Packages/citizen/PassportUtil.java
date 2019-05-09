package ua.zp.brain.labs.oop.basics.statics.Packages.citizen;

public class PassportUtil {
    private PassportUtil(){

    }
        public static void marriageRegistrate(Passport ID1, Passport ID2){
        ID1.setSpouseId(ID2.getPassportId());
            ID2.setSpouseId(ID1.getPassportId());

        }

    public static void main(String[] args) {
        Passport men = new Passport();
        Passport women = new Passport();
        men.setPassportId(123456);
        women.setPassportId(654321);
        marriageRegistrate(men,women);
        System.out.println(men);
        System.out.println(women);
    }

}
