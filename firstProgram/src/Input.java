import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What´s your favorite movie? ");
        String movie = scanner.nextLine();

        System.out.printf("Wow! %s is my favorite too", movie);
    }
}
