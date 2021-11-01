package chars;

public class Words {
    public String pushWord(String word) {
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            letters[i]++;
        }
        return new String(letters);
    }

    public static void main(String[] args) {
        Words word = new Words();
        String shiftedWord = word.pushWord("alma");
        System.out.println(shiftedWord);
        shiftedWord = word.pushWord("barack");
        System.out.println(shiftedWord);
    }
}
