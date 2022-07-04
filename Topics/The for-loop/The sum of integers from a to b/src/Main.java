import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int i;
        int includedFrom = 0;
        for (i = start; i <= end; i++) {
            includedFrom += i;
        }
        System.out.print(includedFrom);
    }
}
