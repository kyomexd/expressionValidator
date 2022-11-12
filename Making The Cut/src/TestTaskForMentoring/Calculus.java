package TestTaskForMentoring;

public class Calculus {
    static String input;
    String[] data = input.split(" ");
    String sumCredited = data[0];
    String monPayment = data[1];
    String IR = data[2];

    public double calcForHuman() {
        double a = Double.parseDouble(sumCredited);
        double b = Double.parseDouble(monPayment);
        double c = Double.parseDouble(IR);
        double OGSum = a;
        c = c / 100 + 1;
        b = 12 * b;
        int i = 0;
        double res;
        while (a*c>b) {
            a = a * c;
            a = a - b;
            i++;
        }
        if (a>0) {
            a = a * c;
        }
        else {
            a = a * (-1);
        }
        res = b * i + a - OGSum;
        return res;
    }
    public double calcForBusiness() {
        double a = Double.parseDouble(sumCredited);
        double b = Double.parseDouble(monPayment);
        double c = Double.parseDouble(IR);
        double OGSum = a;
        c = c / 100 + 1;
        b = 12 * b;
        int i = 0;
        double res;
        while (a > b) {
            a = a - b;
            a = a * c;
            i++;
        }
        res = b * i + a - OGSum;
        return res;
    }

}
