package ua.zp.brain.labs.oop.basics.statics.Packages.transport;

public class PassportUtil {
    private PassportUtil() {
    }

    public static Passport changeOwner(String newOwner, Passport oldPassport) {
        Passport passport = new Passport();
        passport.setOwnerName(newOwner);
        passport.setModel(oldPassport.getModel());
        passport.setName(oldPassport.getName());
        return passport;

    }
}
