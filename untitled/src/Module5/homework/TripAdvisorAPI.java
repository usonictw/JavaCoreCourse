package Module5.homework;

import java.util.Date;

/**
 * Created by user on 12.09.2016.
 */
public class TripAdvisorAPI implements API {

    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {

        rooms[0] = new Room(0001, 180, 2, new Date(), "City Hotel", "Kiev");
        rooms[1] = new Room(0002, 120, 1, new Date(), "CityRent", "Kiev");
        rooms[2] = new Room(0003, 80, 1, new Date(), "Hotel2", "Kiev");
        rooms[3] = new Room(0004, 280, 2, new Date(), "CityU", "Kiev");
        rooms[4] = new Room(0005, 380, 2, new Date(), "City Hotel", "Kiev");
    }

    @Override
    public Room[] findRooms(int price, int person, String cityName, String hotel) {

        Room[] resultFindRooms = new Room[5];

        for (int i = 0; i < 5; i++){
            if (rooms[i].equals(new Room(0003, price, person, new Date(), hotel, cityName))){

                resultFindRooms[i] = rooms[i];
            }
            else{
                resultFindRooms[i] = null;
            }
        }
        return resultFindRooms;
    }
}
