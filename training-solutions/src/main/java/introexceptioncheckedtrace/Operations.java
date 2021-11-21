package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {
    public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get(
                "src/main/texts/underground.txt"));
    }

    public String getDailySchedule(List<String> trains) {
        LocalDate today = LocalDate.now();
        StringBuilder sb = new StringBuilder();
        sb.append(today).append(": ");
        boolean isFirst = true;
        for (String train : trains) {
            if(train.charAt(0) == '2') {
                if (isFirst) {
                    isFirst = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(train);
            }
        }
        return sb.toString();
    }
}
