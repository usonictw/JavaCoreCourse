package Module11.Task4;

import Module11.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on ${DATA}.
 * Check if file contains particular word. Pring 0 if no. Print number n which equals number of times it is contained in the file
 a) read file, save to string var
 b) calculate how many time the word occurs
 c) print result
 int checkWord(String word)
 */
public class Task4 {

    public int checkWord(String word) throws IOException{


        String var = FileUtils.readFile();
        String[] stringArray =  var.split("\n");

        for (int i = 0; i < stringArray.length; i++){
            String[] tempArray = stringArray[i].split(" ");
            if (tempArray.length > 0){

            }
        }






        return 0;
    }


}
