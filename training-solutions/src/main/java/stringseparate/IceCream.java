package stringseparate;

public class IceCream {
    public static void main(String[] args) {
        String[] iceCreams = {"vanília", "karamell", "tutti-frutti", "rumos dió", "kávé"};
        StringBuilder sb = new StringBuilder();

        sb.append("A pisztácia kifogyott. Van még ");
        for (int i = 0; i < iceCreams.length; i++){
            sb.append(iceCreams[i]);
            if (i < (iceCreams.length - 2)) {
                sb.append(", ");
            }
            else if (i == (iceCreams.length - 2)) {
                sb.append(" és ");
            }
            else {
                sb.append(".");
            }
        }
        sb.append("\nÉdes tölcsérrel a harmadik gombóc ajándék!");
        System.out.println(sb);
    }
}
