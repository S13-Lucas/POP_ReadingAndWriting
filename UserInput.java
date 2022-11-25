import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * UserInput class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
        public class UserInput {
    //Task 1

    /**
     * takes the users input and then outputs it to the terminal
     * @return returns the output
     */
    public String sayHello() {
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.print("Enter your name:");
        name = keyboard.next();
        keyboard.close();
        return "Hello " + name;
    }

    //Task 2

    /**
     * asks the user for a number 10 times and then outputs an array with those 10 numbers
     * @return outputs the nums array
     */
    public int[] readTenNumbers() {
        int[] nums = new int[10];
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("enter number " + i);
            int num = keyboard.nextInt();
            nums[i] = num;
        }
        keyboard.close();
        return nums;
    }



	//Task 3

    /**
     * takes a name input ten times and outputs them
     * @return returns array with names
     */
	 public String[] readTenNames() {
         String[] names = new String[10];
         Scanner keyboard = new Scanner(System.in);
         for (int i = 0; i < 10; i++) {
             System.out.println("enter name " + i);
             String name = keyboard.next();
             names[i] = name;
         }
         keyboard.close();
         return names;
	}
}

// Michael, Saru, Christopher, Sylvia, Paul, Harry, Phillipa, Gabriel, Jett, Ash