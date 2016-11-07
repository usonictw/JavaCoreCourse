package Module11.Task1;

import java.io.*;

/**
 * Created by PC on ${DATA}.
 *
 * You should create method which replace words in the File and returns String with replaced values
 a) read file, save to string var
 b) replace words
 c) return new string
 String replacer(Map<String, String> map)

 */
public class Task1{

    private String everything2;

    public void createFile(String filePath) throws Exception {


        File file = new File(filePath);
        if(file.createNewFile()){
            System.out.println(filePath + " File created");

        } else {
            System.out.println("File " + filePath + " is exist");

        }

    }

    public void writeToFile(String filePath) throws Exception{

        String inputText = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int counter = 1;
        while (counter > 0)




        try {

            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fileWriter);
        }
        catch (IOException e){
            System.out.println(" file not found ");
        }



    }

    public static void main(String[] args) throws Exception {

        Task1 task1 = new Task1();

        task1.createFile("hello");
    }






}
