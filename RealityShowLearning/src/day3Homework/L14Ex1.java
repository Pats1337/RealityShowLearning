package day3Homework;

public class L14Ex1 {
    public static void main(String[] args) {
        checkMultiplicity(100);
    }

    private static void checkMultiplicity(int i) {
        for (int n = 1; n <= i; n++) {
            if (n % 3 == 0) {
                System.out.print(n + " ");
            }
        }
    }
}
