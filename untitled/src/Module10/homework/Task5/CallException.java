package Module10.homework.Task5;

import Module9.User;

import java.util.List;

/**
 * Created by user on 26.10.2016.
 */
public class CallException {


    public void callException(List<User> userList) throws MyException1 {

        // проверяем список на тип валюты и "выбрасываем" ошибку если в списке есть валюта РУБ

        for (User u : userList) {
            if (!u.getCurrency().equals("RUB")) {
                System.out.println("ok");
            } else {
                throw new MyException3("Using RUB");
            }

        }

        // проверка длины имени юзера, Им Юзера должно быть не менее 4 символов

        for(User u : userList){

            if(u.getName().length() > 4){
                System.out.println("ok");
            }else throw new MyException2("Name have to be more 4 chars");
        }

        //







    }




}


