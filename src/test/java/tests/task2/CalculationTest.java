package tests.task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Tag("task2")
@DisplayName("Вычисления")
public class CalculationTest {

    @Test
    @DisplayName("Проверка ошибки [Ошибка при делении на ноль]")
    void checkDividedByZeroArithmeticException() {
        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> Calculation.eval(0, 10));

        assertEquals(
                "Ошибка при делении на ноль",
                exception.getMessage()
        );
    }

    @ParameterizedTest(name = "При a={0} и b={1} результат должен быть {2}")
    @MethodSource("provideTestData")
    void checkCalculation(int first, int second, double expectedValue) {
        double actualValue = Calculation.eval(first, second);

        assertEquals(expectedValue, actualValue);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(10, 2, 4.0),
                Arguments.of(5, 10, 2.0),
                Arguments.of(5, 5, 5.0),
                Arguments.of(2, 3, 1.5)
        );
    }
}
