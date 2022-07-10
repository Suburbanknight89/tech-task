package tests.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@Tag("task1")
@DisplayName("Сортировка")
public class SortingTest {
    @ParameterizedTest(name = "При startIndex=({1}) и endIndex=({2}) массив {0} должен быть отсортирован как {3}")
    @MethodSource("provideTestData")
    void checkSorting(int[] arr, int start, int end, int[] expected) {
        Sorting.sorting(arr, start, end);
        assertArrayEquals(expected, arr);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(
                        new int[]{3, 2, 1},
                        0,
                        2,
                        new int[]{1, 2, 3}
                ),
                Arguments.of(
                        new int[]{3, 2},
                        0,
                        0,
                        new int[]{3, 2}
                ),
                Arguments.of(
                        new int[]{4, 3, 2, 1},
                        0,
                        -1,
                        new int[]{4, 3, 2, 1}
                ),
                Arguments.of(
                        new int[]{4, 3, 2, 1, 0},
                        0,
                        2,
                        new int[]{2, 3, 4, 1, 0}
                )
        );
    }
}
