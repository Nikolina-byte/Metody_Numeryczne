package edu;

public class TrapezoidPattern implements IntegrationMethod{
    private double a;
    private double b;
    private int n;

    public TrapezoidPattern(double a, double b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    @Override
    public double calculateIntegral(Function function) {
        double h = (b-a) / n;
        return trapezoid(function, h);
    }

    public double trapezoid(Function function, double h) {
        double area;

        area = function.calculateValue(a) / 2.0 ;

        for (int i =1; i <= n-1; i++) {
            area += function.calculateValue(a + i * h);
        }
        area += function.calculateValue(a + n*h) /2.0;

        return area * h;
    } //  trap

}
