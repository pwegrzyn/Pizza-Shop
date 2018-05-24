public class TomatoesTopping extends PizzaToppingDecorator {

    public TomatoesTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", tomatoes";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }

}