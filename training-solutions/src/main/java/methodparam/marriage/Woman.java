package methodparam.marriage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Woman {
    private String name;
    private List<RegisterDate> registerDates = new ArrayList<>();

    public Woman(String name, LocalDate birthDay) {
        this.name = name;
        addRegisterDate(new RegisterDate("születés ideje", birthDay));
    }

    public void getMarried(Man husband) {
        LocalDate today = LocalDate.now();
        String description = "házasságkötés ideje";
        addRegisterDate(new RegisterDate(description, today));
        setName(husband.getName());
    }

    private void addRegisterDate(RegisterDate regDate){
        registerDates.add(regDate);
    }

    private void setName(String husbandsName) {
        name = husbandsName + "né " + name;
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDates() {
        return new ArrayList<>(registerDates);
    }
}
