package Second;

import First.Airplane;

public class Helicopter extends Airplane {
    private int cylinders;
    private int year;

    public Helicopter(){
    }

    public Helicopter(String brand, double price, int horsepower) {
        super(brand, price, horsepower);
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private int capacity;
}
