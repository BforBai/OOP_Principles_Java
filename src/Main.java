public class Main {
    public static void main(String[] args) {
        Hamburger ham = new Hamburger("A", "RA", "Beef",
                10.0);
        ham.addAddtion1("lettuce", 0.5);
        ham.addAddtion2("carrot", 1.5);
        ham.addAddtion3("cucumber", 1.5);
        ham.addAddtion4("tomato", 1.0);

        System.out.println("The total price of  " + ham.getName() + " is "+
                ham.humbergerTotalPrice());

        HealthyBurger hb = new HealthyBurger("Becon", 5.0);
        hb.addHealthyAddtion1("H1", 0.5);
        hb.addHealthyAddtion2("H2", 0.5);
        hb.addAddtion1("A1", 1.0);
        hb.addAddtion2("A2", 2.0);
        hb.addAddtion3("A3", 3.0);
        hb.addAddtion4("A4", 4.0);
        System.out.println("The total price of " + hb.getName() + " is " +
                hb.humbergerTotalPrice());

        DeluxeBurger db = new DeluxeBurger("R type 1", "Chicken",
                15.0);
        db.addAddtion1("Lettuce", 0.5);
        System.out.println("The total price of " + db.getName() + " is "
        + db.humbergerTotalPrice());

    }
}
