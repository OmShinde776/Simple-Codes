package Hireachical;

public class mainClass {
    public static void main(String[] args) {

        Monkey m1 = new Monkey();
        m1.monkeyMethod();
        m1.AnimalDetails();

        System.out.println("-----");

        Cat c1 = new Cat();
        c1.AnimalDetails();
        c1.catMethod();

        Dog d1 = new Dog();
        System.out.println("-----");
        d1.AnimalDetails();
    }
}
