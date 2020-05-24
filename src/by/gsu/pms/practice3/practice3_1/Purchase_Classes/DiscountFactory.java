package by.gsu.pms.practice3.practice3_1.Purchase_Classes;

public class DiscountFactory {
    public Purchase Factory(String string){
        String[] params = string.split(" ");
        switch (params[0]){
            case ("Purchase"):
                return new Purchase(params[1],
                        Double.parseDouble(params[2]),
                        Integer.parseInt(params[3]));
            case ("Discount"):
                return new Discount(params[1],
                        Double.parseDouble(params[2]),
                        Integer.parseInt(params[3]),
                        Float.parseFloat(params[4]));
            case ("DiscountWithRequirements"):
                return new DiscountRequirements(params[1],
                        Double.parseDouble(params[2]),
                        Integer.parseInt(params[3]),
                        Float.parseFloat(params[4]),
                        Integer.parseInt(params[5]));
        }
        return null;
    }
}
