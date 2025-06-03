public class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;  // this: sınıfın içindeki alanı belirtir
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("İsim: " + name);
        System.out.println("Yaş: " + age);
    }
}
