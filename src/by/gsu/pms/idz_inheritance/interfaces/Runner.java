package by.gsu.pms.idz_inheritance.interfaces;

import by.gsu.pms.idz_inheritance.interfaces.Taxes.*;

import java.util.Arrays;

import static java.lang.String.valueOf;

public class Runner {

    public static void main(String[] args) {

        double final_sum = 0;

//        income was 500
        IncomeTax incomeTax = new IncomeTax(500);
        final_sum += incomeTax.getTax();
        incomeTax.setPaid(true);
        System.out.println(final_sum);

//        gift was 100
        GiftTax giftTax = new GiftTax(100);
        final_sum += giftTax.getTax();
        giftTax.setPaid(true);
        System.out.println(final_sum);

//        property cost was 1000
        PropertySalesTax propertySalesTax = new PropertySalesTax(1000);
        final_sum += propertySalesTax.getTax();
        propertySalesTax.setPaid(true);
        System.out.println(final_sum);

//        remittance was 15
        RemittanceTax remittanceTax = new RemittanceTax(15);
        final_sum += remittanceTax.getTax();
        remittanceTax.setPaid(true);
        System.out.println(final_sum);

//        royalty is 10
        RoyaltyTax royaltyTax = new RoyaltyTax(10);
        final_sum += royaltyTax.getTax();
        System.out.println(final_sum);


//        allowance is 10
        Allowance allowance = new Allowance(10);
        final_sum += allowance.getAllowance();
        allowance.setPaid(true);
        System.out.println(final_sum);

//        there is 5 childrens
        ChildBenefits childBenefits = new ChildBenefits(5);
        final_sum = childBenefits.getSumWithBenefits(final_sum);
        System.out.println(final_sum);

        double[] taxes = new double[]{incomeTax.getTax(), giftTax.getTax(), propertySalesTax.getTax(), remittanceTax.getTax(), royaltyTax.getTax()};
        Arrays.sort(taxes);

        System.out.println("There is "+valueOf(taxes.length)+" taxes");
        System.out.println("The biggest tax is "+valueOf(taxes[4]));
    }



}
