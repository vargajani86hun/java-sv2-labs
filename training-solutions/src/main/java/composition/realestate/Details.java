package composition.realestate;

public class Details {
    private String description;
    private Address address;
    private int spuareMeter;
    public int areaOfSite;

    public Details(String description, Address address, int spuareMeter, int areaOfSite) {
        this.description = description;
        this.address = address;
        this.spuareMeter = spuareMeter;
        this.areaOfSite = areaOfSite;
    }

    @Override
    public String toString() {
        return description + "\naddress: " + address +
                "\nspuareMeter: " + spuareMeter +
                ", areaOfSite: " + areaOfSite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSpuareMeter() {
        return spuareMeter;
    }

    public void setSpuareMeter(int spuareMeter) {
        this.spuareMeter = spuareMeter;
    }

    public int getAreaOfSite() {
        return areaOfSite;
    }

    public void setAreaOfSite(int areaOfSite) {
        this.areaOfSite = areaOfSite;
    }
}
