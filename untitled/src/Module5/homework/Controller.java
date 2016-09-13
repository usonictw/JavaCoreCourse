package Module5.homework;

/**
 * Created by user on 12.09.2016.
 *
 * Create Controller class. It contains global variable
 API apis[] = new API[3];
 which contains all impelentations of API interface.
 Also, controller contains two methods

 Room[] requestRooms(int price, int persons, String city, String hotel)
 which finds all the rooms with requested params. Method use all apis available to make search.
 Found rooms create to DB

 Room[] check(API api1, API api2)
 Check how many the same rooms two different apis return
 */

public class Controller {

    static private API[] apis = new API[3];


    public Controller() {

        apis[0] = new GoogleAPI();
        apis[1] = new BookingComAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel){

        Room[] resultSearch = new Room[apis.length];

        Controller controller = new Controller();

        for (int i = 0; i < apis.length; i++) {
            controller.apis[i].findRooms(price, persons, city, hotel);
        }
        return null;
    }

    Room[] check(API api1, API api2){

        return null;
    }


    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.requestRooms(180, 2, "Kiev", "Hotel2");
    }
}



