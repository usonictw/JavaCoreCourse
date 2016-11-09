package Module11.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    private String fileName;

    private String readFile() throws IOException {
        String result;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter file name");
            fileName = br.readLine();
            BufferedReader br1 = new BufferedReader(new FileReader(fileName + ".txt"));
            while ( (result = br1.readLine())!= null) {
                sb.append(result);
                sb.append(System.lineSeparator());
            }
            br1.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }
        return sb.toString();
    }

    public String replaceWord(Map<String, String> param) throws IOException {
        String[] temp = readFile().split("\r\n");
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < param.size(); i++) {
            for (int k = 0; k < temp.length; k++) {
                if (param.containsKey(temp[i])) {
                    sb.append(temp[i]).append(" to ");
                    temp[i] = param.get(temp[i]);
                    sb.append(temp[i]).append("\n");
                    flag = true;
                }
            }
        }
        if (!flag) {
            return "There are no words to replace";
        } else {
            System.out.println("replacement of the following words");
            return sb.toString();
        }
    }

    public String getFileName() {
        return fileName;
    }
}
