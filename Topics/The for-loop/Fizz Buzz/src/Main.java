import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int i;

        for (i = start; i <= end; i++) 
              if (i % 15 == 0) 
                System.out.println("FizzBuzz");
             else if (i % 5 == 0) 
                System.out.println("Buzz");
             else if (i % 3 == 0) 
                System.out.println("Fizz");
             else {
                System.out.println(i);
            }
        
    }
}
