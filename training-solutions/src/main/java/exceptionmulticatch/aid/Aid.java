package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> results = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                results.add(countAidPerHead(line));
            }
            return results;
        }
        catch (IOException | NumberFormatException | NullPointerException |
                IndexOutOfBoundsException | ArithmeticException e) {
            throw new IllegalStateException("Something went wrong while counting.", e);
        }
    }

    public int getAmount() {
        return amount;
    }

    private String countAidPerHead(String line) {
        String[] parts = line.split(": ");
        StringBuilder sb = new StringBuilder();
        sb.append(parts[0]).append(": ");
        sb.append(amount / Integer.parseInt(parts[1]));
        return sb.toString();
    }
}
