package Second;

public class Quadcopter extends Helicopter{
    private int maxSpeed;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quadcopter)) return false;
        if (!super.equals(o)) return false;

        Quadcopter that = (Quadcopter) o;

        return getMaxSpeed() == that.getMaxSpeed();
    }

    @Override
    public String toString() {
        return "Quadcopter{" +
                "maxSpeed=" + maxSpeed +
                "} " + super.toString();
    }

    public Quadcopter(){
        super();
    }
    public Quadcopter(String brand, double price, int horsepower, int cylinders, int year, int capacity,int max){
        super(brand,price,horsepower,cylinders,year,capacity);
        setMaxSpeed(max);
    }
    public Quadcopter(Quadcopter cop){
        super(cop);
        setMaxSpeed(cop.getMaxSpeed());
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
