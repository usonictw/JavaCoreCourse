package Module4.homework;

/**
 * Created by user on 06.09.2016.
 */
public class Main {

    public static void main(String[] args) {

        Bank bankUS = new USBank(000001, "USA", Currency.EUR, 20, 30000.0, 8, 100000000);
        Bank bankEU = new EUBank(000002, "EU", Currency.EUR, 23, 40000.0, 6, 20000000);
        Bank bankChina = new ChinaBank(000003, "China", Currency.EUR, 23, 40000.0, 6, 20000000);


        User user1 = new User(000001, "John", 12000.0, 22, "e-Technology", 1200, bankUS);
        User user2 = new User(000002, "Tom", 3000.0, 22, "e-Technology", 1000, bankEU);
        User user3 = new User(000003, "Jane", 5000.0, 22, "e-Technology", 800, bankUS);
        User user4 = new User(000004, "Pam", 380, 22, "e-Technology", 750, bankChina);
        User user5 = new User(000005, "Robert", 850.0, 22, "e-Technology", 2200, bankChina);
        User user6 = new User(000006, "Mary", 950.0, 22, "e-Technology", 3200, bankChina);

        System.out.println("Initial data from the user: " + user1);

        BankSystem bankSystem = new PerfomingBankSystem();


        bankSystem.withdrawOfUser(user1, 1300);
        bankSystem.fundUser(user1, 200);
        bankSystem.paySalary(user1);

        System.out.println();
        System.out.println("Data from the user after the operation" + user1);


        //System.out.println(user2);
        //System.out.println(user3);
        //System.out.println(user4);
        //System.out.println(user5);
        //System.out.println(user6);


    }

}
