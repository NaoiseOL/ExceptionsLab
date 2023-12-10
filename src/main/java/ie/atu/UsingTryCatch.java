package ie.atu;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UsingTryCatch {

    public static void main(String[] args){
        int x = 0;


        while(x<1) {
            System.out.println("Please enter a number between 0-9: ");
            Scanner myScan = new Scanner(System.in);
            try {
                String input = myScan.nextLine();

                int myNum = Integer.parseInt(input);

                if (myNum >= 0 && myNum <= 9) {
                    System.out.println("You Entered " + myNum);
                    x++;
                } else {
                    System.out.println("Not a valid Input");
                }
            } catch (NumberFormatException e) {
                System.out.println("Not a valid Number value");

            }
        }

    }
}
