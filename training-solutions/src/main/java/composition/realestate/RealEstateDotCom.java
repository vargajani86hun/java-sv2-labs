package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Debrecen", "H-4000",
                "Galamb utca", 10);
        Details details = new Details("Több generáció családi ház " +
                "nagy kerttel. Szigetelt, új nyílászárós kádárkocka.",
                address, 96, 640);
        RealEstate realEstate = new RealEstate("Kertváros", 45.8, details);

        System.out.println(realEstate);
        realEstate.getDetails().getAddress().setZipCode("H-4032");
        realEstate.getDetails().setDescription("Új nylászárós, hőszigetelt, " +
                "felújított kádárkocka nagy kerttel, nyárikonyhával és garázzsal");
        realEstate.setTitle("Kertes családi ház");
        System.out.println(realEstate);
    }
}
