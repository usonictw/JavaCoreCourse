package Module4.homework;

import java.util.*;

/**
 * Created by PC on ${DATA}.

 ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR

 limit of funding - 5000 if EUR and 10000 if USD
 monthly rate - 1% with USD and 0% with EUR
 commision - 3% if USD and up to 1000, 5% if USD and more than 1000
 10% if EUR and up to 1000 and 11% if EUR and more than 1000

 */
public class ChinaBank extends Bank {

    //private int withdrawal;

    public ChinaBank(long id, String bankCountry, Currency currency,
                     int numberOfEmployee, double avrSalaryOfEmployee,
                     long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
        //this.withdrawal = withdrwal;
    }

    @Override
    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        if(getCurrency() == Currency.USD){
            limitOfWithdrawal = 100;
        } else if (getCurrency() == Currency.EUR){
            limitOfWithdrawal = 150;
        }

        return limitOfWithdrawal;

    }

    @Override
    public int getLimitOfFunding() {
        int limitOfFunding = 0;
        if(getCurrency() == Currency.USD){
            limitOfFunding = 10000;
        } else if (getCurrency() == Currency.EUR){
            limitOfFunding = 5000;
        }
        return limitOfFunding;

    }

    @Override
    public double getMonthlyRate() {
        double monthlyRate = 0;
        if(getCurrency() == Currency.USD){
            monthlyRate = 1.0;
        }
        return monthlyRate;

    }

    @Override
    public double getCommission(int sum) {
        int commission = 0;

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
