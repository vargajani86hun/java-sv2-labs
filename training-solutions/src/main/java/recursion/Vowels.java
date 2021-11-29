package recursion;

public class Vowels {
    public int getNumberOfVowels(String word) {
        if (word.length() == 1) {
            if (isVowel(word.charAt(0))) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else if (isVowel(word.charAt(0))) {
            return 1 + getNumberOfVowels(word.substring(1, word.length()));
        }
        else {
            return getNumberOfVowels(word.substring(1, word.length()));
        }

    }


    private boolean isVowel(char character) {
        switch (Character.toLowerCase(character)) {
            case 'a':
            case 'á':
            case 'e':
            case 'é':
            case 'i':
            case 'í':
            case 'o':
            case 'ó':
            case 'ö':
            case 'ő':
            case 'u':
            case 'ú':
            case 'ü':
            case 'ű':
                return true;
            default:
                return false;
        }
    }
}
