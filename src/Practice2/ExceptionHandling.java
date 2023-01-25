package Practice2;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println(ui());

        // Exception is an unwanted event in code
        // To catch this exception (BMW) we can try and catch blocks

        try {
            int car = Integer.parseInt("12");
            System.out.println("after parse");
        } catch (NumberFormatException nfe) {
            System.out.println("hey dude, you cannot write a string in a Integer");
        }
        System.out.println(" ");

        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        try{
            name();
            System.out.println("This will not print"); //if we have a real exception in try block this will not print
        }
        catch (NumberFormatException | NullPointerException e){ // don't forget add e
            System.out.println("there is na exception");
        }
        finally {
            System.out.println("it will always print and override the above try and catch blocks");
        }

        //>........................

    }

    public static void name() {
        int sam = Integer.parseInt("23");
    }
    public static int ui(){
        try{
            return 4;
        }
        catch (Exception e){
            return 6;
        }
        finally {
            return 7;  // finally override the above try and catch blocks
        }
    }

}
