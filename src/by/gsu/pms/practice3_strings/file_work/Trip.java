package by.gsu.pms.practice3_strings.file_work;

public class Trip {

    private static int DAILY_RATE = 25000;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getDays_quantity() {
        return days_quantity;
    }

    public void setDays_quantity(int days_quantity) {
        this.days_quantity = days_quantity;
    }

    public int getTransport_cost() {
        return transport_cost;
    }

    public void setTransport_cost(int transport_cost) {
        this.transport_cost = transport_cost;
    }

    private String account;
    private int days_quantity;
    private int transport_cost;

    public Trip(String account, int transport_cost, int days_quantity) {
        this.account = account;
        this.transport_cost = transport_cost;
        this.days_quantity = days_quantity;
    }

    public Trip() {
        this.account = "sample name";
        this.transport_cost = 0;
        this.days_quantity = 1;
    }



    public float get_total(){
        if (days_quantity ==1){
            return transport_cost;
        } else {
            return DAILY_RATE * days_quantity + transport_cost;
        }
    }

    public void show(){
        System.out.println("days quantity:" + days_quantity);
        System.out.println("account:" + account);
        System.out.println("rate:" + DAILY_RATE);
        System.out.println("transport cost:" + transport_cost);
        System.out.println("total cost:" + get_total());
    }

    public String to_string(){
        return DAILY_RATE +";"+transport_cost+";"+ days_quantity +";"+ account+";"+get_total();
    }
}