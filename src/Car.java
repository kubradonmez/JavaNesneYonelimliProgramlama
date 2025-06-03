public class Car {
    String brand;
    String model;
    int year;

    //  Constructor (Yapıcı Metot)
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //  Bilgileri yazdıran metot
    public void printInfo() {
        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + year);
    }
}
