package Module11.Task1;

import Module11.FileUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

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

    public String readFile() throws IOException{
        String result;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter file name");
            String fileName = br.readLine();
            BufferedReader br1 = new BufferedReader(new FileReader(fileName + ".txt"));
            while ( (result = br1.readLine())!= null) {
                sb.append(result);
                sb.append(System.lineSeparator());
            }
            br1.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }
        result = sb.toString();

        Map<String, String> mapWord = new HashMap<>();

        String[] temp = result.split("\r\n");


        for (int i = 0; i > temp.length; i++) {
            if(mapWord.containsKey(temp[i])){
                temp[i] = " ";
            }

            System.out.println();
        }

        return sb.toString();
    }

    public String replaceWord (Map<String, String> param){

        return  null;
    }
    public static void main(String[] args) throws Exception {

        Task1 task1 = new Task1();

        //FileUtils.createFile();
        //FileUtils.writeToFile();

        System.out.println(task1.readFile());


    }


}
