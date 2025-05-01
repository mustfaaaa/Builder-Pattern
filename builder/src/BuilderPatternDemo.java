import java.util.Scanner;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = new Meal();

        System.out.println("Welcome to Meal Builder!");

        // Choose Veg or Non-Veg
        System.out.print("Do you want a Veg meal? (yes/no): ");
        String vegChoice = scanner.nextLine();

        if (vegChoice.equalsIgnoreCase("yes")) {
            meal = mealBuilder.prepareVegMeal();
        } else {
            meal = mealBuilder.prepareNonVegMeal();
        }

        // Choose drink options
        System.out.print("Do you want Diet version of your drink? (yes/no): ");
        String dietChoice = scanner.nextLine();

        if (dietChoice.equalsIgnoreCase("yes")) {
            if (vegChoice.equalsIgnoreCase("yes")) {
                meal.addItem(new DietCoke());
            } else {
                meal.addItem(new DietPepsi());
            }
        }

        // Ask if Tea should be added
        System.out.print("Do you want Tea? (yes/no): ");
        String teaChoice = scanner.nextLine();
        if (teaChoice.equalsIgnoreCase("yes")) {
            Item tea = new Tea();

            // Add sweetness?
            System.out.print("Do you want to add sweetness? (yes/no): ");
            String sweetChoice = scanner.nextLine();
            if (sweetChoice.equalsIgnoreCase("yes")) {
                System.out.print("Enter sweetness type (Sugar/Honey): ");
                String type = scanner.nextLine();
                System.out.print("How many spoons?: ");
                int spoons = Integer.parseInt(scanner.nextLine());
                tea = new SweetnessDecorator(tea, type, spoons);
            }

            // Add cream?
            System.out.print("Do you want to add cream? (yes/no): ");
            String creamChoice = scanner.nextLine();
            if (creamChoice.equalsIgnoreCase("yes")) {
                tea = new CreamDecorator(tea);
            }

            meal.addItem(tea);
        }

        // Show final meal
        System.out.println("\nYour Meal:");
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());
    }
}
