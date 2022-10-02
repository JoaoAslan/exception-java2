package exercicios.ex1;

import exercicios.ex1.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: $");
        float balance = sc.nextFloat();
        System.out.print("Withdraw limit: $");
        float withdrawLimit = sc.nextFloat();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.print("\nEnter amount for withdraw: $");
        float amount = sc.nextFloat();
        acc.withdraw(amount);

        // TRATAMENTO DE EXCESSOES: MUITO RUIM (SEM DELEGAÇÃO)
        if (amount > acc.getWithdrawLimit()) {
            System.out.println("Withdraw error: The amount exceeds withdraw limit");
        } else if (amount > acc.getBalance()) {
            System.out.println("Withdraw error: Not enough balance");
        } else {
            System.out.println("New balance: $" + String.format("%.2f", acc.getBalance()));
        }

        sc.close();
    }
}
