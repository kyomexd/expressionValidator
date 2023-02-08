package expressionValidator;

public abstract class Operation {
    private int priority;

    abstract String calculate(String expression);
    abstract String solveExpressions(String expression);
}
