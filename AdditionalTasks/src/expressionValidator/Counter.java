package expressionValidator;

import java.util.*;
import java.util.function.BiPredicate;

public class Counter {

    protected static int result(String expression) {
        char[] tokens = expression.toCharArray();
        Deque<Integer> values = new ArrayDeque<>();
        Deque<Character> operations = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ')
                continue;
            if (Character.isDigit(tokens[i])) {
                StringBuilder stringBuilder = new StringBuilder();
                while (i < tokens.length && Character.isDigit(tokens[i])) {
                    stringBuilder.append(tokens[i++]);
                }
                values.push(Integer.parseInt(stringBuilder.toString()));
                i--;
            }
            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*') {
                while (!operations.isEmpty() && hasPrecedence.test(tokens[i], operations.peek())) {
                    values.push(Operations.applyOp(operations.pop(), values.pop(), values.pop()));
                }
                operations.push(tokens[i]);
            }
        }
        while (!operations.isEmpty())
            values.push(Operations.applyOp(operations.pop(), values.pop(), values.pop()));
        return values.pop();
    }

    public static BiPredicate<Character, Character> hasPrecedence = (op1, op2) ->
            (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
}
