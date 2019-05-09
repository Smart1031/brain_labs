package ua.zp.brain.labs.oop.basics.statics.Packages.citizen;

public class Passport {
    private String name = "Oleg";
    private int age = 25;
    private int passportId = 222222;
    private int spouseId;

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public int getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(int spouseId) {
        this.spouseId = spouseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passportId=" + passportId +
                ", spouseId=" + spouseId +
                '}';
    }
}
