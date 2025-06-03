public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        // set metoduyla değer atama
        myCar.setBrand("Honda");
        myCar.setModel("Civic");
        myCar.setYear(2022);

        // get metoduyla ekrana yazdırma
        System.out.println("Marka: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Yıl: " + myCar.getYear());
    }
}
