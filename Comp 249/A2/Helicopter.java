package Second;

import First.Airplane;

public class Helicopter extends Airplane {

    private int cylinders;
    private int year;
    private int capacity;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Helicopter)) return false;

        Helicopter that = (Helicopter) o;

        if (getCylinders() != that.getCylinders()) return false;
        if (getYear() != that.getYear()) return false;
        return getCapacity() == that.getCapacity();
    }

    public Helicopter(){
        super();
    }

    public Helicopter(String brand, double price, int horsepower, int cylinders, int year, int capacity) {
        super(brand, price, horsepower);
        setCapacity(capacity);
        setCylinders(cylinders);
        setYear(year);
    }

    public Helicopter(Helicopter heli){
        super(heli);
        setCapacity(heli.getCapacity());
        setCylinders(heli.getCylinders());
        setYear(heli.getYear());
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "cylinders=" + cylinders +
                ", year=" + year +
                ", capacity=" + capacity +
                "} " + super.toString();
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

}
