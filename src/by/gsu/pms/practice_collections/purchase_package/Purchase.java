package by.gsu.pms.practice_collections.purchase_package;

public class Purchase implements Comparable<Purchase>{

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", count=" + count +
                '}';
    }

    public String name;
    public int cost;
    public int count;

    public Purchase(String name, int cost, int count) {
        this.name = name;
        this.cost = cost;
        this.count = count;
    }

    public int get_price(){
        return cost * count;
    }

    @Override
    public int compareTo(Purchase o){
        return Integer.compare(this.getCost(), o.getCost());
    }
}