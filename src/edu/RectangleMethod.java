package edu;

public class RectangleMethod implements IntegrationMethod {
    private double a;
    private double b;
    private int n;

    public RectangleMethod(double a, double b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    @Override
    public double calculateIntegral(Function function) {
        double integral = 0;
        double step = (b - a) / n;

        for (int i = 1; i <= n; ++i) {
            integral += step * function.calculateValue(a + (i - 1) * step);
        }

        return integral;
    }
}
