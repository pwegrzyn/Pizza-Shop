public class CheeseTopping extends PizzaToppingDecorator {

    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", cheese";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 3;
    }

}