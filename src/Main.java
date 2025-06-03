public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum2 = calc.add(5, 10);       // 2 parametreli metot çağrılır
        int sum3 = calc.add(2, 4, 6);     // 3 parametreli metot çağrılır

        System.out.println("2 sayının toplamı: " + sum2);
        System.out.println("3 sayının toplamı: " + sum3);
    }
}
