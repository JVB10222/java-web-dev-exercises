package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class RestaurantMenu {
    public static void main(String[] args) {
//        Date updatedAt = new Date();
//        ArrayList<String> categories = new ArrayList<>();
//        categories.add("Appetizers");
//        categories.add("Main Courses");
//
//        ArrayList<MenuItem> menuItems = new ArrayList<>();
//        menuItems.add(new MenuItem());
//        menuItems.add(new MenuItem());



        //create a new Menu
        Menu menu = new Menu();

        menu.addMenuItem(new MenuItem(
                2.99,
                "Fries",
                "French Fried Potatoes",
                "Appetizers")
        );
        menu.addMenuItem(new MenuItem(
                3.99,
                "Onion Rings",
                "Deep fried Onion circles",
                "Appetizers")
        );
        menu.addMenuItem(new MenuItem(
                9.99,
                "Hamburger",
                "beef patty on bun",
                "Main Courses")
        );

        System.out.println(menu.toString());
        //Fill it with categories and menuItems

        //prompt user for updated at date

        //print our menu

    }
}
