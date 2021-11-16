public class ab {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean k = true;
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    k = false;
                    break;
                }
            }
            if (k) {
                System.out.print(i);
            }
        }
    }
}
