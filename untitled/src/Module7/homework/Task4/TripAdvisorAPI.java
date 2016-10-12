package Module7.homework.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by user on 12.09.2016.
 */
public class TripAdvisorAPI implements API {

    private List<Room1> room1s = new ArrayList<Room1>();

    public TripAdvisorAPI() {

        room1s.add(new Room1(0001, 180, 2, new Date(), "City Hotel", "Kiev"));
        room1s.add(new Room1(0002, 180, 3, new Date(), "City Hotel", "Kiev"));
        room1s.add(new Room1(0003, 180, 1, new Date(), "City Hotel", "Kiev"));
        room1s.add(new Room1(0004, 180, 1, new Date(), "City Hotel", "Kiev"));
        room1s.add(new Room1(0005, 180, 1, new Date(), "City Hotel", "Kiev"));
    }

    @Override
    public List<Room1> getAllRooms() {

        return room1s;
    }

    @Override
    public List<Room1> findRooms(int price, int person, String hotel, String cityName) {

        List<Room1>resultFindRoom1s = new ArrayList<Room1>(); //List "resultFindRoom1s" initialization

        System.out.println("found rooms in the TripAdvisorAPI");
        for (Room1 room1 : room1s){
            if (room1.equals(new Room1(0001, price, person, new Date(), hotel, cityName))) {
                resultFindRoom1s.add(room1);
                //newIndex++;
            }

        }
        return resultFindRoom1s;
    }
    @Override
    public String toString() {
        return "TripAdvisorAPI{" +
                "room1s=" + room1s +
                '}';
    }
}
