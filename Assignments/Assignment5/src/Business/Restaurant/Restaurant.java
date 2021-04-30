/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Menu.MenuDirectory;
import Business.Orders.Order;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    private String name;
    private int id;
    private int rating;
    private String decription;
    private String Manager;
    private MenuDirectory menuDirectory;
    //private Order order;

//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }

    public String getManager() {
        return Manager;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
    

    public void setManager(String Manager) {
        this.Manager = Manager;
    }
    private static int count = 1;

    public Restaurant() {
        menuDirectory = new MenuDirectory();
        id = count;
        count++;
    }

    public MenuDirectory getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(MenuDirectory menuDirectory) {
        this.menuDirectory = menuDirectory;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
