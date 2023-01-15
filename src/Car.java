public class Car {
    private String brand;
    private String model;
    private String engineVolume;
    private String color;
    private String year;
    private String country;

    public Car(String brand, String model, String engineVolume, String year, String country, String color) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;

    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String toString() {
        return getBrand() + " " + getModel() + ", " + getEngineVolume() + ", " + getColor() + ", " + getYear() + ", " + getCountry() + ", ";
    }

    public static Integer validateYear(Integer value) {
        return value == null ? 2000 : value;
    }

    public static double validateEngineVolume(double value) {
        return value < 0 ? 1.5 : value;
    }

    public static String validateColor(String value) {
        return value == null ? "Белый" : value;
    }

}
