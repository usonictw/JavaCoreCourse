package Module4.homework;

/**
 * Created by PC on ${DATA}.
 */

/* USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
limit of funding - 10000 if EUR and no limit if USD
monthly rate - 1% with USD and 1.5% with EUR
commision - 5% if USD and up to 1000, 7% if USD and more than 1000
6% if EUR and up to 1000 and 8% if EUR and more than 1000
*/

public class USBank extends  Bank {


    //private int withdrawal;


    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployee,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
        //this.withdrawal = withdrawal;
    }


    @Override
    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        if(getCurrency() == Currency.USD){
           limitOfWithdrawal = 1000;
        } else if (getCurrency() == Currency.EUR){
            limitOfWithdrawal = 1200;
        }
        return limitOfWithdrawal;
    }

    @Override

    public int getLimitOfFunding() {

        int limitOfFunding = 0;
        if(getCurrency() == Currency.USD){
            limitOfFunding = 1000000000;
        } else if (getCurrency() == Currency.EUR){
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    @Override
    public double getMonthlyRate() {

        double monthlyRate = 0;
        if(getCurrency() == Currency.USD){
            monthlyRate = 1.0;
        }else if(getCurrency() == Currency.EUR){
            monthlyRate = 1.5;
        }
        return monthlyRate;
    }

    @Override
    public double getCommission(int sum) {
        double commission = 0;

        if (getCurrency() == Currency.USD && sum <= 1000 ){
            commission = 5; // at percentage
        } else if(getCurrency() == Currency.USD && sum > 1000){
            commission = 7; // at percentage
        } else if(getCurrency() == Currency.EUR && sum <= 1000){
            commission = 6; //at percentage
        } else if(getCurrency() == Currency.EUR && sum > 1000){
            commission = 8;
        }


        return commission;
    }

    @Override
    public double moneyPaidForSalary() {

        return getNumberOfEmployee()*getAvrSalaryOfEmployee();
    }
}
