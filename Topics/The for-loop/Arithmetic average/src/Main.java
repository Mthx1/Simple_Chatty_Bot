import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        final int three = 3;
        double number = 0;
        int count = 0;
        for (int i = one; i <= two; i++) {
            if (i % three == 0) {
                number += i;
                count++;
            }
        }
        double average = number / count;
        System.out.println(average);
    }
}