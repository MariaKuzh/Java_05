public class OddIndices {

//  2. Написать алгоритм OddIndices, который принимает массив целых чисел,
//  и возвращает массив значений нечетных индексов
//Test Data:
//Input = {-45, 590, 234, 985, 12, 68}
//Expected Result =  {590, 985, 68}

       public int[] oddIndices(int[] array) {
        if (array.length > 1) {
            int[] newArray = new int[array.length / 2];
            int j = 1;
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[j];
                j = j + 2;
            }
            return newArray;

        }
        return new int[0];

    }
}

