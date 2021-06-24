package composite;

public class MenuTest {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem(
                "Pancake Dish 1",
                "Pancake description 1",
                true, 1.0));

        pancakeHouseMenu.add(new MenuItem(
                "Pancake Dish 2",
                "Pancake description 2",
                true, 2.0));

        dinerMenu.add(new MenuItem(
                "Diner Dish 1",
                "Diner description 1",
                true, 1.0));

        dinerMenu.add(new MenuItem(
                "Diner Dish 2",
                "Diner description 2",
                true, 2.0));

        dinerMenu.add(dessertMenu);

        cafeMenu.add(new MenuItem(
                "Cafe Dish 1",
                "Cafe description 1",
                true, 1.0));

        cafeMenu.add(new MenuItem(
                "Cafe Dish 2",
                "Cafe description 2",
                true, 2.0));

        dessertMenu.add(new MenuItem(
                "Desert Dish 1",
                "Desert description 1",
                true, 1.0));

        dessertMenu.add(new MenuItem(
                "Desert Dish 2",
                "Desert description 2",
                false, 2.0));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
