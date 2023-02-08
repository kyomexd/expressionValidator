package expressionValidator;

public class Counter {

    protected static int result(String expression) {
        expression = expression.replaceAll(" ", "");
        if (assertPriority(expression) == 2) {
            Multiplication multiplication = new Multiplication();
            expression = multiplication.solveExpressions(expression);
        }
        if (assertPriority(expression) == 1) {
            Addition addition = new Addition();
            Subtraction subtraction = new Subtraction();
            expression = addition.calculate(expression);
            expression = subtraction.calculate(expression);
        }
        return Integer.parseInt(expression);
    }

    private static int assertPriority(String expression) {
        if (expression.contains("*")) {
            return 2;
        }
        if (expression.contains("+") || expression.contains("-")) {
            return 1;
        }
        return 0;
    }
}
