import java.util.List;
import java.util.LinkedList;

public class PizzaStore {

    public static void main(String args[]) {
        
        List<Pizza> todaysMenu = new LinkedList<>();
        
        Pizza optionOne = new CheeseTopping(new PepperoniTopping(new BasePizza()));
        Pizza optionTwo = new SauceTopping(new CheeseTopping(new ThinCrustPizza()));
        Pizza optionThree = new TomatoesTopping(new PepperoniTopping(new ThickCrustPizza()));

        todaysMenu.add(optionOne);
        todaysMenu.add(optionTwo);
        todaysMenu.add(optionThree);

        System.out.println("\nWelcome to the pizza store! Currently serving:\n");
        for(int i = 0; i < todaysMenu.size(); i++)
        {
            System.out.println("- Option " + (i+1) + ":\n" + todaysMenu.get(i).getDescription() + "\nPrice: " + todaysMenu.get(i).getPrice() + " zł\n");
        }
        
        System.out.println("----------------------------");
        System.out.println("A client wants to buy Option 1 however he wishes double cheese on his pizza:");

        Pizza clientOrder = new CheeseTopping(optionOne);
        
        System.out.println("The clients order: " + clientOrder.getDescription() + " (" + clientOrder.getPrice() + " zł)\n");

    }

}
