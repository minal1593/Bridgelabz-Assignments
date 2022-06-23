//snake and ladder program
import java.io.*; // used to allow user to input data

public class Snakes_and_Ladders {// start class


    //Main
    public static void main(String[] args) throws IOException {

        //Welcoming Screen

        BufferedReader myInput2 = new BufferedReader(new InputStreamReader(System.in));
        // Print the welcome screen and instructions
        System.out.println("\t\t\t\t\t\tWelcome To Snakes And Ladders\n\n");
        System.out.println("\t\t\t\t\t\t\tInstructions:");
        System.out.println("\t\t\t This program will simulate a regular snakes and ladders game, where you will be");
        System.out.println("\t\t\t facing the computer. You and the computer start at square 1, and the first one to");
        System.out.println("\t\t\t square 100 wins, however, there will be preset squares which will be the snakes or ladders.");
        System.out.println("\t\t\t Once you land on top of a snake you go down a few squares, and move up if you land");
        System.out.println("\t\t\t\t\t\t on the bottom of a ladder. Good Luck and Have FUN!!!");


        int counter = 100, iteration = -1; // sets the counter and iteration vaiables to be used in making the board
        System.out.println("-----------------------------------------------------Game Board-----------------------------------------------------");

        /*
        This while loop makes the board for the player to visualize what the
        game looks like, it uses a counter to increment or decrement by 1.
        It will also subtract by 9 or 10 when necessary to create a board
        exactly like the one given.
        */
        while (counter > 0) {// start while
            if (counter % 10 == 0 && counter != 100) {  // checks if the counter is at a 90, or 80...
                if (iteration == -1) {
                    // subtract 9 from the counter
                    // and sets it to start adding by one
                    counter -= 9;
                    iteration = 1;
                } else {
                    System.out.print(counter + "\t");
                    counter -= 10;
                    iteration = -1; // set the counter to start subtract by ones
                }
                if (counter != 0)
                    System.out.print("\n" + counter + "\t"); // just prints out the counter with a line breck
            } else
                System.out.print(counter + "\t"); // just prints out the counter
            counter += iteration; // sets counter to add by iteration
        }// end while
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------");


    }
}