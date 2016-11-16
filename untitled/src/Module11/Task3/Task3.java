package Module11.Task3;

import Module11.FileUtils;
import Module11.Task1.Task1;

import java.io.*;
import java.util.Map;

public class Task3 extends Task1{

    public void FileContentMerged(Map<String, String> replaceWord) throws IOException{
        String[] var = replaceWord(replaceWord).split(System.lineSeparator());
        BufferedWriter bw = new BufferedWriter(new FileWriter(FileUtils.getFileName() + ".txt", true));
        try {
            for (String s : var){
                bw.newLine();
                bw.append(s);
            }
        }catch (IOException e){
            System.out.println();
        }
        bw.close();
    }
}
