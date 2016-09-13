package Module5.homework;

import java.util.Date;

/**
 * Created by user on 12.09.2016.
 */
public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {

        rooms[0] = new Room(0001, 180, 2, new Date(), "City Hotel", "Kiev");
        rooms[1] = new Room(0002, 120, 1, new Date(), "CityRent", "Kiev");
        rooms[2] = new Room(0003, 80, 1, new Date(), "Hotel2", "Kiev");
        rooms[3] = new Room(0004, 280, 2, new Date(), "RoomRent", "Kiev");
        rooms[4] = new Room(0005, 380, 2, new Date(), "City12", "Kiev");
    }

    @Override
    public Room[] findRooms(int price, int person, String cityName, String hotel) {

        Room[] resultFindRoom = new Room[rooms.length];
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i].equals(new Room(0002, price, person, new Date(), hotel, cityName))){
              resultFindRoom[i] = rooms[i];
            } else{
                resultFindRoom[i] = null;
            }
        }
        return resultFindRoom;
    }

    // Test
   /* public static void main(String[] args) {

        GoogleAPI googleAPI = new GoogleAPI();

        googleAPI.findRooms(180, 2, "Kiev", "City Hotel");

        Room[] result = googleAPI.findRooms(380, 2, "Kiev", "City12");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }*/
}
