import java.util.ArrayList;
import java.util.Collections;

/**
 * -------- How To Use ---------
 * This class randomly positions a ship, and provides its position (blocks from 0 to 10) in an ArrayList "loc".
 * The class Ship also contains a method that checks if the user's input entails the ship being either hit (result = "hit"), missed (result = "hit") or killed in case the ship was spot (result = "kill")
 */ 

public class Ship {

    private final ArrayList<Integer> loc = new ArrayList<>();

    //Instantiate the ship location
    public Ship() {
        //TODO: Multiple ships
        int rand = (int) Math.floor(Math.random()*5);
        Collections.addAll(loc, rand, rand+1, rand+2);
    }

    //Test method useful for debugging. Please remove it to hide the position of the ship
    public void showPos() { 
        loc.forEach(System.out::println);
    }

    //Check if the ship was hit or not
    public String isHit( int num ) {
       //TODO: use enums instead of STRING
        //The result of the hit is set on "miss" by default
        String result = "miss"; 

        //If The number inserted is in the ArrayList
        if(loc.contains(num)){

            //Then the ship was hit 
            result = "hit";

            //We remove the hit block from the Arraylist
            loc.remove((Integer) num);

            //Check if the ArrayList is not empty
            if(loc.isEmpty()) { 

                //If it is we should end the game
                result = "kill"; 
            }
        }
        return result;
    }
}
