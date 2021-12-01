package methodparam.marriage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Man {
    private String name;
    private List<RegisterDate> registerDates = new ArrayList<>();

    public Man(String name, LocalDate birthDay) {
        this.name = name;
        addRegisterDate(new RegisterDate("születés ideje", birthDay));
    }

    public void getMarried() {
        LocalDate today = LocalDate.now();
        String description = "házasságkötés ideje";
        addRegisterDate(new RegisterDate(description, today));
    }

    private void addRegisterDate(RegisterDate regDate) {
        registerDates.add(regDate);
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDates() {
        return new ArrayList<>(registerDates);
    }
}
