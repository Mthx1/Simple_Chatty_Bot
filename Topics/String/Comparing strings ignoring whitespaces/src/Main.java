import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String a = scanner.next();
        String b = scanner.next();
        boolean ab = (a == b);
        boolean bc = (a != b);
        System.out.println(ab);
        System.out.println(bc);
    }
}