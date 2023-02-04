package expressionValidator;

public class Main {
    public static void main(String[] args) {
        String expression = "10*1 = 100*1";
        System.out.println(ExpressionComparator.compareResults(expression));
    }
}
