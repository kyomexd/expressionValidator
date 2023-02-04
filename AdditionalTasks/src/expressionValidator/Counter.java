package expressionValidator;

public class Counter {

    protected static int result(String expression) {
        int result = 0;
        char valueAt;
        StringBuilder currentValue = new StringBuilder();
        StringBuilder firstValue = new StringBuilder();
        Operations operation = Operations.NONE;
        for (int i = 0; i < expression.length(); i++) {
            valueAt = expression.charAt(i);
            if (Character.isDigit(valueAt)) {
                currentValue.append(valueAt);
            }
            if (valueAt == '+' || valueAt == '-' || valueAt == '*' || i == expression.length() - 1) {
                result += operation.computeMath(firstValue.toString(), currentValue.toString());
                if (valueAt == '+') {
                    operation = Operations.ADDITION;
                }
                if (valueAt == '-') {
                    operation = Operations.SUBTRACTION;
                }
                if (valueAt == '*') {
                    operation = Operations.MULTIPLICATION;
                }
                firstValue = currentValue;
                currentValue = new StringBuilder();
            }
        }
        return result;
    }
}
