package collectionsiterator;

public class ChristmasPresent {
    private String description;
    private String nameToGift;
    private int price;

    public ChristmasPresent(String description, String nameToGift, int price) {
        this.description = description;
        this.nameToGift = nameToGift;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getNameOfPerson() {
        return nameToGift;
    }

    public int getPrice() {
        return price;
    }
}
