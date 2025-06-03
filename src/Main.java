public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(120);  // speed değerini ata

        System.out.println("Arabanın hızı: " + myCar.getSpeed() + " km/s");
    }
}
