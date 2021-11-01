package enumtype.univesity;

public enum University {
    BME("Budapesti Műszaki és Gazdaságtudományi Egyetem"),
    DE("Debreceni Egyetem"),
    EKKE("Eszterházy Károly Katolikus Egyetem"),
    ELTE("Eötvös Lóránd Tudományegyetem");

    private final String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
