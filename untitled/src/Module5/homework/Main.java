package Module5.homework;

import java.util.Date;
import java.text.SimpleDateFormat;


/**
 * Created by user on 12.09.2016.
 */
public class Main {

    public static void main(String[] args) {

        Date date1 = new Date();
        //SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        //System.out.println(format1.format(date1));


        Room room1 = new Room(0001,180,2, date1, "City Hotel", "Kiev");
        Room room2 = new Room(0002,180,2, date1, "City Hotel", "Kiev");
        Room room3 = new Room(0003,190,4, date1, "City Hotel", "Kiev");
        Room room4 = new Room(0004,190,3, date1, "City Hotel", "Kiev");
        Room room5 = new Room(0005,120,1, date1, "City Hotel", "Kiev");


    }



}
