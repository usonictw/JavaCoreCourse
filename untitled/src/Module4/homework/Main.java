package Module4.homework;

/**
 * Created by user on 06.09.2016.
 */
public class Main {

    public static void main(String[] args) {

        Bank bankUS = new USBank(000001, "USA", Currency.EUR, 20, 30000.0, 8, 100000000);
        Bank bankEU = new EUBank(000002,"EU", Currency.EUR, 23, 40000.0, 6, 20000000);
        Bank bankChina = new ChinaBank(000002,"China", Currency.EUR, 23, 40000.0, 6, 20000000);


        User user = new User(000001, "John", 450.0, 22, "e-Technology", 1200, bankUS);

        BankSystem bankSystem = new PerfomingBankSystem();
        System.out.println(bankUS.getCommission(40)/100);

        bankSystem.withdrawOfUser(user, 40);

        System.out.println(user.balance);





    }
}
