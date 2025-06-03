public class Car {
    // Özellikler
    String brand;
    String model;
    int year;

    // Yapıcı metod (Constructor)
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Bilgileri yazdıran metod
    public void printInfo() {
        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + year);
    }

    // main metodu
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.printInfo();
    }
}
