public class Game {
    public static void main(String[] args){
        int numOfGuess =0;
        Ship s = new Ship();
        boolean isAlive = true;
        s.getLoc();
        String result = "miss";
        while(isAlive){
            String guess = UserInput.readLine();
            try{
                result = s.isHit(Integer.parseInt(guess));
                System.out.println(result);
                numOfGuess++;
            } catch (Exception e) {
                System.out.println("Please print a number!");
            }
            if(result.equals("kill")){
                isAlive =false;
                System.out.println("You took "+ numOfGuess+ " guesses");
            }
        }
    }
}
