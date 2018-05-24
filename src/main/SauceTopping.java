public class SauceTopping extends PizzaToppingDecorator {

    public SauceTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sauce";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }

}