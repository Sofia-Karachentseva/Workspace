import Lesson8HW.HW8;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Weekdays {
    private static final Logger testLog = LogManager.getLogger();

    @BeforeAll
    public static void classOpener() {
        testLog.info("Before all method");
    }

    @AfterAll
    public static void classCloser() {
        testLog.info("After all method");
    }

//Positive Tests

    //    static Stream<Arguments> dataProvider(){
//        return Stream.of(
//                Arguments.of(1, HW8.getDay)
//        );
//    }
    @ParameterizedTest
    @Test
    public void WeekdaysChecker() {
        HW8 hw8 = new HW8();
        assertEquals(Arrays.asList("Sunday"), hw8.getDay(1));

    }

}
