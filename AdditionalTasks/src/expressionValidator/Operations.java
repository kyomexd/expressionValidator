package expressionValidator;

public abstract class Operations {
    private int priority;

    abstract String calculate(String expression);
    abstract String solveExpressions(String expression);
}
