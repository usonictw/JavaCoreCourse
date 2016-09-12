package Module5.homework;

/**
 * Created by user on 12.09.2016.
 *
 * Create Controller class. It contains global variable
 API apis[] = new API[3];
 which contains all impelentations of API interface.
 Also, controller contains two methods
 Room[] requstRooms(int price, int persons, String city, String hotel)
 which finds all the rooms with requested params. Method use all apis available to make search.
 Found rooms create to DB
 */

public class Controller {

    private API[] apis;// = new API[3];

    public Controller(API[] apis) {
        this.apis = apis;
    }

    Room[] requestRooms(int price, int persons, String city, String hotel){


        return null;
    }

    Room[] check(API api1, API api2){

        return null;
    }


}
