package TestTaskForMentoring;

    public class Tester {
        static String input;
        String[] data = input.split(" ");
        String sumCredited = data[0];
        String monPayment = data[1];
        String IR = data[2];
        String client = data[3];

        public void CheckForNumbers() {
            try {
                double a = Double.parseDouble(sumCredited);
            } catch (NumberFormatException e){
                throw new ArithmeticException("Sum of debit input must be a number");
            }
            try {
                double b = Double.parseDouble(monPayment);
            } catch (NumberFormatException e){
                throw new ArithmeticException("Monthly payment input must be a number");
            }
            try {
                double c = Double.parseDouble(IR);
            } catch (NumberFormatException e){
                throw new ArithmeticException("Interest rate input must be a number");
            }


        }

        public boolean ifPositiveSumCred() {
            double a = Double.parseDouble(sumCredited);
            return a>0;
        }

        public boolean ifPositiveMonPay() {
            double b = Double.parseDouble(monPayment);
            return b>0;
        }

        public boolean ifPositiveIR() {
            double c = Double.parseDouble(IR);
            return c>0;
        }

        public boolean ifCorrectHumanBus() {

            return client.equals("human") || client.equals("business");
        }

        public boolean ifCalculable() {
            double a = Double.parseDouble(sumCredited);
            double b = Double.parseDouble(monPayment);
            double c = Double.parseDouble(IR);
            c = c / 100;
            a = a * c;
            return !(12 * b < a);
        }

    }
