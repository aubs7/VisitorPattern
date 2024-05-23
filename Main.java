public class Main {
    public static void main(String[] args) {
        Furniture chair = new Chair(5);
        Furniture table = new Table(20);
        Furniture sofa = new Sofa(100, 50);

        ShippingCostVisitor calculator = new ShippingCostCalculator();

        chair.accept(calculator);
        System.out.println("Chair shipping cost: " + ((ShippingCostCalculator) calculator).getCost());

        calculator = new ShippingCostCalculator();
        table.accept(calculator);

        System.out.println("Table shipping cost: " + ((ShippingCostCalculator) calculator).getCost());

        calculator = new ShippingCostCalculator();
        sofa.accept(calculator);

        System.out.println("Sofa shipping cost: " + ((ShippingCostCalculator) calculator).getCost());
    }
}