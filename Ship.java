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
    protected ArrayList<Point> ships = new ArrayList<Point>();


    public Ship(int grid,int width){
        int X = (int) (Math.random()*(grid-2)+1);
        int Y = (int) (Math.random()*(grid-2)+1);
        Point point1 = new Point(X,Y);
        loc.add(point1);
        boolean isHorizontal = (Math.random() < 0.5); //returns true or false randomly

        Point point2;
        Point point3;
        if(isHorizontal){
            point2 = new Point(X, Y + 1);
            point3 = new Point(X, Y + 2);
        }else{
            point2 = new Point(X + 1, Y);
            point3 = new Point(X + 2, Y);
        }
        loc.add(point2);
        loc.add(point3);
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
