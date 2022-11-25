import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * FileReading class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class FileReading {

    //Task 1

    /**
     * reads a name from a file and returns it
     * @param fileName holds the file name
     * @return returns
     * @throws Exception throws any exceptions
     */
    public String readName1(String fileName) throws Exception {

        File fileOfNames = new File(fileName);
        Scanner fileScan = new Scanner(fileOfNames);
        String name = fileScan.next();
        String surname = fileScan.next();
        fileScan.close();
        return name + " " + surname;

    }

    //Task 2

    /**
     * reads a first and a last name from a file and then returns the full name, or returns invalid filename
     * @param fileName2 holds the file name
     * @return returns the full name
     */
    public String readName2(String fileName2) {

        try {

            File fileOfNames = new File(fileName2);
            Scanner fileScan = new Scanner(fileOfNames);
            String name = fileScan.next();
            String surname = fileScan.next();
            fileScan.close();
            return name + " " + surname;
        } catch (FileNotFoundException ex) {
            return ("Invalid filename");
        }
    }

    //Task 3

    /**
     *reads multiple names from a file and returns an array of those names
     * @param fileName3 holds file name
     * @return returns array of names
     * @throws Exception
     */
    public String[] readNames(String fileName3) throws Exception {
        String[] names = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        File fileOfNames = new File(fileName3);
        Scanner fileScan = new Scanner(fileOfNames);

        for (int i = 0; i < 10; i++) {

            String name = fileScan.nextLine();
            names[i] = name;
        }
        fileScan.close();
        return names;
    }


    //Task 4

    /**
     * reads 20 numbers from a file and outputs an array of those numbers, leaves 0's if it is less than 20
     * @param fileName4 holds the filename
     * @return returns an array of the read numbers
     */
    public int[] readNumbers1(String fileName4) {
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        try {
            int m = 0;
            File fileOfNumbers = new File(fileName4);
            Scanner fileScan = new Scanner(fileOfNumbers);

            while (m < 20) {
                int num = fileScan.nextInt();
                nums[m] = num;

                m++;
            }
            fileScan.close();
        } catch (NoSuchElementException ex) {
            return nums;
        } catch (FileNotFoundException ex) {
            System.out.println("invalid file name");
        }
        return nums;
    }


            //Task5

    /**
     * reads a file and stores numbers in an array but leaves a 0 if there is another data type than int when read
     * @param fileName5 holds file name
     * @return return array of numbers
     */
            public int[] readNumbers2(String fileName5) {
                int[] nums = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                int i = 0;
                try {
                    File fileOfNumbers = new File(fileName5);
                    Scanner fileScan = new Scanner(fileOfNumbers);

                    while(i < 20 && fileScan.hasNext()) {
                        try {

                            int num = fileScan.nextInt();
                            nums[i] = num;
                            i++;

                        } catch (InputMismatchException ex) {
                            nums[i] = 0;
                        }
                    }
                    fileScan.close();

                } catch (FileNotFoundException ex) {
                        System.out.println("d");
                }


                return nums;
            }

    //Task 6

    /**
     * reads a file with names and assigns a number to that name
     * @param fileName6 holds file name
     * @return returns the 'address book'
     */
    public String[] readAddressBook(String fileName6) {
        String[] names = {"0", "1", "2", "3", "4"};
        try {
            File fileOfNames = new File(fileName6);
            Scanner fileScan = new Scanner(fileOfNames);

            for (int i = 0; i < 5; i++) {
                String name = fileScan.nextLine();
                String num = fileScan.nextLine();
                names[i] = name + ": " + num;
            }
            fileScan.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Invalid file name");
        }
        return names;

    }
}
