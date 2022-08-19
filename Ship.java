import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
/**
 * -------- How To Use ---------
 * This class randomly positions a ship, and provides its position (looks from 0 to 10) in an ArrayList "shipPoints".
 * The class Ship also contains a method that checks if the user's input entails the ship being either hit (result = "hit"), missed (result = "hit") or killed in case the ship was spot (result = "kill")
 */ 

public class Ship {
    //TODO: Multiple ships
    //TODO: Add elements to ships list
    protected static ArrayList<Point> shipPoints = new ArrayList<Point>();

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
            shipPoints.add(new Point(X,Y));

            //Add to the ArrayList (ship) the position of the ship
            int i = 1;
            while (i < width) {
                if(isHorizontal) {
                    shipPoints.add(new Point(X, Y + i));
                } else {
                    shipPoints.add(new Point(X + i, Y));
                }
                i++;
            }

            //Check if the ships don't overlap
            boolean flag = false;
            for(Point p: ships){
                for(int j = 0; j<width; j++){
                    if(ships.contains(shipPoints.get(j))){
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
                for(int k = 0; k<width; k++){
                    ships.add(shipPoints.get(k));
                }
            }
        }

    }

    //Test method useful for debugging. Please remove it to hide the position of the ship
    public void showPos() {
        for (Point p:shipPoints) {
            System.out.println(p);
        }
    }

    //Check if the ship was hit or not
    public String isHit(Point cord, ArrayList<Point> ships){
        //TODO: Use ENUMS instead of strings
        String result = "miss";

        if(ships.contains(cord)){
            //The ship was hit
            result = "hit";

            //We remove the coordinate afterwards
            ships.remove(cord);

            //Check if the arrayList is not empty
            if(ships.isEmpty()){
                //The game is over
                result= "kill";
            }
        }
        return result;
    }

}
