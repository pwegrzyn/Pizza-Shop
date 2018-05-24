public class ThinCrustPizza implements Pizza {
    
    @Override
    public String getDescription() {
        return "Pizza with thin crust";
    }

    @Override
    public int getPrice() {
        return 8;
    }

}