import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean aa = a > 0 && b <= 0 && c <= 0;
        boolean bb = b > 0 && a <= 0 && c <= 0;
        boolean cc = c > 0 && a <= 0 && b <= 0;

        boolean chk = aa || bb || cc;

        System.out.println(chk);

    }



}
