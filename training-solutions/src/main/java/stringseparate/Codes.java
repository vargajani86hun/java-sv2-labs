package stringseparate;

import java.util.Arrays;
import java.util.List;

public class Codes {
    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        sb.append("Betűvel kezdődő kódok: ");
        for (String code : codes) {
            if (!(Character.isDigit(code.charAt(0)))){
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(code);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Codes codes = new Codes();
        String[] listOfCodes = {"2RT43nW", "34Cbs5", "kp0Y3C", "g6Wm33U", "4ZtH8iL", "Of1Xs3X"};
        System.out.println(codes.getCodesStartWithLetter(Arrays.asList(listOfCodes)));
    }
}
