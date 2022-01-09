package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Kiss és Társa", "23-6-2198456"));
        companies.add(new Company("Székely Takarék", "44-1-3456732"));
        companies.add(new Company("Pető Nyomda", "13-8-2563583"));
        companies.add(new Company("Sakáltanya", "17-4-2441573"));
        System.out.println(companies.contains(new Company("Székely Takarék", "44-1-3456732")));
        System.out.println(companies.contains(new Company("Székely Lovasok", "14-1-3456732")));
        System.out.println(companies.contains(new Company("Székely Takarék", "44-2-3456732")));
        System.out.println(companies.contains(new Company("Sakáltanya", "13-8-2563583")));
    }
}
