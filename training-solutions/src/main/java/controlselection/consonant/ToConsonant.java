package controlselection.consonant;

public class ToConsonant {
    public char getConsonant(char c) {
        switch (c) {
            case 'A' :
            case 'a' :
            case 'E' :
            case 'e' :
            case 'I' :
            case 'i' :
            case 'O' :
            case 'o' :
            case 'U' :
            case 'u' :
                return (char) (c + 1);
            default:
                return c;
        }
    }
}
