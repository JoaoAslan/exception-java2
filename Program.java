package exercicios.ex1;

import exercicios.ex1.entities.Account;
import exercicios.ex1.exceptions.ServiceException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ESSE BLOCO DE CÓDIGO PODE RETORNAR ALGUM ERRO
        try {
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
            System.out.println("New balance: $" + String.format("%.2f", acc.getBalance()));
        }
        // CAPTURA DE ERROS CUSTOMIZADA
        catch (ServiceException e) {
            System.out.println(e.getMessage());
        }
        // CAPTURA DE ERROS GENERICOS
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
