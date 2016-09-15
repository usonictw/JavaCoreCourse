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

        Room[] rooms = new Room[5];
        //Create five room
        for (int i =0; i < rooms.length; i++) {
            rooms[i] = new Room(0001, 180, 2, date1, "City Hotel", "Kiev");
            rooms[i] = new Room(0002, 180, 2, date1, "City Hotel", "Kiev");
            rooms[i] = new Room(0003, 190, 4, date1, "City Hotel", "Kiev");
            rooms[i] = new Room(0004, 190, 3, date1, "City Hotel", "Kiev");
            rooms[i] = new Room(0005, 120, 1, date1, "City Hotel", "Kiev");
        }


        //simulate search rooms

        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        //search parameters

        int price = 180;
        int person = 2;
        String hotel = "City Hotel";
        String cityName =  "Kiev";


        // ...

        Controller controller = new Controller();

        controller.requestRooms(price, person, hotel, cityName);
        controller.check(googleAPI, bookingComAPI);



    }



}
