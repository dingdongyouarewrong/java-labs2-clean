package by.gsu.pms.practice1;



import static java.lang.String.valueOf;

public class Runner {

    public static void main(String[] args) {

//        Create an array of 7 objects (the element with index 2 should be empty, i.e. null; the last element of the array
// should be created by default constructor; other ele-ments should be created by general-purpose constructor).
        Trip[] myArray = new Trip[10];
        Converter converter = new Converter();
        myArray[0] = new Trip(converter.convert(1.5, 100,2).doubleValue(),"Bernie Sanders", converter.convert(10, 100, 2).doubleValue(), 1);
        myArray[1] = new Trip(converter.convert(2.5, 100,2).doubleValue(),"Donald Trump", converter.convert(20, 100.d, 2).doubleValue(), 2);
        myArray[3] = new Trip(converter.convert(4.5, 100,2).doubleValue(),"Peter Buttigieg", converter.convert(40, 100, 2).doubleValue(), 4);
        myArray[4] = new Trip(converter.convert(5.5, 100,2).doubleValue(),"Elizabeth Warren", converter.convert(50, 100, 2).doubleValue(), 5);
        myArray[5] = new Trip(converter.convert(6.5, 100,2).doubleValue(),"Hillary Clinton", converter.convert(50, 100, 2).doubleValue(), 6);
        myArray[6] = new Trip();

//        Print the array content to the console, using show( ) method.
        for (Trip trip:myArray) {
            if (trip != null) {
                trip.show();
            }
        }

//        Change the employee`s transportaion expenses for the last object of the array.
        myArray[6].setTransportExpences(converter.convert(1, 100, 2).doubleValue());

//        Print the duration of two initial business trips by the single operator
        System.out.println(myArray[0].getEmployeeAccount() +" and "+myArray[3].getEmployeeAccount() +
                " traveled for a total of "+valueOf(myArray[0].getDaysQuantity()+myArray[3].getDaysQuantity()) + " days");

//        Print the array content to the console (one element per line), using toString( ) method implicitly.
        for (Trip trip:myArray) {
            if (trip != null) {
                System.out.println(trip.toString());
            }
        }

//        Find the sum of total expenses
        double expensesSum = 0;
        for (Trip trip:myArray) {
            if (trip != null) {
                expensesSum+=trip.getTotal();
            }
        }
        System.out.println("Total sum is "+expensesSum);

//        Find and print account name employee’s with maximum total expenses
        Trip maxItem = myArray[0];
        for (Trip trip:myArray) {
            if (trip != null) {

                if (trip.getTotal()>maxItem.getTotal()) {
                    maxItem = trip;
                }

            }
        }

        System.out.println(maxItem.getEmployeeAccount()+" is too expensive for us");
    }
}
