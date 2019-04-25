public class HealthyBurger extends Hamburger {
    private String healthy_addtion_name1;
    private double healthy_addition_price1;
    private String healthy_addtion_name2;
    private double healthy_addition_price2;

    public HealthyBurger(String meat, double base_price) {
        super("Healthy Burger", "brown rye bread roll", meat, base_price);
    }

    public void addHealthyAddtion1(String addtion_name, double addition_price) {
        this.healthy_addtion_name1 = addtion_name;
        this.healthy_addition_price1 = addition_price;
    }
    public void addHealthyAddtion2(String addtion_name, double addition_price) {
        this.healthy_addtion_name2 = addtion_name;
        this.healthy_addition_price2 = addition_price;
    }

    @Override
    public double humbergerTotalPrice() {
        double healthyPrice = super.humbergerTotalPrice();
        if (healthy_addtion_name1 != null){
            healthyPrice += healthy_addition_price1;
            System.out.println(healthy_addtion_name1 + " is added with price " + healthy_addition_price1);
        }
        if(healthy_addtion_name2 != null){
            healthyPrice += healthy_addition_price2;
            System.out.println(healthy_addtion_name2 + " is added with price " + healthy_addition_price2);
        }
        return healthyPrice;
    }
}
