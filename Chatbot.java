import java.util.Scanner;

public class Chatbot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Kitty", "22.01.2020");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("I am " + assistantName + " c:");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("What are you?");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("You are " + name + " o:");
    }

    static void guessAge() {
        System.out.println("I know how old you are.");
        System.out.println("Input remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("You are " + age + " o:");
    }

    static void count() {
        System.out.println("I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your intellect.\n");
        System.out.println("Who is Kitty?");
        System.out.println("1. Who is Kitty.");
        System.out.println("2. You are kitty.");
        System.out.println("3. I am Kitty.");
        System.out.println("4. Kitty does not exist.");
        while(true) {
            int a = scanner.nextInt();
            if (a == 2) {
                System.out.println("YES c:");
                break;
            }
            else
                System.out.println("NO ! ! !");
                continue;                
        }
    }

    static void end() {
        System.out.println("Farewell.");
    }
}