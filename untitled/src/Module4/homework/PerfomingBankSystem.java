package Module4.homework;

/**
 * Created by user on 06.09.2016.
 */
public class PerfomingBankSystem implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {

        if(user.bank.getLimitOfWithdrawal()>amount){
            user.balance-= amount - amount*(user.bank.getCommission(amount)/100);

        }
    }

    @Override
    public void fundUser(User user, int amount) {

        if(user.bank.getLimitOfFunding()>amount){
            user.balance+= amount;
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
       withdrawOfUser(fromUser,amount);
       fundUser(toUser, amount);

    }

    @Override
    public void paySalary(User user) {

        user.balance+=user.salary;

    }
}
