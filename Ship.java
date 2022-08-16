import java.util.ArrayList;
import java.util.Collections;
/**
 * -------- How To Use ---------
 * This class randomly positions a ship, and provides its position (blocks from 0 to 10) in an ArrayList "loc".
 * The class Ship also contains a method that checks if the user's input entails the ship being either hit (result = "hit"), missed (result = "hit") or killed in case the ship was spot (result = "kill")
 */ 

public class Ship {
    protected ArrayList<Coordinates> loc ;
    protected ArrayList<Coordinates> ships = new ArrayList<Coordinates>();
    protected int orientation;//Horizontal: 0, Vertical: 1

    //Instantiate the ship location
    public Ship() {
        //TODO: Multiple ships
        loc = new ArrayList<Coordinates>();
        orientation = (int) Math.floor(Math.random()*2);
    }

    public void setShip(int width){
        //TODO: Change the grid to a variable
        Coordinates cord = new Coordinates(0,0);

        if(this.orientation%2==0){
            cord.y = (int) Math.floor(Math.random()*(11));
            cord.x = (int) Math.floor(Math.random()*(12-width));
        }else {
            cord.y = (int) Math.floor(Math.random()*(11-width));
            cord.x = (int) Math.floor(Math.random()*(11));
        }

        //Add to the ArrayList (ship) the position of the ship
        for(int i =0; i<width; i++){
            loc.add(cord);
            //If the ship is set on horizontal then y remains the same and only x gets incremented in every iteration
            if (orientation % 2 == 0) {
                cord.x++;
            } else{
                //Otherwise, if the ship is vertical then x remains static and y increments
                cord.y++;
            }
            i++;
        }
    }

    //Test method useful for debugging. Please remove it to hide the position of the ship
    public void showPos() { 
        loc.forEach((cord) -> cord.displayCord(cord));
    }

    //Check if the ship was hit or not
    public String isHit(Coordinates cord){
        //TODO: Use ENUMS instead of strings
        String result = "miss";

        if(loc.contains(cord)){
            //The ship was hit
            result = "hit";

            //We remove the coordinate afterwards
            loc.remove(cord);

            //Check if the arrayList is not empty
            if(loc.isEmpty()){
                //The game is over
                result= "kill";
            }
        }
        return result;
    }

}
