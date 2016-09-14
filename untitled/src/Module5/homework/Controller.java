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

    public int getQuantityRooms(Room [] rooms){

        int quantity = 0;
        for (int i = 0; i < rooms.length; i++ ){
            if (rooms[i] != null){
                quantity++;
            }
        }

    return quantity;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel){

        //Room[] resultSearch = new Room[100];

        Room[] resultSearch = apis[0].findRooms(price, persons, city, hotel);
        Room[] resultSearch1 = apis[1].findRooms(price, persons,city, hotel);
        Room[] resultSearch2 = apis[2].findRooms(price, persons,city, hotel);

        Controller controller = new Controller();

        int a1 = controller.getQuantityRooms(resultSearch);
        int a2 = controller.getQuantityRooms(resultSearch1);
        int a3 = controller.getQuantityRooms(resultSearch2);

        int totalLengthNewArray = a1+a2+a3;
        Room[] totalArray = new Room[totalLengthNewArray];
        System.arraycopy(resultSearch, 0, totalArray, 0, a1);
        System.arraycopy(resultSearch1, 0, totalArray, a1, a2);
        System.arraycopy(resultSearch2, 0, totalArray, a2, a3);


        return totalArray;
    }

    Room[] check(API api1, API api2){

        return null;
    }

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.requestRooms(80, 1, "Kiev", "Hotel2");




    }
}



