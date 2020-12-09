package edu;

public class FunctionTest {
    public static void main(String[] args) {
        System.out.println("Obliczone wartości do sprawdzenia: ");
        double dev = (Math.pow(4,3) / 3.0) - (Math.pow(-2,3) / 3.0);
        System.out.println(dev);

        System.out.println("Rectangle Method: ");
        IntegrationMethod rectangleMethod = new RectangleMethod(-2, 4,100);
        double dev3 = rectangleMethod.calculateIntegral((x) -> x*x);
        System.out.println(dev3);
        System.out.println(valueError(dev, dev3));

        System.out.println("Trapezoid Pattern: ");
        IntegrationMethod trapezoidMethod = new TrapezoidPattern(-2,4,100);
        double dev1 = trapezoidMethod.calculateIntegral((x) -> x*x);
        System.out.println(dev1);
        System.out.println(valueError(dev, dev1));

        System.out.println("Simpson Rule: ");
        IntegrationMethod simpsonRule = new SimpsonRule(-2,4,100);
        double dev2 = simpsonRule.calculateIntegral((x) -> x*x);
        System.out.println(dev2);
        System.out.println(valueError(dev, dev2));

    }

    public static double valueError(double xExp, double x){
        return Math.abs((xExp - x) / xExp );
    }

}
