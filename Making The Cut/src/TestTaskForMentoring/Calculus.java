package TestTaskForMentoring;

public class Calculus {
    static String input;
    String[] data = input.split(" ");
    String sumCredited = data[0];
    String monPayment = data[1];
    String IR = data[2];
    String client = data[3];

    public double calc() {
        double a = Double.parseDouble(sumCredited);
        double b = Double.parseDouble(monPayment);
        double c = Double.parseDouble(IR);
        c = c / 100 + 1;
        b = 12 * b;
        double res = 0;
        if (client.equals("human")) {
            res += a * (c - 1);
            a = a * c;
        }
        while (a>b) {
            a = a - b;
            res += a * (c-1);
            a = a * c;
        }
        return res;
    }

}
