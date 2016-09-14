package Module5.homework;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by user on 12.09.2016.
 */
public class GoogleAPI implements API {

   private Room[] rooms = new Room[5];

    public GoogleAPI() {

        rooms[0] = new Room(0001, 80, 1, new Date(), "CityRent", "Kiev");
        rooms[1] = new Room(0002, 80, 1, new Date(), "CityRent", "Kiev");
        rooms[2] = new Room(0003, 80, 1, new Date(), "CityRent", "Kiev");
        rooms[3] = new Room(0004, 80, 1, new Date(), "CityRent", "Kiev");
        rooms[4] = new Room(0005, 80, 1, new Date(), "CityRent", "Kiev");
    }

    @Override
    public Room[] findRooms(int price, int person, String hotel, String cityName) {

        Room[] resultFindRoom = new Room[rooms.length]; //Array "resultFindRooms" initialization
        int newIndex = 0; // new array index

        // this loop compare input parameters to the parameters of rooms and creates new sorted array
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i].equals(new Room(0002, price, person, new Date(), hotel, cityName))){
              resultFindRoom[newIndex] = rooms[i];
                newIndex++;
            } else{
                resultFindRoom[rooms.length-1-i+newIndex] = null;
            }
        }
        return resultFindRoom;
    }

    @Override
    public String toString() {
        return "GoogleAPI{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }


}
