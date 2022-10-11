package Lesson7;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        double result = Calculator.calculate(8, 5, Calculator.Type.MULTIPLICATION);

//        System.out.println("Result = " + result);

//        try {
//            result = Calculator.calculate(10, 5, null);
//            System.out.println("Result = " + result);
//        } catch (Exception error) {
//            System.out.println("Something went wrong");
//        }

        result = Calculator.calculate(10, 5, null);
//        System.out.println("Result = " + result);
        logger.info("Result" + result);

        result = Calculator.calculate(15, 5, Calculator.Type.DIVISION);
//        System.out.println("Result = " + result);
        logger.info("Result" + result);

        result = Calculator.calculate(15, 5, Calculator.Type.SUBTRACTION);
//        System.out.println("Result" + result);
        logger.info("Result" + result);
    }
}
