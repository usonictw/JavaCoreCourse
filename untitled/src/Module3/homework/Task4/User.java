package Module3.homework.Task4;

/**
 * Created by user on 31.08.2016.
 */
public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;


    public void paySalary(){

        User.this.balance = User.this.getBalance()+User.this.getSalary();

    }

    public void withdraw(int sum) {

        int commission1 = 5;
        int commission2 = 10;

        if (sum < 1000 && sum > 0) {
            sum = sum + sum * commission1 / 100;
            if (sum > balance) {
                System.out.println("Sorry. withdrawal amount exceed your BALANCE");
            } else {
                balance = balance - sum;
            }
        } else if (sum > 1000 && sum > 0) {
            sum = sum + sum * commission2 / 100;
            if (sum > balance) {
                System.out.println("Sorry. withdrawal amount exceed your BALANCE");
            } else {
                balance = balance - sum;
            }
        } else {
            System.out.println("Input sum more than 0");
        }
    }

        public int companyNameLength(){

            return companyName.length();

        }

        public int monthIncrease(int addMonth){

            return  monthsOfEmployment = monthsOfEmployment+addMonth;
        }



    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}




