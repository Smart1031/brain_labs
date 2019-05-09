package ua.zp.brain.labs.oop.basics.statics.Packages.technics;

import java.util.Date;

public class Passport {
    private String name = "TV";
    private String model = "LG";
    private Date warrantyStartDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", warrantyStartDate=" + warrantyStartDate +
                '}';
    }
}
