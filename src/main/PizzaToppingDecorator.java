abstract class PizzaToppingDecorator implements Pizza {

    private Pizza pizza;

    public PizzaToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription();
    }

    @Override
    public int getPrice() {
        return this.pizza.getPrice();
    }

}