package Module11;

import java.io.*;
import java.util.NoSuchElementException;
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
                System.out.println(fileName + " File created in the root of the project");
            } else {
                System.out.println("File " + fileName + " is exist");
            }
        }
    }

    public static void writeToFile() throws IOException {
        String fileName = "";
        String input = " ";
        int n0Line = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String read;
            read = br.readLine();
            n0Line = Integer.valueOf(read);
        } catch (NumberFormatException n) {
            System.out.println("You have to Enter the number");
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the " + n0Line + " line of text");
            while (n0Line > 0) {
                //input = br.readLine();
                input = input + br.readLine();
                n0Line--;
            }

        }

        System.out.println("Enter a file name");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = br.readLine();
        } catch (NoSuchElementException e) {
            System.out.println();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt"))) {
            bw.newLine();
            bw.write(input);
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}


