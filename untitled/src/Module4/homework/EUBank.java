package Module4.homework;

import java.util.*;

/**
 * Created by PC on ${DATA}.

 EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
 limit of funding - 20000 if EUR and 10000 if USD
 monthly rate - 0% with USD and 1% with EUR
 commission - 5% if USD and up to 1000, 7% if USD and more than 1000
 2% if EUR and up to 1000 and 4% if EUR and more than 1000

 */



public class EUBank extends Bank {

    private int withdrawal;

    public EUBank(long id, String bankCountry, Currency currency,
                  int numberOfEmployee, double avrSalaryOfEmployee,
                  long rating, long totalCapital, int withdrawal) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
        this.withdrawal = withdrawal;
    }

    @Override
    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        if(getCurrency() == Currency.USD){
            limitOfWithdrawal = 2000;
        } else if (getCurrency() == Currency.EUR){
            limitOfWithdrawal = 2200;
        }

        return limitOfWithdrawal;
    }

    @Override
    public int getLimitOfFunding() {
        int limitOfFunding = 0;
        if(getCurrency() == Currency.USD){
            limitOfFunding = 10000;
        } else if (getCurrency() == Currency.EUR){
            limitOfFunding = 20000;
        }
        return limitOfFunding;

    }

    @Override
    public double getMonthlyRate() {

        double monthlyRate = 0;
        if(getCurrency() == Currency.EUR){
            monthlyRate = 1.0;
        }
        return monthlyRate;

    }

    @Override
    public int getCommission() {

        int commission = 0;

        if (getCurrency() == Currency.USD && withdrawal <= 1000 ){
            commission = 5; // at percentage
        } else if(getCurrency() == Currency.USD && withdrawal > 1000){
            commission = 7; // at percentage
        } else if(getCurrency() == Currency.EUR && withdrawal <= 1000){
            commission = 6; //at percentage
        } else if(getCurrency() == Currency.EUR && withdrawal > 1000){
            commission = 8;
        }

        return commission;

    }

    @Override
    public double moneyPaidForSalary() {

        return getNumberOfEmployee()*getAvrSalaryOfEmployee();
    }
}
