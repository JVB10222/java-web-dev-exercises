package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    Date updatedAt;
    ArrayList<String> categories = new ArrayList<>();
    ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu() {
        this.updatedAt = new Date();
    }

    public Menu(Date updatedAt, ArrayList<String> categories, ArrayList<MenuItem> menuItems) {
        this.updatedAt = updatedAt;
        this.categories = categories;
        this.menuItems = menuItems;
    }

     public void addMenuItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
         if(!this.categories.contains(menuItem.category)){
//             this.categories.add(category);
         }
    }

    private void addCategory(String category){

        this.categories.add(category);


    }

    @Override
    public String toString() {

        String str =  "Menu{}" + "\n"
            +"\n"
            +"\n";
        for (String category :this.categories) {
            str += category + "\n";
            for (MenuItem menuItem : this.menuItems) {
                if(menuItem.category.equals(category)){
                    str += menuItems + "\n"
                            + menuItem.price + "\n"
                            + menuItem.description + "\n";
                    if(menuItem.isNew(new Date())){
                        str += "NEW! \n";
                    }

                }

            }
        }
        return str;
    }
}
