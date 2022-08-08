package entities;

import java.util.Scanner;

public class FisicAccount extends Account {
    private  Double healthSpend;

    public FisicAccount(String name, Double income, Double healthSpend) {
        super(name, income);
        this.healthSpend = healthSpend;
    }

    @Override
    public Double calcTaxes() {
        Double tax;
        Double discount = 0.0;
        if(income<20000){
            tax = .15;
        }else{
            tax = .25;
        }
        if(healthSpend!=0){
            discount = healthSpend*0.5;
        }
        if(discount>=income*tax){
            return 0.0;
        }
        return (income)*tax-discount;
    }
    public static FisicAccount askAccount(Scanner sc) {
        String name = sc.nextLine();
        System.out.println("Name: " + name);
        Double income = sc.nextDouble();
        System.out.println("Anual income: " + income);
        Double healthSpend = sc.nextDouble();
        System.out.println("Health expenditures: " + healthSpend + "\n");
        sc.nextLine();
        return new FisicAccount(name,income ,healthSpend);
    }
}
