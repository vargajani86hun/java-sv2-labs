package controlselection.greetings;

public class Greetings {
    public String sayGreetings(int hours, int minutes) {
        if (hours >= 5 && hours < 9) {
            return "jó reggelt";
        }
        else if ((hours >= 9 && hours < 18) || (hours == 18 && minutes <= 30) ) {
            return "jó napot";
        }
        else if ((hours == 18 && minutes > 30) || (hours == 19)) {
            return "jó estét";
        }
        else {
            return "jó éjt";
        }
    }
}
