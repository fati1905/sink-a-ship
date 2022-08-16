/**
 * ------------ How To Use --------------
 * This class is the main class that should be executed to launch the game.
 * This class instantiates an object of type "Ship", then creates a loop while checking if the ship is still alive in each iteration until it is spot.
 * This class also announces in the end of the game, the number of the guesses taken by the player to completely spot the ship.
 * Please note that the grid's blocks variate from 0 to 10. In case of entering numbers less or bigger than this interval the answer will always "miss".
 */
 
public class Game {

    public static void main(String[] args){

        int numOfGuess =0;
        Ship s = new Ship();
        boolean isAlive = true;
        //If you are on developper mode and want to see the position of the ship, remove the next line from a comment
        //s.showPos(); 
        String result = "miss";

        //TODO: Add a start button
        //TODO: Add a quit button
        System.out.println("The Game starts! Get ready to spot the ship.");
        while(isAlive){

            //Store the input of the user
            String guess = UserInput.readLine();

            //If the user's input is q, Q,QUIT or quit then the game will be stopped
            if(guess.equals("q") || guess.equals("Q") || guess.equals("quit") || guess.equals("QUIT") ){
                System.out.println("Game quit!");
                break;
            }
            //TODO: Change the code according to ship class code
            //Convert the user input (String) into integer
            try{
                result = s.isHit(Integer.parseInt(guess));
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
