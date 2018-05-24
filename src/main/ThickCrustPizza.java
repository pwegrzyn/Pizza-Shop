public class ThickCrustPizza implements Pizza {
    
    @Override
    public String getDescription() {
        return "Pizza with thick crust";
    }

    @Override
    public int getPrice() {
        return 12;
    }

}