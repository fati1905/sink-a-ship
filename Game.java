/**
 * ------------ How To Use --------------
 * This class is the main class that should be executed to launch the game.
 * This class instantiates an object of type "Ship", then creates a loop while checking if the ship is still alive in each iteration until it is spot.
 * This class also announces in the end of the game, the number of the guesses taken by the player to completely spot the ship.
 * Please note that the grid's blocks variate from 0 to 10. In case of entering numbers less or bigger than this interval the answer will always "miss".
 */
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Game {

    public static void main(String[] args){
        //TODO: Apply the variable numberOfShips to the method in UserInput
        int numOfGuess = 0;
        UserInput input = new UserInput();
        boolean isAlive = true;
        int grid = input.getGrid();
        int numberOfShips = input.getShip(grid) ;
        ArrayList<Point> ships = new ArrayList<Point>();
        ArrayList<Ship> allShips = new ArrayList<Ship>();

        //Loop to create ships
        for(int j = 0; j<numberOfShips;j++){
            Random rand = new Random();
            int width = rand.nextInt(4)+2;
            allShips.add(new Ship(grid,width, ships));
        }

        for (int i = 0; i < numberOfShips; i++) {
            System.out.println("******* NEW ***********");
            allShips.get(i).showPos();
        }

        String result = "miss";
        //TODO: Add a start button
        //TODO: Add a quit button
        System.out.println("The Game starts! Get ready to spot the ship.");
        while(isAlive){

            //Store the input of the user
            Point guess = UserInput.readLine();

            //Convert the user input (String) into integer
            try{
                result = Ship.isHit(guess,ships);
                //Prints the result of the hit (miss, hit, kill)
                System.out.println(result);
                numOfGuess++;

            } catch (Exception e) {
                //In case the user's input is the different than a digit
                System.out.println("Please print a number!");
            }

            //When the player sopts the ship, the system prints the number of guesses taken
            if(result.equals("kill")){
                isAlive =false;
                System.out.println("You took "+ numOfGuess+ " guesses");
            }
        }
    }
}
