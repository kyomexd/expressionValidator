package TestTaskForMentoring;

    public class Tester {
        static String input;
        String[] data = input.split(" ");
        String sumCredited = data[0];
        String monPayment = data[1];
        String IR = data[2];
        String client = data[3];

        public boolean ifPositive() {
            double a = Double.parseDouble(sumCredited);
            double b = Double.parseDouble(monPayment);
            double c = Double.parseDouble(IR);
            return a > 0 && b > 0 && c > 0 && client.equals("human") || client.equals("business");
        }

        public boolean ifCalculable() {
            double a = Double.parseDouble(sumCredited);
            double b = Double.parseDouble(monPayment);
            double c = Double.parseDouble(IR);
            c = c / 100;
            a = a * c;
            return !(12 * b <= a);
        }

        public boolean HorB() {
            return client.equals("human");
        }
    }
