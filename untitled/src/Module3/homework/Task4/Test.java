package Module3.homework.Task4;

/**
 * Created by user on 01.09.2016.
 */
public class Test {

    public static void main(String[] args) {

        User user1 = new User("Vladimir", 500, 22, "e-Technology", 240, "euro");

        System.out.println("Your salary: "+ user1.getSalary());
        user1.paySalary();
        System.out.println("Your BALANCE after salary: "+user1.getBalance());
        user1.withdraw(800);
        System.out.println("Your BALANCE after withdrawal: "+user1.getBalance());

        System.out.println("Company name length: "+user1.companyNameLength());

        System.out.println(user1.monthIncrease(3));

        user1.setMonthsOfEmployment(24);
        System.out.println(user1.monthIncrease(1));

    }
}
