package Module11.Task1;

import java.io.*;

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

    private String everything2;

    public void createFile(String filePath) throws Exception {


        File file = new File(filePath);
        if (file.createNewFile()) {
            System.out.println(filePath + " File created");

        } else {
            System.out.println("File " + filePath + " is exist");

        }

    }

    public void writeToFile(String filePath) throws Exception {

        String input = null;
        StringBuilder inputText = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(fileWriter);

        int counter = 1;
        try {
            while (counter > 0) {
                input = br.readLine();
                counter--;
            }
            try {
                bw.write(input);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bw.close();
            br.close();
        }
    }

    public String readFile(String pathFile) throws IOException{

        FileReader fileReader = new FileReader(pathFile);
        BufferedReader br = new BufferedReader(fileReader);


        return null;
    }

    public static void main(String[] args) throws Exception {

        Task1 task1 = new Task1();

        //task1.createFile("/Users/user/IdeaProjects/JavaCoreCourse/file.txt");
        task1.writeToFile("/Users/user/IdeaProjects/JavaCoreCourse/file.txt");
    }


}
