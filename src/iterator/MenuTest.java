package iterator;

import java.util.ArrayList;

public class MenuTest {
    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new PancakeHouseMenu());
        menus.add(new DinerMenu());
        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }
}
