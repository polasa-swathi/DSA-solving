public class BinomialCoefficient {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        long result = 1;

        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }

        System.out.println(result);
    }
}
