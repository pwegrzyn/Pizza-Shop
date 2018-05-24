public class PizzaStore {

    public static void main(String args[]) {
        
        Pizza optionOne = new CheeseTopping(new PepperoniTopping(new BasePizza()));
        Pizza optionTwo = new SauceTopping(new CheeseTopping(new ThinCrustPizza()));
        Pizza optionThree = new TomatoesTopping(new PepperoniTopping(new ThickCrustPizza()));

        System.out.println("Welcome to the pizza store! Currently serving:\n");
        System.out.println("- Option 1:\n" + optionOne.getDescription() + "\nPrice: " + optionOne.getPrice() + " zł\n");
        System.out.println("- Option 2:\n" + optionTwo.getDescription() + "\nPrice: " + optionTwo.getPrice() + " zł\n");
        System.out.println("- Option 3:\n" + optionThree.getDescription() + "\nPrice: " + optionThree.getPrice() + " zł\n");

    }

}
