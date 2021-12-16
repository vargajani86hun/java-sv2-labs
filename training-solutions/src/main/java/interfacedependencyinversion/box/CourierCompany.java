package interfacedependencyinversion.box;

public class CourierCompany {
    public static void main(String[] args) {
        Box smallBox = new SmallBox();
        Box mediumBox = new MediumBox();
        Box largeBox = new LargeBox();
        Box extraLargeBox = new ExtraLargeBox();

        System.out.println(smallBox.getSize() + " méretű csomag: " +
                smallBox.getPrice() + "Ft");
        System.out.println(mediumBox.getSize() + " méretű csomag: " +
                mediumBox.getPrice() + "Ft");
        System.out.println(largeBox.getSize() + " méretű csomag: " +
                largeBox.getPrice() + "Ft");
        System.out.println(extraLargeBox.getSize() + " méretű csomag: " +
                extraLargeBox.getPrice() + "Ft");
    }
}
