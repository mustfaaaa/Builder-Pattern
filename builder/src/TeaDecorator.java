public abstract class TeaDecorator extends HotDrink {
    protected Item tea;

    public TeaDecorator(Item tea) {
        this.tea = tea;
    }

    @Override
    public Packing packing() {
        return tea.packing();  // same packing
    }
}
