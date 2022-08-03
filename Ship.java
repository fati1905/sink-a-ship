import java.util.ArrayList;
import java.util.Collections;

public class Ship {

    ArrayList<Integer> loc = new ArrayList<>();

    //Instantiate the ship location
    public Ship() {

        int rand = (int) Math.floor(Math.random()*5);
        Collections.addAll(loc, rand, rand+1, rand+2);
    }

    public void getLoc() {             //test method useful for debugging
        loc.forEach(System.out::println);
    }

    //Check if the ship was hit or not
    public String isHit( int num ) {
        //We receive the number hit in num
        String result = "miss"; //The result of the hit is st on miss on default
        if(loc.contains(num)) { //if The number inserted is in the arrayList
            result = "hit";//Then The ship was hit
            loc.remove((Integer) num);//We remove the hit block from the arraylist
            if(loc.isEmpty()) { //Check if the ArrayList is not empty
                result = "kill"; //If it is we should end the game
            }
        }
        return result;
    }

    //public static void main(String [] args){
        //Ship s = new Ship();
        //s.getLoc();
        //System.out.println(s.isHit(9));
    //}
}
