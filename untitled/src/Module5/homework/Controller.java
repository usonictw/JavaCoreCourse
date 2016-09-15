package Module5.homework;

/**
 * Created by user on 12.09.2016.
 *
 * Create Controller class. It contains global variable
 API apis[] = new API[3];
 which contains all implementations of API interface.
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
        int person = 1;
        String hotel = "CityRent";
        String city = "Kiev";

        Room[] res1 = api1.findRooms(price, person, hotel, city);
        Room[] res2 = api2.findRooms(price, person, hotel, city);

        Room[] resCheck = new Room[res1.length];
        for (int i = 0; i < res1.length; i++) {
            if ((res1[i].equals(res2[i]) && (res1[i] != null && res2[i] != null))) {
                //System.out.println("Founded equal rooms");
                resCheck[i] = res1[i];
            }

        }
        Controller controller = new Controller();
        int getQuantityRoom = controller.getQuantityRooms(resCheck);
        System.out.println("Founded "+getQuantityRoom+" room(s)");

        Room[] newResCheck = new Room[getQuantityRoom];
        System.arraycopy(resCheck, 0, newResCheck, 0, getQuantityRoom);

        if (getQuantityRoom == 0) System.out.println("NO matches");


        return newResCheck;
    }

   public static void main(String[] args) {

        Controller controller = new Controller();


        Room[] check = controller.check(controller.apis[0], controller.apis[1]);


        for (Room i:check)
            System.out.println(i);


    }


}



