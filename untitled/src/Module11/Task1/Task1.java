package Module11.Task1;

import Module11.FileUtils;

import java.io.*;

/**
 * Created by PC on ${DATA}.
 * <p>
 * You should create method which replace words in the File and returns String with replaced values
 * a) read file, save to string var
 * b) replace words
 * c) return new string
 * String replacer(Map<String, String> map)
 */
public class Task1 {

    public String readFile(String pathFile) throws IOException{
        String result = null;
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            StringBuffer sb = new StringBuffer();
            String readLine = br.readLine();
            while (readLine != null) {
                sb.append(readLine);
                sb.append(System.lineSeparator());
            }
            result = sb.toString();
        } catch (IOException e) {
            System.out.println("file not found");
        }
        return result;
    }
    public static void main(String[] args) throws Exception {

        Task1 task1 = new Task1();

        //FileUtils.createFile();
        FileUtils.writeToFile();


    }


}
