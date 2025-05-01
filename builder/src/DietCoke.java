public class DietCoke extends ColdDrink {

    @Override
    public String name() {
        return "Diet Coke";
    }

    @Override
    public float price() {
        return 32.0f; // Slightly more expensive, if you like
    }
}