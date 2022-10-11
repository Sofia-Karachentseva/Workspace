package Lesson7;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

//    public static final int MULTIPLICATION = 1;
//    public static final int SUMMARY = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBTRACTION = 4;

//    enum final constants

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public enum Type {
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRACTION
    }

    public static double calculate(double a, double b, Type type) {

        logger.info("Running method calculate");
        double result = 0;
//        Could be done with if else
//        if (type == MULTIPLICATION) {
//            return a * b;
//        }
//        else if (type == SUMMARY){
//            return a + b;
//        }
//        Could be done with if switch
        try {
            switch (type) {
                case MULTIPLICATION:
                    result = a * b;
                    break;
                case SUMMARY:
                    result = a + b;
                    break;
                case DIVISION:
                    result = a / b;
                    break;
                case SUBTRACTION:
                    result = a - b;
                    break;

                default:
                    result = -2;
            }
        } catch (Exception error) {
//            System.out.println("Something went wrong");
            logger.error("Something went wrong", error);
            throw error;
        }
//        finally {
//            System.out.println("Finally block");
//            result = -1;
//        }
        return result;
    }
}
