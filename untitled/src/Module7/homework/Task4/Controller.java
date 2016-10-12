package Module7.homework.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 12.09.2016.
 *
 * Create Controller class. It contains global variable
 API apis[] = new API[3];
 which contains all implementations of API interface.
 Also, controller contains two methods

 Room1[] requestRooms(int price, int persons, String city, String hotel)
 which finds all the rooms with requested params. Method use all apis available to make search.
 Found rooms create to DB

 Room1[] check(API api1, API api2)
 Check how many the same rooms two different apis return
 */

public class Controller {

    private List<API> apis = new ArrayList<API>();


    public Controller() {

        apis.add(new GoogleAPI());
        apis.add(new BookingComAPI());
        apis.add(new TripAdvisorAPI());
    }

    // method for counting number of room1s (!null)
    public int getQuantityRooms(List<Room1> room1s){

        //Room1 rooms1 = new Room1(0, 0, 0, null, null, null);
        int quantity = 0;
        for (Room1 i : room1s){
            if ( i!=null ){
                quantity++;
            }
        }

        return quantity;
    }

    public List<Room1> requestRooms(int price, int person, String hotel, String city, API apis){

        List<Room1> resultSearch = new ArrayList<Room1>();

        resultSearch.addAll(apis.findRooms(price, person, hotel, city));

        return resultSearch;
    }

    // method for checking matches of the rooms in API
    List<Room1> check(API api1, API api2){

        List<Room1>matchesRoom1 = new ArrayList<Room1>(api1.getAllRooms());

       if(matchesRoom1.retainAll(api2.getAllRooms())){
           return matchesRoom1;

       }else
           return null;



    }

    public List<API> getApis() {
        return apis;
    }
}



