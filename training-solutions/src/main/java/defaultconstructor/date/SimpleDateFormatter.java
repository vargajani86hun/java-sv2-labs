package defaultconstructor.date;

public class SimpleDateFormatter {
    private CountryCode defaultCountryCode;

    public SimpleDateFormatter() {
        defaultCountryCode = CountryCode.HU;
    }

    public String printFormattedDate(SimpleDate date, CountryCode cc) {
        StringBuilder sb = new StringBuilder();
        switch (cc) {
            case US :
                sb.append(date.getMonth()).append(". ").append(date.getDay()).
                    append(". ").append(date.getYear()).append(".");
                break;
            case EN :
                sb.append(date.getDay()).append(". ").append(date.getMonth()).
                        append(". ").append(date.getYear()).append(".");
                break;
            default:
                sb.append(date.getYear()).append(". ").append(date.getMonth()).
                        append(". ").append(date.getDay()).append(".");
                break;
        }
        return sb.toString();
    }

    public String printFormattedDate(SimpleDate date) {
        return printFormattedDate(date, defaultCountryCode);
    }
}
