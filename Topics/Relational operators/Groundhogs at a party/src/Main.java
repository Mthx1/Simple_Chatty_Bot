import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = 21;
        final int b = 25;
        int numberOfReeses = scanner.nextInt();
        boolean isItTheWeekend = scanner.nextBoolean();

        boolean output = numberOfReeses >= a && numberOfReeses <= b;

        System.out.println(output == isItTheWeekend);


    }

}
