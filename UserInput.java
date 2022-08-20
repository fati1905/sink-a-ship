import java.awt.*;
import java.util.Scanner;

/**
 * ----- How To Use --------
 * This class interacts with the user. It demands an integer input from 0 to 6, from the user. This indicates the block to hit on the grid.
 */
//TODO: Use maven/gradle
public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static Point readLine() {
        System.out.print("prompt: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        //System.out.println(x);
        //System.out.println(y);
        return new Point(x,y);
    }
    public int getGrid(){
        System.out.print("Input Grid size: ");
        int grid = Integer.parseInt(scanner.nextLine());
        if(grid<0 || grid>20) grid = 5;
        System.out.println("Grid size successfully set to:"+ grid);
        return grid;
    }

    public int getShip(){
        System.out.print("Input number of ships: ");
        int numOfShips = Integer.parseInt(scanner.nextLine());
        System.out.println("All ships successfully set");
        return numOfShips;
    }

}

