package Module4.homework;

/**
 * Created by user on 05.09.2016.
 */
public class User {

    long id;
    String name;
    double balance;
    int monthOfEmpoyement;
    String companyName;
    int salary;
    Bank bank;


    public User(long id, String name, double balance, int monthOfEmpoyement,
                String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthOfEmpoyement = monthOfEmpoyement;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", monthOfEmpoyement=" + monthOfEmpoyement +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", bank=" + bank +
                '}';
    }
}
