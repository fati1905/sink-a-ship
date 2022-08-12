import java.util.Scanner;

/**
 * ----- How To Use --------
 * This class interacts with the user. It demands an integer input from 0 to 6, from the user. This indicates the block to hit on the grid.
 */

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readLine() {
        System.out.print("prompt: ");
        return scanner.nextLine();
    }
}

