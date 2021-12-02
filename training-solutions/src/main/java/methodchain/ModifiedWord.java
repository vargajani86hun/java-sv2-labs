package methodchain;

public class ModifiedWord {
    public String modify(String word) {
        char[] fourLetters = word.substring(0,4).toUpperCase().toCharArray();
        fourLetters[1] = 'x';
        fourLetters[3] = 'y';
        return new String(fourLetters);
    }
}
