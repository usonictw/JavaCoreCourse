package Module11.Task1;

import Module11.FileUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Task1 {

    public String replaceWord(Map<String, String> param) throws IOException {
        String[] temp = FileUtils.readFile().split(System.lineSeparator());
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
            return sb.toString();
        }
    }
}
