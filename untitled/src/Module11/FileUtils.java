package Module11;

import java.io.*;

/**
 * Created by PC on ${DATA}.
 */
public  class FileUtils {

    public static void createFile(String filePath) throws Exception {
        File file = new File(filePath);
        if (file.createNewFile()) {
            System.out.println(filePath + " File created");
        } else {
            System.out.println("File " + filePath + " is exist");
        }
    }

    public static void writeToFile(String filePath) throws IOException {
        String input = null;
        int counter = 2;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the two line of text");
            while (counter > 0) {
                input = br.readLine();
                counter--;
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
                bw.write(input);
            } catch (IOException e) {
                System.out.println("file not found");
            }
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
