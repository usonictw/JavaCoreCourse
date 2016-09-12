package Module5.homework;

import java.util.Date;

/**
 * Created by user on 12.09.2016.
 */
public class BookingComAPI implements API {

    private Room rooms[] = new Room[5];

    public BookingComAPI() {

        rooms[0] = new Room(0001, 180, 2, new Date(), "City Hotel", "Kiev");
        rooms[1] = new Room(0002, 120, 1, new Date(), "CityRent", "Kiev");
        rooms[2] = new Room(0003, 80, 1, new Date(), "Hotel2", "Kiev");
        rooms[3] = new Room(0004, 280, 2, new Date(), "", "Kiev");
        rooms[4] = new Room(0005, 380, 2, new Date(), "City Hotel", "Kiev");

    }

    @Override
    public Room[] findRooms(int price, int person, String cityName, String hotel) {

        for (int i=0; i<5; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == person && rooms[i].getCityName() == cityName && rooms[i].getHotelName() == hotel) {

                Room[]

            }
        }


        return new Room[0];
    }


}
