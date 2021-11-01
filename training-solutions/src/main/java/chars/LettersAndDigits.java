package chars;

public class LettersAndDigits {
    public void printLetterOrDigit(String text) {
        char[] letters = text.toCharArray();
        for (char c : letters) {
            if (Character.isAlphabetic(c)) {
                System.out.println(c + " : betű");
            }
            else if (Character.isDigit(c)) {
                System.out.println(c + " : számjegy");
            }
            else {
                System.out.println(c + " : egyéb");
            }
        }
    }

    public static void main(String[] args) {
        LettersAndDigits lad = new LettersAndDigits();
        lad.printLetterOrDigit("jfg;54?12DFc*:oL");
    }
}
