public class Hamburger {
    private String name;
    private String rollType;
    private String meat;
    private double price;

    private String addtion_name1;
    private double addition_price1;
    private String addtion_name2;
    private double addition_price2;
    private String addtion_name3;
    private double addition_price3;
    private String addtion_name4;
    private double addition_price4;


    public Hamburger(String name, String rollType, String meat, double base_price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = base_price;
    }

    public String getName() {
        return name;
    }

    public void addAddtion1(String addtion_name, double addition_price){
        this.addtion_name1 = addtion_name;
        this.addition_price1 = addition_price;
    }
    public void addAddtion2(String addtion_name, double addition_price){
        this.addtion_name2 = addtion_name;
        this.addition_price2 = addition_price;
    }
    public void addAddtion3(String addtion_name, double addition_price){
        this.addtion_name3 = addtion_name;
        this.addition_price3 = addition_price;
    }
    public void addAddtion4(String addtion_name, double addition_price){
        this.addtion_name4 = addtion_name;
        this.addition_price4 = addition_price;
    }

    public double humbergerTotalPrice(){
        System.out.println("The basic price of " + this.name + " on " +
                this.rollType + " with " + this.meat + " is " + this.price);
        if (addtion_name1 != null){
            price += addition_price1;
            System.out.println(addtion_name1 + " is added with price " + addition_price1);
        }
        if (addtion_name2 != null){
            price += addition_price2;
            System.out.println(addtion_name2 + " is added with price " + addition_price2);
        }
        if (addtion_name3 != null){
            price += addition_price3;
            System.out.println(addtion_name3 + " is added with price " + addition_price3);
        }
        if (addtion_name4 != null){
            price += addition_price4;
            System.out.println(addtion_name4 + " is added with price " + addition_price4);
        }

        return price;
    }
}
