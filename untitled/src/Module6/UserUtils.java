package Module6;

/**
 * Created by PC on ${DATA}.
 */
public final class UserUtils {

    public User[] uniqueUsers(User[] users){

        for (int i = 0; i < users.length; i++)
        if(users[0].equals(users[i])){
            users[i] = null;
        }

        return users;
    }
    public User[] usersWithConditionalBalance(User[] users, int balance){

        if(balance < 0){
            System.out.println("Balance have to be more than 0");
        }else {
            for (int i = 0; i < users.length; i++) {
                users[i].setBalance(balance);
            }
        }

        return users;
    }
    public static User[] paySalaryToUsers(User[] users){
        for(User i : users){
            i.setBalance(i.getBalance()+i.getSalary());
        }
        return  users;
    }
    public  static long[] getUsersId(User[] users){

        long[] getUserId = new long[users.length];
        int k = 0;
        for(User i : users){
            getUserId[k] = i.getId();
        }
        return getUserId;
    }


    public User[] deleteEmptyUsers(User[] users){

        User[] sortUser = new User[users.length];
        int quantity = 0;
            for (User i : users){
                if ( i!=null ){
                    sortUser[quantity] = i;
                    quantity++;
                }
            }
        User[] newUserArray = new  User[quantity];
        System.arraycopy(sortUser, 0, newUserArray, 0, quantity);

        return  newUserArray;
    }
}
