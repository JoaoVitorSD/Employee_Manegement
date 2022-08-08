package entities;

import java.util.Scanner;

public class LegalAccount extends Account{
    private Integer employesAmount;

    public LegalAccount(String name, Double income, Integer employesAmount) {
        super(name, income);
        this.employesAmount = employesAmount;
    }
    @Override
    public Double calcTaxes() {
        Double tax = .16;
        if(employesAmount>10){
            tax = .14;
        }else{

        }
        return income*tax;
    }
    public static LegalAccount askAccount(Scanner sc){
        String name = sc.next();
        System.out.println("Name: " + name);
        Double income = sc.nextDouble();
        System.out.println("Anual income: " + income);
        Integer employesAmount = sc.nextInt();
        System.out.println("Number of employes: " + employesAmount + "\n");
        sc.nextLine();
        return new LegalAccount(name, income, employesAmount);
    }
}
