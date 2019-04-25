public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String rollType, String meat, double base_price) {
        super("Deluxe Burger", rollType, meat, base_price);
        super.addAddtion1("Chips", 2.5);
        super.addAddtion2("Drinks", 3.0);
    }

    @Override
    public void addAddtion1(String addtion_name, double addition_price) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void addAddtion2(String addtion_name, double addition_price) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void addAddtion3(String addtion_name, double addition_price) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void addAddtion4(String addtion_name, double addition_price) {
        System.out.println("Cannot add additional items.");
    }
}
