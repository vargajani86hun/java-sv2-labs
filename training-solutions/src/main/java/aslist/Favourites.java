package aslist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();
        Scanner scr = new Scanner(System.in);
        System.out.println("Mi a kedvenc filmed?");
        favouriteThings.add(scr.nextLine());
        System.out.println("Mi a kedvenc ételed?");
        favouriteThings.add(scr.nextLine());
        System.out.println("Mi a kedvenc sportod?");
        favouriteThings.add(scr.nextLine());
        System.out.println("Mi a kedvenc játékod?");
        favouriteThings.add(scr.nextLine());
        System.out.println("Mi a kedvenc italod?");
        favouriteThings.add(scr.nextLine());
        System.out.println(favouriteThings.size());
        System.out.println(favouriteThings);
    }
}
