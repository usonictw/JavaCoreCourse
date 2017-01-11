package Module11.Task4;

import Module11.FileUtils;
import java.io.IOException;

public class Task4 {

    public int checkWord(String word) throws IOException {
        int counterMatches = 0;
        String var = FileUtils.readFile();
        String[] stringArray = var.split(System.lineSeparator());
        for (String aStringArray : stringArray) {
            String[] tempArray = aStringArray.split(" ");
            if (tempArray.length > 1) {
                for (String aTempArray : tempArray) {
                    if (aTempArray.equals(word)) {
                        counterMatches++;
                    }
                }
            }
            if (aStringArray.equals(word)) {
                counterMatches++;
            }
        }
        return counterMatches;
    }
}
