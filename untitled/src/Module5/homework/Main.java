package Module5.homework;

import java.util.Arrays;
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

        //input parameters

        int price = 180;
        int person = 2;
        String hotel = "City Hotel";
        String cityName =  "Kiev";


        // ...find rooms on the input parameters

        Controller controller = new Controller();

        controller.requestRooms(price, person, hotel, cityName);
        System.out.println();

        //...to check matches rooms in the API
        controller.check(bookingComAPI, googleAPI);
        System.out.println();
        controller.check(bookingComAPI, tripAdvisorAPI);
        System.out.println();
        controller.check(googleAPI, tripAdvisorAPI);

        //...output information from DAOimplementation

        DAOImplementation daoImplementation = new DAOImplementation();

        System.out.println();
        daoImplementation.delete(rooms[0]);
        System.out.println();
        daoImplementation.save(rooms[1]);
        System.out.println();
        daoImplementation.upDate(rooms[2]);
        System.out.println();
        daoImplementation.findById(rooms[0]);


    }



}
