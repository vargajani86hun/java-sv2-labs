package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {
    public void getMarried(Woman woman, Man man) {
        woman.getMarried(man);
        man.getMarried();
    }
}
