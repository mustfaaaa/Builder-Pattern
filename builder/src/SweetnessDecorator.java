public class SweetnessDecorator extends TeaDecorator {
    private String sweetnessType;  // e.g., "Sugar", "Honey"
    private int spoonCount;

    public SweetnessDecorator(Item tea, String sweetnessType, int spoonCount) {
        super(tea);
        this.sweetnessType = sweetnessType;
        this.spoonCount = spoonCount;
    }

    @Override
    public String name() {
        return tea.name() + " + " + spoonCount + " spoons of " + sweetnessType;
    }

    @Override
    public float price() {
        return tea.price() + (spoonCount * 2.0f);  // 2 per spoon
    }
}
