public class Whileloop {

    public void operation() {
        int i = 1;
        boolean checkflag = true;

        while (checkflag) {
            System.out.println(i);
            i++;

            if (i > 5) {
                checkflag = false;
            }
        }
    }

    public static void main(String[] args) {
        Whileloop o1 = new Whileloop();
        o1.operation();
    }
}
