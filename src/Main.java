public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.start();  // Vehicle sınıfının metodu çalışır

        Car myCar = new Car();
        myCar.start();      // Car sınıfındaki override edilmiş metod çalışır
    }
}
