public class vv {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    break;
                }
                else if (n == i - 1) {
                    System.out.println(i);
                    break;
                }

            }
        }
    }
}
