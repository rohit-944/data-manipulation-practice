public class Persan {
    String name;
    int age;
    public Persan(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        p.display(); 
    }
}
