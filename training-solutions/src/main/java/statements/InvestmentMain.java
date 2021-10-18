package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int fund, interestRate, days;
        Investment investment;

        System.out.println("Adja meg a befektetési összeget: ");
        fund = scr.nextInt();
        scr.nextLine();
        System.out.println("Adja meg a kamatlábat: ");
        interestRate = scr.nextInt();
        scr.nextLine();
        investment = new Investment(fund, interestRate);
        System.out.println("Befektetés összege:\n" + fund + "\nKamatláb:\n" + interestRate);
/*
        System.out.println("Adja meg, hány nap hozamára kíváncsi: ");
        days = scr.nextInt();
        scr.nextLine();
        */
        days = 50;
        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam " + days + " napra: " + investment.getYield(days));
/*
        System.out.println("Adja meg, hány nap után szeretné kivenni befektetését: ");
        days = scr.nextInt();
        scr.nextLine();

 */
        days = 80;
        System.out.println("Kivett összeg " + days + " nap után: " + investment.close(days));
/*
        System.out.println("Adja meg, hány nap után szeretné kivenni befektetését: ");
        days = scr.nextInt();
        scr.nextLine();

 */
        days = 90;
        System.out.println("Kivett összeg " + days + " nap után: " + investment.close(days));

    }
}
