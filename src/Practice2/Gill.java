package Practice2;

import java.util.Scanner;

public class Gill {
    static int powerValue = 24;

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int pass = 0, fail = 0;
        System.out.println("Enter no of subjects");
        int sub = obj.nextInt();
        if(sub < 0){
            System.out.println("Subjects should be more than 5");
            System.exit(0);
        }

        System.out.println("Number of subjects is " +sub + "");

        int[] noOfSub = new int[sub];

        for (int i = 0; i < sub; i++) {
            noOfSub[i] = obj.nextInt();

            if (noOfSub[i] < 0){
                System.out.println("Marks should be positive");
            } else if (noOfSub[i] < 50) {
                fail++;
            }else if (noOfSub[i] > 50){
                pass++;
            }
        }
        System.out.println("bmw passed in " + pass + "and failed in " + fail);

    }


}
