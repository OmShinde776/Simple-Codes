package ThisAndSuper;

public class Dog extends Animal{
    String DogName="luccy";
    public void test(){
        super.AnimalClassMethod();
        System.out.println("test method in child");
    }
    public void DogClassMethod(){
        this.test();
        System.out.println("Child class method"+","+DogName);
        System.out.println("Child class method"+","+super.name);
    }
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.DogClassMethod();
        d1.AnimalClassMethod();
    }
}
