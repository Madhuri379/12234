public class main1 {
    public static void main(String[] args) {

        try {
            int a = 5;
            int b = 0;
            int i = 5 / 0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
