import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double movie = 0;

        /*for (int i = 1; i <= 2; i++) {
            System.out.printf("%d° note: ", i);
            movie += scanner.nextDouble();
        }*/


        int i = 1;
        while(true){
            System.out.printf("%d° note: ", i);
            movie += scanner.nextDouble();
            i += 1;

            System.out.println("Do you want continue? [Yes/No]: ");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("Yes")){
                break;
            }
        }
        double result = movie / i;
        System.out.println(result);
    }
}
