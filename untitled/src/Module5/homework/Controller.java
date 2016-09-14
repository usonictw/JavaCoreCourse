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

    private API[] apis = new API[3];


    public Controller() {

        apis[0] = new GoogleAPI();
        apis[1] = new BookingComAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public int getQuantityRooms(Room [] rooms){

        int quantity = 0;
        for (Room i : rooms ){
            if (i != null){
                quantity++;
            }
        }

        return quantity;
    }

    public Room[] requestRooms(int price, int person, String hotel, String city){

        //Room[] resultSearch = new Room[100];

        Room[] resultSearch = apis[0].findRooms(price, person, hotel, city);
        Room[] resultSearch1 = apis[1].findRooms(price, person, hotel, city);
        Room[] resultSearch2 = apis[2].findRooms(price, person, hotel, city);

        Controller controller = new Controller();

        int a1 = controller.getQuantityRooms(resultSearch);
        int a2 = controller.getQuantityRooms(resultSearch1);
        int a3 = controller.getQuantityRooms(resultSearch2);

        int totalLengthNewArray = a1+a2+a3;
        Room[] totalArray = new Room[totalLengthNewArray];
        System.arraycopy(resultSearch, 0, totalArray, 0, a1);
        System.arraycopy(resultSearch1, 0, totalArray, a1, a2);
        System.arraycopy(resultSearch2, 0, totalArray, a1+a2, a3);


        return totalArray;
    }

    Room[] check(API api1, API api2){

        int price = 80;
        int person = 2;
        String hotel = "CityRent";
        String city = "Kiev";

        Room[] res1 = api1.findRooms(price, person, city, hotel);
        Room[] res2 = api2.findRooms(price, person, city, hotel);




        return null;
    }

    public static void main(String[] args) {

        Controller controller = new Controller();

        Room[] total = controller.apis[0].findRooms();


        for (Room i:total)
            System.out.println(i);


    }


}



