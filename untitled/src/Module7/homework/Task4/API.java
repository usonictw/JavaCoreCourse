package Module7.homework.Task4;



import java.util.List;

/**
 * Created by user on 12.09.2016.
 */
public interface API {

    List<Room1> findRooms(int price, int person, String cityName, String hotel);

    List<Room1> getAllRooms();


}
