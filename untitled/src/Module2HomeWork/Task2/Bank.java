package Module2HomeWork.Task2;

/**
 * Created by user on 23.08.2016.
 */
public class Bank {

    public static double[] balance={100.0, 458.34, 429.87, 1298.98, 3200.97};
    public static String[] ownerNames={"John", "Mary", "Keit", "Bob", "Michel"};

    //HOMEWORK 2.1
    static void withdrawBalance(double balance, double withdrawal) {

        double comission = 5.0/100.0; //commision transaction is 5%
        double fullWithdrawal = withdrawal+withdrawal*comission;
        if(balance>=fullWithdrawal) {
            double balanceAfter = balance - (withdrawal + withdrawal * comission);
            System.out.println("OK "+ comission*100+"% "+balanceAfter);
        }
        else{
            System.out.println("No");
        }

    }

    //HOMEWORK 2.2
    static void withdrawBalance(String ownerName, double withdrawal) {

        for (int i=0; i<ownerNames.length;i++){

            if(ownerName.equals(ownerNames[i])) {
                System.out.print(ownerName + " ");
                withdrawBalance(balance[i], withdrawal);
                break;
            }
            else if(i==ownerNames.length-1){
                System.out.println("This Person absent in this list");
            }
        }


    }


    //HOMEWORK 2.3
    static void fundBalance(String ownerName, double fund) {
        for(int i=0; i<ownerNames.length; i++) {
            if (ownerName.equals(ownerNames[i])) {
                balance[i] = balance[i] + fund;

                System.out.println(balance[i]+" "+ownerName);
            }
        }

    }


    public static void main(String[] args) {

        withdrawBalance(balance[0], 10.4);
        withdrawBalance("Bim", 10.0);
        fundBalance("John", 100);



    }
}
