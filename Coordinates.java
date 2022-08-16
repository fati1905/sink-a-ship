import java.util.ArrayList;

public class Coordinates {
    int x, y;

    public Coordinates(int xCoor, int yCoor){
        x = xCoor;
        y = yCoor;
    }

    public void displayCord(Coordinates cord){
        System.out.println("("+cord.x+", "+cord.y+")");
    }
}
