public class SecondMinimum {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        System.out.println("Second smallest element: " + secondMin);
    }
}
