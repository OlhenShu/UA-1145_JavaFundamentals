package edu08;

interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

class DemoDefaultMethods {
    public static void main(String[] args) {

        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 10);
            }
        };

        double result = formula.calculate(20);
        System.out.println(result);
    }
}