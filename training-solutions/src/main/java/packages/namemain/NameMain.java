package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {

    public static void main(String[] args) {
        Prefix pre = new Prefix("phD.");
        FirstName firstName = new FirstName("Stephen");
        LastName lastName = new LastName("Howking");
        String wholeName = pre.getPre() + " " + firstName.getFirst() + " " + lastName.getLast();
        System.out.println(wholeName);

    }
}
