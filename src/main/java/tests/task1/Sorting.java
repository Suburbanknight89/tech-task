package tests.task1;

public class Sorting {
    /**
    функция сортировки, принимает на вход:
    @param arrayForSorting массив для сортировки
    @param startIndex начальный индекс в массиве
    @param endIndex конечный индекс в массиве
     */
    public static void sorting(int[] arrayForSorting, int startIndex, int endIndex) {
        int middle = startIndex + (endIndex - startIndex) / 2;
        int pivot = arrayForSorting[middle];

        int i = startIndex, j = endIndex;
        while (i <= j) {
            while (arrayForSorting[i] < pivot) {
                i++;
            }

            while (arrayForSorting[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arrayForSorting[i];
                arrayForSorting[i] = arrayForSorting[j];
                arrayForSorting[j] = temp;
                i++;
                j--;
            }
        }

        if (startIndex < j)
            sorting(arrayForSorting, startIndex, j);

        if (endIndex > i)
            sorting(arrayForSorting, i, endIndex);
    }
}
