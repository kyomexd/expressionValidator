package expressionValidator;

import static expressionValidator.Validator.isValid;

public class ExpressionComparator {
    static final String EQUALS = "=";
    static final int FIRST_EXPRESSION_INDEX = 0;
    static final int SECOND_EXPRESSION_INDEX = 1;

    public static boolean compareResults(String expression) {
        boolean isEqual = false;
        isValid(expression);
        String[] separateExpression = expression.split(EQUALS);
        String firstExpression = separateExpression[FIRST_EXPRESSION_INDEX];
        String secondExpression = separateExpression[SECOND_EXPRESSION_INDEX];
        int firstResult = Counter.result(firstExpression);
        int secondResult = Counter.result(secondExpression);
        if (firstResult == secondResult) {
            isEqual = true;
        }
        return isEqual;
    }
}
