package Practice2;

public class Skoda {
    public static void main(String[] args) {
        fx();
        System.out.println(method());

    }

    // exception handling
    // Firstly tou need to create method

    public static void fx(){
        try{
            Integer var = Integer.parseInt(""); // there the arguments is null "";
        }
        catch (NumberFormatException | NullPointerException exception){
            System.out.println("do we really got an exception");
        }
        finally {
            System.out.println("this will over ride the both statement and prints the value");
        }
    }
    public static String[] method(){
        String[] color = new String[5];
        color[1] = "Pink";
        color[2] = "Blue";
        color[3] = "Red";
        color[4] = "White";
        return color;
    }


}
