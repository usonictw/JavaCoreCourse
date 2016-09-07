package Module4.homework;

/**
 * Created by user on 06.09.2016.
 */
public class PerfomingBankSystem implements BankSystem {


   // Method for withdrawal the amount from user's balance
    @Override
    public void withdrawOfUser(User user, int amount) {

        if (amount <= 0) {
            System.out.println("You input withdrawal the amount 0 or less than 0  ");
        }

        if(user.bank.getLimitOfWithdrawal() > amount && (amount+amount*user.bank.getCommission(amount)) < user.balance) {
            user.balance -= amount - amount * (user.bank.getCommission(amount) / 100);
        }
        else if (user.bank.getLimitOfWithdrawal() < amount){
            System.out.println("Withdrawal the amount exceeds limit. Maximum withdrawal amount:" + user.bank.getLimitOfWithdrawal());
            }
        else if ((amount+amount*user.bank.getCommission(amount)) > user.balance){
            System.out.println("Withdrawal the amount including commission exceeds your BAlANCE. Your balance: "+user.balance);

            }

    }

    // Method for funding the amount user's balance
    @Override
    public void fundUser(User user, int amount) {

        if (amount <= 0) {
            System.out.println("You input Funding amount 0 or less than 0  ");
        }
        else if(user.bank.getLimitOfFunding()>amount){
            user.balance+= amount;
        }
        else {
            System.out.println("Funding amount exceeds limit. Maximum funding amount: "+user.bank.getLimitOfFunding());
        }

    }

    // Method for transfer money from one user to another
    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
       withdrawOfUser(fromUser,amount);
       fundUser(toUser, amount);

    }

    // Method for crediting of the salary to user's balance
    @Override
    public void paySalary(User user) {

        user.balance+= user.salary;

    }
}
