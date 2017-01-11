package Module11.Task2;

import Module11.FileUtils;
import Module11.Task1.Task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Task2 extends Task1 {

    public void rewriteFile(Map<String, String> replaceWord) throws IOException {
        String var = replaceWord(replaceWord);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FileUtils.getFileName() + ".txt"))) {
            bw.write(var);
        }
    }
}
