public class Student extends Person {
    String school;

    // Constructor
    public Student(String name, int age, String school) {
        super(name, age);         // üst sınıfın (Person) constructor'ını çağırır
        this.school = school;     // bu sınıfa ait alanı belirtir
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // üst sınıftaki metodu çağır
        System.out.println("Okul: " + school);
    }
}
