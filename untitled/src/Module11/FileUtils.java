package Module11;

import java.io.*;
import java.util.Scanner;


/**
 * Created by PC on ${DATA}.
 */
public class FileUtils {

    public static void createFile() throws Exception {


        String fileName;
        System.out.println("enter name of file");
        try (Scanner sc = new Scanner(new InputStreamReader(System.in))) {
            fileName = sc.next();
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println(fileName + " created in the root of the project");
            } else {
                System.out.println("File " + fileName + " is exist");
            }
        }
    }

    public static void writeToFile() throws IOException {

        String fileName;
        String text;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("enter the file name which will write text");
            fileName = br.readLine();
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt"));
            System.out.println("enter the text that will be written to a file. to exit from the recording mode, press \"Space\"");
            while (!((text = br1.readLine()).equals(" "))) {
                bw.write(text + System.lineSeparator());
                bw.flush();
            }
            bw.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found. if you want to create a file, press 1, if not - 0");

        }

    }
}


