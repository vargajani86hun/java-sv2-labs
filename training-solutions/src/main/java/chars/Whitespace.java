package chars;

public class Whitespace {
    public String makeWhitespaceToStar(String text) {
        char[] letters = text.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (Character.isWhitespace(letters[i])) {
                letters[i] = '*';
            }
        }
        return new String(letters);
    }

    public static void main(String[] args) {
        Whitespace ws = new Whitespace();
        String word = "Tüzesen süt le\ta nyári nap sugára.\nAz ég tetejéről\ta juhászbojtárra.";
        System.out.println(word);
        String changedWord = ws.makeWhitespaceToStar(word);
        System.out.println(changedWord);
    }
}
