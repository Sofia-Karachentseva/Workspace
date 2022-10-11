package Lesson8HW;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        HW8 hw8 = new HW8();
        hw8.getDay(1);
        log.info("Day is " + hw8.getDay(2));
    }
}
