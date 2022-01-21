package myPackage.exam.colections;

import java.util.UUID;

public class Car {
    boolean isExclusive; //true or false
    int yearOfProduction; // eg 2021, 2015 etc
    int levelOfEquipment; // 3 > 2 > 1, higher then better
    UUID id;
    double value; // how much does it cost for client

    public Car(boolean isExclusive, int yearOfProduction, int levelOfEquipment, UUID id, double value) {
        this.isExclusive = isExclusive;
        this.yearOfProduction = yearOfProduction;
        this.levelOfEquipment = levelOfEquipment;
        this.id = UUID.fromString(UUID.randomUUID().toString());
        this.value = value;
    }
    public boolean getIsExclusive() {
        return isExclusive;
    }
    public void setIsExclusive(boolean isExclusive) {
        this.isExclusive = isExclusive;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    public int getLevelOfEquipment() {
        return levelOfEquipment;
    }
    public void setLevelOfEquipment(int levelOfEquipment) {
        this.levelOfEquipment = levelOfEquipment;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public String toString() {
        return "Car " +
                "Exclusive = '" + isExclusive + '\'' +
                ", year of production = " + yearOfProduction +
                ", level of equipment = " + levelOfEquipment +
                ", id = " + id +
                ", value = " + value;
    }
}
