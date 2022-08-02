import java.io.*;
public class helper {
    public String getUserInput() {
        String inputLine=null;
        System.out.print("prompt" + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0) return null;
        }catch (IOException e){
            System.out.println("IoException: "+ e);
        }
        return inputLine;
    }
}
//usage example : String guess = helper.getUserInput("Enter a number");