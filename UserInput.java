import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readLine() {
        System.out.println("prompt ");
        return scanner.nextLine();
    }
}

/**
 * String guess = helper.getUserInput("Enter a number");
 */