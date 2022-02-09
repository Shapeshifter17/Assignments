package First;

public class Airplane {
    private String brand ="";
    private double price;
    private int horsepower;

    @Override
    public String toString() {
        return "Airplane{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", horsepower=" + horsepower +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airplane)) return false;

        Airplane airplane = (Airplane) o;

        if (Double.compare(airplane.getPrice(), getPrice()) != 0) return false;
        if (getHorsepower() != airplane.getHorsepower()) return false;
        return getBrand() != null ? getBrand().equals(airplane.getBrand()) : airplane.getBrand() == null;
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
    public Airplane(){

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
