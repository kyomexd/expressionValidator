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
