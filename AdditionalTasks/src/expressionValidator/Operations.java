package expressionValidator;

public enum Operations {
    NONE {
        @Override
        public int computeMath(String a, String b) {
            return 0;
        }
    },
    ADDITION {
        public int computeMath(String a, String b) {
            int aToint = Integer.parseInt(a);
            int bToint = Integer.parseInt(b);
            return aToint + bToint;
        }
    },
    SUBTRACTION {
        public int computeMath(String a, String b) {
            int aToint = Integer.parseInt(a);
            int bToint = Integer.parseInt(b);
            return aToint - bToint;
        }
    },
    MULTIPLICATION {
        public int computeMath(String a, String b) {
            int aToint = Integer.parseInt(a);
            int bToint = Integer.parseInt(b);
            return aToint * bToint;
        }
    };
    public abstract int computeMath (String a, String b);
}
