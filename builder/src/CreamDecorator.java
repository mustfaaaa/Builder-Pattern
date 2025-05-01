public class CreamDecorator extends TeaDecorator {
    public CreamDecorator(Item tea) {
        super(tea);
    }

    @Override
    public String name() {
        return tea.name() + " + Cream";
    }

    @Override
    public float price() {
        return tea.price() + 5.0f;  // 5 extra for cream
    }
}
