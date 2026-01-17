public class calculator {

    public void calculate() {
        int a = 20;
        int b = 10;

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
    }

    public static void main(String[] args) {
        calculator c = new calculator();
        c.calculate();
    }
}
