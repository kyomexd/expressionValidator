package TestTaskForMentoring;

import java.util.Scanner;

public class FinancialCalc {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Tester.input = sc.nextLine();
                Tester inputData = new Tester();
                Calculus.input = Tester.input;
                Calculus answered = new Calculus();
                if (inputData.ifPositiveSumCred()) {
                        if (inputData.ifPositiveMonPay()) {
                                if (inputData.ifPositiveIR()) {
                                        if (inputData.ifCorrectHumanBus()) {


                                                if (inputData.ifCalculable()) {
                                                        double result = Math.floor(answered.calc());
                                                        System.out.println(result);

                                                } else throw new ArithmeticException("Input incalculable");
                                        } else throw new ArithmeticException("This software only supports human or business as clients");
                                } else throw new ArithmeticException("Interest Rate input is incorrect");
                        } else throw new ArithmeticException("Monthly payment input is incorrect");
                } else throw new ArithmeticException("Sum of debit input is incorrect");


        }

        }


