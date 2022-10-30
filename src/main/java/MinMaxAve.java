import java.util.Arrays;

public class MinMaxAve {

    //    8. Написать алгоритм MinMaxAve, который принимает
//    массив чисел int[]  и 2 значения индексов.
//    Алгоритм возвращает массив, который содержит минимальное значение,
//    максимальное значение,  и среднее среди всех значений между 2-мя индексами.
//
//    Test Data:
//            ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

    public int[] MinMaxAve(int[] array, int indexStart, int indexEnd) {
        if (array.length > 1) {
            int min = array[indexStart];
            int max = array[indexStart];
            for (int i = indexStart + 1; i < indexEnd + 1; i++) {
                int min2 = array[i];
                if (min2 < min) {
                    min = min2;
                }
                int max2 = array[i];
                if (max2 > max) {
                    max = max2;
                }
            }
            int ave = (min + max) / 2;
            int[] array2 = new int[]{min, max, ave};
            return array2;
        }

        return new int[0];

    }
}
