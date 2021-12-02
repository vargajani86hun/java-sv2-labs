package methodoverloading;

import java.util.Arrays;
import java.util.List;

public class ClassFiveA {
    private List<String> students = Arrays.asList("Asztalos Attila", "Bodó Sándor",
            "Bujdosó Tamás", "Csézy Erzsébet", "Farkas Piroska", "Ferenczi Zsolt",
            "Fügedi Anna", "Gyurkó Béla", "Hajdú Gábor", "Hosek Ádám", "Karnik Mercédesz",
            "Kiss Zoltán", "Kovács Balázs", "Lakatos Márk", "Lukács Attila", "Marton Miklós",
            "Molnár Edit", "Murányi József", "Oláh Kitti", "Ostorházy János", "Polyák Csaba",
            "Rajna Alida", "Rigó Renáta", "Sáfrán Barnabás", "Sándor Szafira");

    public String getTodayReferringStudent(int number) {
        return students.get(number - 1);
    }

    public String getTodayReferringStudent(Number number) {
        return students.get(number.getValue() - 1);
    }

    public String getTodayReferringStudent(String numberName) {
        return students.get(Number.valueOf(numberName.toUpperCase()).getValue() - 1);
    }
}
