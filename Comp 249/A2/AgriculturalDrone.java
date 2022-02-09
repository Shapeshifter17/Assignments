package Last;

import Fourth.UAV;

public class AgriculturalDrone extends UAV {
    private String brand;
    private int carryCapacity;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(int carryCapacity) {
        this.carryCapacity = carryCapacity;
    }
}
