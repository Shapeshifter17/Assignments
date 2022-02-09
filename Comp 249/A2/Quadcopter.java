package Second;

public class Quadcopter extends Helicopter{
    private int maxSpeed;

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
