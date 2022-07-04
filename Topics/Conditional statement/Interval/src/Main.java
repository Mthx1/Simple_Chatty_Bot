import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int a = -15;
        final int b = 12;
        final int c = 14;
        final int d = 17;
        final int e = 19;
        int in = scanner.nextInt();
        boolean interval = a < in
                && in <= b
                || in > c
                && in < d || e <= in;
        if (interval) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}