package application;

import entities.Account;
import entities.FisicAccount;
import entities.LegalAccount;

import java.io.File;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try {
            File file = new File("src/input/in.txt");
            LinkedList<Account> accounts = new LinkedList<Account>();
            Scanner sc = new Scanner(file);
            int payers = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the number of payers: " + payers);
            for (int i = 0; i < payers; i++) {
                String account = sc.nextLine();
                System.out.println("Individual or company(i/c)? "+account);
                System.out.println("Tax payer #" + i + " data:");
                if (account.toLowerCase().equals("i")) {
                    accounts.add(FisicAccount.askAccount(sc));
                } else if (account.toLowerCase().equals("c")) {
                    accounts.add(LegalAccount.askAccount(sc));
                } else {
                    throw new Exception("Invalid argument: " + account);
                }

            }
            System.out.println("TAXES PAID:");
            Double amount = 0.0;
            for(Account account : accounts){
                amount += account.calcTaxes();
                System.out.printf("%s:  $  %.2f\n",account.getName(),account.calcTaxes());
            }
            sc.close();
            System.out.println("Total taxes:  $  " + amount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
