package edu;

public class SimpsonRule implements IntegrationMethod{
    private double a;
    private double b;
    private int n;

    public SimpsonRule(double a, double b, int n) {
        this.a = a;
        this.b = b;
        if(n % 2 != 0)
            n++;
        this.n = n;
    }

    @Override
    public double calculateIntegral(Function function) {
        double h = (b-a) / n;
        return simpson(function, h);
    }

    public double simpson(Function function, double h) {
        double area = 0;

        double[] x = new double[n+1];
        double[] fx= new double[n+1];

        for (int i = 0; i <= n; i++) {
            x[i] = a + i * h;
            fx[i] = function.calculateValue(x[i]);
        }

        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == n)
                area += fx[i];
            else if (i % 2 != 0)
                area += 4 * fx[i];
            else
                area += 2 * fx[i];
        }

        return area * (h / 3);
    }


}
