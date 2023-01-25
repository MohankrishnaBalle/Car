package Practice2;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int pass = 0, fail= 0;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no of subjects");
        int subCount = obj.nextInt();

        int[] sub = new int[6];
        if (subCount <= 0){
            System.out.println("Invalid input range");
            System.exit(0);
        }

        System.out.println("Enter "+subCount+ " subjects");

        for (int i = 0; i < sub.length; i++) {
            sub[i] = obj.nextInt();

            if (sub[i] < 0){
                System.out.println("marks should be positive");
            }
        }
        for (int i = 0; i < sub.length; i++) {
            if (sub[i] > 50){
                pass++;
            }
            else {
                fail++;
            }
        }
        if (pass>0&& fail>0){
            System.out.println("passed in" +pass+ "and failed in" + fail +"subjects");
        } else if (fail == 0) {
            System.out.println("He passed in all subjects");
        }
        else {
            System.out.println("He failed in all subjects");
        }


//        System.out.println(letsCreateAMethod("say some thing i'm giving upon you")); // this is exception
//        // for parameterised method letsCreateAMethod to invoke the method
//
//        method();
//
//    }
//    public static String letsCreateAMethod(String parameters){
//        return parameters;


    }

}