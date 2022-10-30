public class OddEvenValuesInArray {

    //1.10. Написать метод countEvenValuesInArray(),
    // который принимает на вход массив целых чисел,
    // и возвращает количество четных чисел в этом массиве

    public int countEvenValuesInArray(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0 ){
                counter++;
            }
        }
                return counter;

    }

    //1.11 Написать метод countOddValuesInArray(),
    // который принимает на вход массив целых чисел,
    // и возвращает количество нечетных чисел в этом массиве

    public int countOddValuesInArray(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0 ){
                counter++;
            }
        }
        return counter;

    }

    //1.12 В классе ManipulationsWithArrays написать
    // метод areValuesGreaterThanNumber(), который принимает
    // на вход массив целых чисел и число number.
    // Метод возвращает значение true, если все элементы
    // массива больше number, иначе возвращает false
}
