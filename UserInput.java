import java.awt.*;
import java.util.Scanner;

/**
 * ----- How To Use --------
 * This class interacts with the user. It demands an integer input from 0 to 6, from the user. This indicates the block to hit on the grid.
 */

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static Point readLine() {
        System.out.print("prompt: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        //System.out.println(point);
        return new Point(x,y);
    }

    public static void main(String[] args){
        UserInput.readLine();
    }
}

