package expressionValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Validator {

    protected static void isValid(String expression) {
        final String FLOAT_REGEX = "\\d*\\.";
        final String INV_SIGN_REGEX = "[^+\\-\\d\\s\\.\\=\\*]+";
        Pattern floatPattern = Pattern.compile(FLOAT_REGEX);
        Pattern invSignPattern = Pattern.compile(INV_SIGN_REGEX);
        Matcher floatMatcher = floatPattern.matcher(expression);
        if (floatMatcher.find()) {
            throw new FloatNumbersException();
        }
        Matcher invSignMatcher = invSignPattern.matcher(expression);
        if (invSignMatcher.find()) {
            throw new InvalidSignException();
        }
    }

}
