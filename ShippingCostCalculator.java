public class ShippingCostCalculator implements ShippingCostVisitor {

    private double cost;

    public double getCost() {
        return cost;
    }

    @Override
    public void visit(Chair chair) {
        cost = 10.00; // Flat rate for chairs
    }

    @Override
    public void visit(Table table) {
        cost = table.getSize() * 2.00; // Cost based on size
    }

    @Override
    public void visit(Sofa sofa) {
        cost = sofa.getDistance() * sofa.getVolume() * 0.5; // Distance-based cost for sofas
    }

}
