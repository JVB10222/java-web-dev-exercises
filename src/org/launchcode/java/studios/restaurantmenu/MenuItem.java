package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;

public class MenuItem {
    Double price;
    String name;
    String description;
    String category;
    Boolean isNew;
    Date createdAt;

    public MenuItem(Double price, String name, String description, String category) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;

        this.createdAt = new Date();
        this.isNew = true;
    }

    public boolean isNew(Date thresholdDate){
        Date now = new Date();
        if(createdAt.before(thresholdDate)){
            return false;

        }else {
            return  true;
        }
    }

    @Override
    public String toString(){
        String str = this.name + "\n"
                + this.price + "\n"
                + this.description + "\n";
        if(this.isNew(new Date())){
            str += "NEW! \n";
        }
        str += "***** \n \n";
        return str;
    }
}
