import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
/**
 * -------- How To Use ---------
 * This class randomly positions a ship, and provides its position (blocks from 0 to 10) in an ArrayList "loc".
 * The class Ship also contains a method that checks if the user's input entails the ship being either hit (result = "hit"), missed (result = "hit") or killed in case the ship was spot (result = "kill")
 */ 

public class Ship {
    //TODO: Multiple ships
    protected ArrayList<Point> loc = new ArrayList<Point>();

    public Ship(int grid,int width, ArrayList<Point> ships){

        while(true){

            int X = 0;
            int Y = 0;
            boolean isHorizontal = (Math.random() < 0.5); //returns true or false randomly

            if(isHorizontal){
                X = (int) (Math.random()*(grid+1-width));
                Y = (int) (Math.random()*(grid+1));
            }else {
                Y = (int) (Math.random()*(grid+1-width));
                X = (int) (Math.random()*(grid+1));
            }
            loc.add(new Point(X,Y));

            //Add to the ArrayList (ship) the position of the ship
            int i = 1;
            while (i < width) {
                if(isHorizontal) {
                    loc.add(new Point(X, Y + i));
                } else {
                    loc.add(new Point(X + i, Y));
                }
                i++;
            }

            //Check if the ships don't overlap
            boolean flag = false;
            for(Point p: ships){
                for(int j = 0; j<width; j++){
                    if(ships.contains(loc.get(j))){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }

            if(!flag){
                break;
            }
        }

    }

    //Test method useful for debugging. Please remove it to hide the position of the ship
    public void showPos() {
        for (Point p:loc) {
            System.out.println(p);
        }
    }

    //Check if the ship was hit or not
    public String isHit(Point cord){
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
