package Module7.homework.Task4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.Math.random;


/**
 * Created by user on 12.09.2016.
 */
public class Main {


    public static void main(String[] args) {

        //System.out.println(random());

        Date date1 = new Date();
        //SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        //System.out.println(format1.format(date1));

        List<Room1> room1s = new ArrayList<Room1>();
        //Create five room

            room1s.add(new Room1(0001, 180, 2, date1, "City Hotel", "Kiev"));
            room1s.add(new Room1(0002, 180, 2, date1, "City Hotel", "Kiev"));
            room1s.add(new Room1(0003, 190, 4, date1, "City Hotel", "Kiev"));
            room1s.add(new Room1(0004, 190, 3, date1, "City Hotel", "Kiev"));
            room1s.add(new Room1(0005, 120, 1, date1, "City Hotel", "Kiev"));



        //simulate search room1s

        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        //input parameters

        int price = 180;
        int person = 2;
        String hotel = "City Hotel";
        String cityName =  "Kiev";


        // ...find room1s on the input parameters

        Controller controller = new Controller();


        for(Room1 r : controller.requestRooms(price, person, hotel, cityName, controller.getApis().get(0))){
            System.out.println(r);
        }
        System.out.println();
        for(Room1 r : controller.requestRooms(price, person, hotel, cityName, controller.getApis().get(1))){
            System.out.println(r);
        }
        System.out.println();
        for(Room1 r : controller.requestRooms(price, person, hotel, cityName, controller.getApis().get(2))){
            System.out.println(r);
        }
        System.out.println();

        System.out.println("...to check matches room1s in the API");
        for(Room1 r : controller.check(bookingComAPI, googleAPI)){
            System.out.println(r);
        }
        System.out.println();
        controller.check(bookingComAPI, tripAdvisorAPI);
        System.out.println();
        controller.check(googleAPI, tripAdvisorAPI);

        //...print information from DAOimplementation

        DAOImplementation daoImplementation = new DAOImplementation();

        System.out.println();
        daoImplementation.delete(room1s.get(0));
        System.out.println();
        daoImplementation.save(room1s.get(1));
        System.out.println();
        daoImplementation.upDate(room1s.get(2));
        System.out.println();
        daoImplementation.findById(room1s.get(0));


    }



}
