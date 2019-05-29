package mainthread;

import utility.Menu;

public class MainThread {
    public static void main(String[] args) {
        try{
            Menu menu = new Menu();
            menu.createMenu();
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
