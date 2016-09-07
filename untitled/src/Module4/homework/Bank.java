package Module4.homework;


/**
 * Created by PC on ${DATA}.
 */
public abstract class Bank {


    // announce field
    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployee;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    //creating abstract methods
    public abstract int getLimitOfWithdrawal();
    public abstract int getLimitOfFunding();
    public abstract double getMonthlyRate();
    public abstract double getCommission(int sum);
    public abstract double moneyPaidForSalary();

    public Bank(long id, String bankCountry, Currency currency,
                int numberOfEmployee, double avrSalaryOfEmployee,
                long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployee = numberOfEmployee;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }


    // create getters and setters


    public long getId() {
        return id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", bankCountry='" + bankCountry + '\'' +
                ", currency=" + currency +
                ", numberOfEmployee=" + numberOfEmployee +
                ", avrSalaryOfEmployee=" + avrSalaryOfEmployee +
                ", rating=" + rating +
                ", totalCapital=" + totalCapital +
                '}';
    }
}


