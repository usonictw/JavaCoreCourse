package Module9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by user on 17.10.2016.
 */
public class Test {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        userList.add(new User(001, "Bob"));
        userList.add(new User(002, "John"));
        userList.add(new User(003, "Peter"));
        userList.add(new User(004, "Dilan"));

        /Function<User, Empl> userToEmpl = new Function<User, Empl>() {
            @Override
            public Empl apply(User user) {
                return (new Empl(user.getId(), user.getName()));
            }
        };



        List<Empl> emplList = userList.stream().filter(someCondition()).map(userToEmpl).collect(Collectors.toList());



        System.out.println(emplList);


    }

    public static Predicate<User> someCondition(){

        return u -> u.getId() < 5 && !u.getName().equalsIgnoreCase("Dilan");
    }
}

