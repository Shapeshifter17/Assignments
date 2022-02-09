package First;

public class Airplane {
    private String brand ="";
    private double price;
    private int horsepower;

    public Airplane(){

    }

    public Airplane(Airplane plane){
        this.setBrand (plane.getBrand());
        this.setPrice(plane.getPrice()); 
        this.setHorsepower(plane.getHorsepower());
    }

    public Airplane(String brand, double price, int horsepower) {
        this.brand = brand;
        this.price = price;
        this.horsepower = horsepower;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
