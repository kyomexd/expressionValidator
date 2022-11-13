package TestTaskForMentoring;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FinancialCalc {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Tester.input = sc.nextLine();
                Tester inputData = new Tester();
                Calculus.input = Tester.input;
                Calculus answered = new Calculus();
                inputData.CheckForNumbers();
                if (inputData.ifPositiveSumCred()) {
                        if (inputData.ifPositiveMonPay()) {
                                if (inputData.ifPositiveIR()) {
                                        if (inputData.ifCorrectHumanBus()) {


                                                if (inputData.ifCalculable()) {
                                                        double result = answered.calc();
                                                        BigDecimal value = new BigDecimal(result);
                                                        value = value.setScale(1, RoundingMode.HALF_EVEN);
                                                        System.out.println(value);

                                                } else throw new ArithmeticException("Input incalculable");
                                        } else throw new ArithmeticException("This software only supports human or business as clients");
                                } else throw new ArithmeticException("Interest Rate input is incorrect");
                        } else throw new ArithmeticException("Monthly payment input is incorrect");
                } else throw new ArithmeticException("Sum of debit input is incorrect");


        }

        }


