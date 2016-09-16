package Module5.homework;

import java.util.Arrays;

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

        //Room rooms1 = new Room(0, 0, 0, null, null, null);
        int quantity = 0;
        for (Room i : rooms ){
            if ( i!=null ){
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

        int a1 = getQuantityRooms(resultSearch);
        int a2 = getQuantityRooms(resultSearch1);
        int a3 = getQuantityRooms(resultSearch2);

        int totalLengthNewArray = a1+a2+a3;
        Room[] totalArray = new Room[totalLengthNewArray];
        System.arraycopy(resultSearch, 0, totalArray, 0, a1);
        System.arraycopy(resultSearch1, 0, totalArray, a1, a2);
        System.arraycopy(resultSearch2, 0, totalArray, a1+a2, a3);

        System.out.println("Founded "+ totalLengthNewArray+ " rooms");
        System.out.println(Arrays.toString(totalArray));


        return totalArray;
    }

    Room[] check(API api1, API api2){

        Room[] resCheck = new Room[api1.getAllRooms().length];
        for(int i = 0; i < api1.getAllRooms().length; i++)
        if(api1.getAllRooms()[i].equals(api2.getAllRooms()[i])){
            resCheck[i] = api1.getAllRooms()[i];

        }

        int getQuantityRoom = getQuantityRooms(resCheck);
        System.out.println("Founded "+getQuantityRoom+" matches room(s)");
        System.out.println(Arrays.toString(resCheck));






       /* int price = 80;
        int person = 1;
        String hotel = "CityRent";
        String city = "Kiev";

        Room[] res1 = api1.findRooms(price, person, hotel, city);
        Room[] res2 = api2.findRooms(price, person, hotel, city);

        Room[] resCheck = new Room[res1.length];
        for (int i = 0; i < res1.length; i++) {
            if ((res1[i].equals(res2[i]))) {
                //System.out.println("Founded equal rooms");
                resCheck[i] = res1[i];
            }else {
                resCheck[i] = new Room(0, 0, 0, null, null, null);
            }

        }
        int getQuantityRoom = controller.getQuantityRooms(resCheck);
        System.out.println("Founded "+getQuantityRoom+" room(s)");

        Room[] newResCheck = new Room[getQuantityRoom];
        System.arraycopy(resCheck, 0, newResCheck, 0, getQuantityRoom);

        if (getQuantityRoom == 0) System.out.println("NO matches");


        */
        return resCheck;
    }

   /*public static void main(String[] args) {

        Controller controller = new Controller();


        Room[] check = controller.check(controller.apis[1], controller.apis[0]);


        for (Room i:check)
            System.out.println(i);


    }*/


}



