import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    public String readName1(String fileName) throws Exception {

        File fileOfNames = new File(fileName);
        Scanner fileScan = new Scanner(fileOfNames);
        String name = fileScan.next();
        String surname = fileScan.next();
        fileScan.close();
        return name + " " + surname;

    }

    //Task 2
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
    public int[] readNumbers1(String fileName4) {
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        try {
            int i = 0;
            File fileOfNumbers = new File(fileName4);
            Scanner fileScan = new Scanner(fileOfNumbers);

            while (i < 20) {
                int num = fileScan.nextInt();
                nums[i] = num;

                i++;
            }
            fileScan.close();
        } catch (NoSuchElementException ex) {
            return nums;
        } catch (FileNotFoundException ex) {
            System.out.println("invalid file name");
        }
        return nums;
    }

/*
        //Task5
        public int[] readNumbers2(String fileName5) {
            int[] nums = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            try {
                int i = 0;
                File fileOfNumbers = new File(fileName5);
                Scanner fileScan = new Scanner(fileOfNumbers);

                while(i < 20) {

                        int num = fileScan.nextInt();
                        nums[i] = num;
                        i++;
                    } else {

                    }

                    fileScan.close();
                }
            } catch (FileNotFoundException ex) {
                System.out.println("invalid file name");
            }
            return nums;
        }
*/
    //Task 6
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

