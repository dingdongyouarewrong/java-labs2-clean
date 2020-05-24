package by.gsu.pms.practice1;

import static java.lang.String.valueOf;

public class Trip {

    private double dailyRate;
    private String employeeAccount;
    private double transportExpences;
    private int daysQuantity;

    Trip(double dailyRate, String employeeAccount, double transportExpences, int daysQuantity) {
        this.dailyRate = dailyRate;
        this.employeeAccount = employeeAccount;
        this.transportExpences = transportExpences;
        this.daysQuantity = daysQuantity;
    }

    Trip() {}

//    getters
    public double getDailyRate() {
        return dailyRate;
    }

    String getEmployeeAccount() {
        return employeeAccount;
    }

    int getDaysQuantity() {
        return daysQuantity;
    }

    public double getTransportExpences() {
        return transportExpences;
    }

//    setters
    public void setEmployeeAccount(String employeeAccount) {
        this.employeeAccount = employeeAccount;
    }

    void setTransportExpences(double transportExpences) {
        this.transportExpences = transportExpences;
    }

    public void setDaysQuantity(int daysQuantity) {
        this.daysQuantity = daysQuantity;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    double getTotal() {
        return daysQuantity*dailyRate+ transportExpences;
    }

    void show() {
        System.out.println("Daily allowance rate in belarusian rubles = "+valueOf(dailyRate));
        System.out.println("Employee`s account = "+employeeAccount);
        System.out.println("Transportation expenses in belarusian rubles = "+valueOf(transportExpences));
        System.out.println("Number of days = "+valueOf(daysQuantity));
        System.out.println("Total = "+valueOf(getTotal()));
    }

    @Override
    public String toString() {
        return valueOf(dailyRate)+";"+valueOf(employeeAccount)+";"+valueOf(transportExpences)+";"+valueOf(daysQuantity)+";"+valueOf(getTotal());
    }

}
