package TestTaskForMentoring;

import java.util.Scanner;

public class FinancialCalc {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Tester.input = sc.nextLine();
                Tester inputData = new Tester();
                Calculus.input = Tester.input;
                Calculus answered = new Calculus();
                if (inputData.ifPositive()) {
                        if (inputData.ifCalculable()) {

                                if (inputData.HorB()) {
                                        double result = Math.floor(answered.calcForHuman());
                                        System.out.println(result);
                                } else {
                                        double result = Math.floor(answered.calcForBusiness());
                                        System.out.println(result);
                                }
                        }
                        else {
                                throw new ArithmeticException ("Input incalculable");
                        }
                }
                else {
                        throw new ArithmeticException("Wrong input");
                }


        }

        }


