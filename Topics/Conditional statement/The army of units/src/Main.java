import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int units = scanner.nextInt();
        final int a = 19;
        final int b = 249;
        final int c = 999;
        final int d = 1000;
        if (units < 1) {
            System.out.println("no army");
        } else if (units <= a) {
            System.out.println("pack");
        } else if (units <= b) {
            System.out.println("throng");
        }  else if (units <= c) {
            System.out.println("zounds");
        } else if (units >= d) {
            System.out.println("legion");
        }

    }
}
