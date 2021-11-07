package controliteration.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    private List<Integer> fibonacciNumbers = new ArrayList<>(Arrays.asList(0, 1));

    private void countFibonacciWithWhile(int limit) {
        if (limit < 3) {
            return;
        }
        int i = 2;
        while (i < limit) {
            fibonacciNumbers.add(fibonacciNumbers.get(i-2) + fibonacciNumbers.get(i-1));
            i++;
        }
    }

    private void countFibonacciWithFor(int limit) {
        if (limit < 3) {
            return;
        }
        for (int i = 2; i < limit; i++) {
            fibonacciNumbers.add(fibonacciNumbers.get(i-2) + fibonacciNumbers.get(i-1));
        }
    }

    public List<Integer> getFibonacciNumbers() {
        return new ArrayList<>(fibonacciNumbers);
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Adja meg, hány elemére kiváncsi a Fibonacci sorozatnak:");
        int limit = scr.nextInt();

        Fibonacci fibonacci = new Fibonacci();
//        fibonacci.countFibonacciWithFor(limit);
        fibonacci.countFibonacciWithFor(limit);
        System.out.println(fibonacci.getFibonacciNumbers());
    }
}
