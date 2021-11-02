package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Name british = new Name("Smith", "William", "George", Title.MR);
        Name hungarian = new Name("Kovács", "Vilmos", "Gergő");
        System.out.println(british.concatNameWesternStyle());
        System.out.println(hungarian.concatNameHungarianStyle());
    }
}
