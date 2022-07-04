import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int ten = 10;
        int input = scanner.nextInt();

        if (input < ten) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}