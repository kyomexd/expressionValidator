package expressionValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Multiplication extends Operations{
    private int priority = 2;

    @Override
    String calculate(String expression) {
        int result = 1;
        Matcher digitMatcher = Pattern.compile("\\d+").matcher(expression);
        List<Integer> allMatches = new ArrayList<>();
        while (digitMatcher.find()) {
            allMatches.add(Integer.parseInt(digitMatcher.group()));
        }
        for (Integer i : allMatches) {
            result *= i;
        }
        return String.valueOf(result);
    }

    @Override
    String solveExpressions(String expression) {
        Matcher operations = Pattern.compile("\\d+\\*\\d+(\\*\\d+)*")
                .matcher(expression);
        List<String> expressions = new ArrayList<>();
        while (operations.find()) {
            expressions.add(operations.group());
        }
        if (!expressions.isEmpty()) {
            for (String exp : expressions) {
                expression = expression.replace(exp, calculate(exp));
            }
        }
        return expression;
    }
}
