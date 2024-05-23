public class Chair implements Furniture {

    private int weight;

    public Chair(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visit(this);
    }

}
