package lambdacollectors.honey;

public class Honey {
    private HoneyType type;
    private GlassSize size;

    public Honey(HoneyType type, GlassSize size) {
        this.type = type;
        this.size = size;
    }

    public HoneyType getType() {
        return type;
    }

    public GlassSize getSize() {
        return size;
    }

    public int getPrice() {
        return (int) (type.getPricePerKg() * size.getCapacityInKg());
    }
}
