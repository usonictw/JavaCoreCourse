package Module11;

import Module11.Task1.Task1;
import Module11.Task2.Task2;
import Module11.Task3.Task3;
import Module11.Task4.Task4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by PC on ${DATA}.
 */
public class Test {

    public static void main(String[] args) throws Exception {

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();

        //FileUtils.createFile();
        //FileUtils.writeToFile();

        //System.out.println(FileUtils.readFile());
        Map<String, String> mapWord = new HashMap<>();
        mapWord.put("hell", "hello");
        mapWord.put("wor", "word");

        //System.out.println(task1.replaceWord(mapWord));

        //task2.rewriteFile(mapWord);
        //task3.FileContentMerged(mapWord);

        System.out.println(task4.checkWord("hello"));


    }
}
