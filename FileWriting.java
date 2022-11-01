import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
/**
 * FileWriting class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
public class FileWriting {

	//Task 1
	public String writeYourName(String nameX) throws Exception {
        String filename = "FiileWritingTest.txt";
        PrintWriter out = new PrintWriter (new BufferedWriter(new FileWriter(filename)));
        Scanner stringScanner = new Scanner(nameX);

        while (stringScanner.hasNext()){
            String name = stringScanner.next();
            out.println(name);
        }
        out.close();
        return filename;
    }

	
	//Task 2
	public String writeRandomNumbers(int numX) throws Exception {
        String filename2 = "randomNumbersFile";
        PrintWriter out = new PrintWriter (new BufferedWriter(new FileWriter(filename2)));

        if (numX <= 20) {

            for (int i = 0; i <= numX; i++) {

                int min = 9999;
                int max = 1000;
                int random_int = (int) (Math.random() * (max - min + 1) + min);
                out.println(random_int);
            }

        } else {
            return ("Only a maximum of 20 numbers can be generated.");
        }

        out.close();
		return filename2;
	}

}
