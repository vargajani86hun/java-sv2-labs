package introcontrol;

public class IntroControl {
    public int subtractTenIfGreaterThanTen(int number) {
        /*
        return (number <= 10) ? number : (number -= 10);
         */
        if (number <= 10)
            return number;
        else
            return number -= 10;
    }
}
