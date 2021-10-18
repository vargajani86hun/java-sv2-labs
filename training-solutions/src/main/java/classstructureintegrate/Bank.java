package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        BankAccount bankAccount;
        Scanner scr = new Scanner(System.in);
        String name, accountNumber;
        int amount, balance;

        System.out.println("Kérem, adja meg a nevét: ");
        name = scr.nextLine();
        System.out.println("Kérem, adja meg számlaszámát (háromszor 8 szám, kötőjelekkel elválasztva): ");
        accountNumber = scr.nextLine();
        System.out.println("Kérem, adja meg számlája nyitó egyenlegét: ");
        balance = scr.nextInt();
        scr.nextLine();
        bankAccount = new BankAccount(accountNumber, name, balance);
        System.out.println("Gratulálunk, elkészült új bankszámlája: \n" + bankAccount.getInfo());

        System.out.println("Kérem, adja meg a befizetni kívánt összeget: ");
        amount = scr.nextInt();
        scr.nextLine();
        bankAccount.deposit(amount);
        System.out.println("Számlája jelenlegi állapota: \n" + bankAccount.getInfo());

        System.out.println("Kérem, adja mega kivenni kívánt összeget: ");
        amount = scr.nextInt();
        scr.nextLine();
        bankAccount.withdraw(amount);
        System.out.println("Számlája jelenlegi állapota: \n" + bankAccount.getInfo());

    }
}
