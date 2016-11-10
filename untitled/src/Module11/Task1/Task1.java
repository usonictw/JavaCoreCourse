package Module11.Task1;

import Module11.FileUtils;

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

    public String replaceWord(Map<String, String> param) throws IOException {
        String[] temp = FileUtils.readFile().split("\r\n");
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int k = 0; k < temp.length; k++) {
            for (int i = 0; i < param.size(); i++) {
                if (param.containsKey(temp[k])) {
                    temp[k] = param.get(temp[k]);
                    flag = true;
                }
            }
            sb.append(temp[k]);
            sb.append("\n");
        }
        if (!flag) {
            System.out.println("There are no words to replace");
            return sb.toString();
        } else {
            System.out.println("replacement done");
            return sb.toString();
        }
    }
}
