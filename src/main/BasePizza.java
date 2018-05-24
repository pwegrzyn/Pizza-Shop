public class BasePizza implements Pizza {
    
    @Override
    public String getDescription() {
        return "Base pizza with normal crust";
    }

    @Override
    public int getPrice() {
        return 10;
    }

}