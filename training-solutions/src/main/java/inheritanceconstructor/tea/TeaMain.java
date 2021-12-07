package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("EarlGray", 90);
        HerbalTea herbalTea = new HerbalTea("Roibos", 115);
        System.out.println(tea.getName() + ": " + tea.getPrice() + "Ft");
        System.out.println(herbalTea.getName() + ": " + herbalTea.getPrice() + "Ft");
    }
}
