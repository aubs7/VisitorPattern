public class Sofa implements Furniture {

    private int distance;
    private int volume;

    public Sofa(int distance, int volume) {
        this.distance = distance;
        this.volume = volume;
    }

    public int getDistance() {
        return distance;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visit(this);
    }

}
