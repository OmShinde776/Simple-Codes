public class CheakEvenOdd {

    int number = 13;

    public void check() {
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        CheakEvenOdd e1 = new CheakEvenOdd();
        e1.check();
    }
}
