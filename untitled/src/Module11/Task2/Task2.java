package Module11.Task2;

import Module11.Task1.Task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Created by PC on ${DATA}.
 * You should create method which replace words in the File and rewrite File content with new values
 * a) read file, save to string var
 * b) replace words
 * c) rewrite file with string
 * File fileContentReplacer(Map<String, String> map)
 */
public class Task2 extends Task1 {


    public void rewriteFile(Map<String, String> replaceWord) throws IOException {
        String temp = replaceWord(replaceWord);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(getFileName() + ".txt"))) {
            bw.write(temp);
        }

    }
}
