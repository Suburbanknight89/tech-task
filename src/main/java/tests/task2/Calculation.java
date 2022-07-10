package tests.task2;

/**
 * Необходимо реализовать метод на java или kotlin в отдельном классе, который бы на вход принимал int a, int b и выдавал бы следующие значения:
 * если a > b, то значение double c = (a - b)/2,
 * если a < b, то значение double c = b/a,
 * если a = b, то double c = a,
 * при делении на 0 необходимо возвращать текст ошибки "Ошибка при делении на ноль".
 */
public class Calculation {

    /**
     * Принимает на вход два числа и возвращает результат, исходя из условия: <br>
     * если a > b, то результат операции (a - b) / 2; <br>
     * если a < b, то результат операции b / a; <br>
     * иначе возвращает a.
     */
    public static double eval(int a, int b) {
        double c;
        if (a > b) {
            c = div((a - b), 2);
        } else if (a < b) {
            c = div(b, a);
        } else {
            c = a;
        }

        return c;
    }

    /**
     * Принимает два целых числа и производит операцию деления.
     * Если делитель равен 0, то выбрасывается ArithmeticException.
     * @param divisible делимое
     * @param divisor делитель
     * @return частное от деления
     */
    private static double div(int divisible, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Ошибка при делении на ноль");
        }
        return (double) divisible / divisor;
    }
}
