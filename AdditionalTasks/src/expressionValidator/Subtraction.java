package expressionValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Subtraction extends Operation{
    @Override
    String calculate(String expression) {
        int result = 0;
        Matcher digitMatcher = Pattern.compile("\\d+").matcher(expression);
        List<Integer> allMatches = new ArrayList<>();
        while (digitMatcher.find()) {
            allMatches.add(Integer.parseInt(digitMatcher.group()));
        }
        result += allMatches.get(0);
        for (int i = 1; i < allMatches.size(); i++) {
            result -= allMatches.get(i);
        }
        return String.valueOf(result);
    }

    @Override
    String solveExpressions(String expression) {
        Matcher operations = Pattern.compile("\\d+\\-\\d+(\\-\\d+)*")
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
