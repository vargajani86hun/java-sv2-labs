package controlselection.accents;

public class WithoutAccents {
    public char getVowelWithoutAccents(char c) {
        switch (c) {
            case 'Á' :
                return 'A';
            case 'á' :
                return 'a';
            case 'É' :
                return 'E';
            case 'é' :
                return 'e';
            case 'Í' :
                return 'I';
            case 'í' :
                return 'i';
            case 'Ó' :
            case 'Ö' :
            case 'Ő' :
                return 'O';
            case 'ó' :
            case 'ö' :
            case 'ő' :
                return 'o';
            case 'Ú' :
            case 'Ü' :
            case 'Ű' :
                return 'U';
            case 'ú' :
            case 'ü' :
            case 'ű' :
                return 'u';
            default:
                return c;
        }
    }
}
