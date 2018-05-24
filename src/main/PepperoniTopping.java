public class PepperoniTopping extends PizzaToppingDecorator {

    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pepperoni";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 5;
    }

}