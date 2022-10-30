public class Intersection {

    //9. Написать алгоритм Intersection, который принимает на вход
    // 2 массива целых чисел и возвращает массив общих элементов.
    //
    //Test Data:
    //{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
    //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    //{1, 2, 4, 5, 89}, {8, 9, 45} → {}

    public int[] Intersection(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            int a = array1[i];
            for (int j = 0; j < array2.length; j++) {
                if (a == array2[j]) {
                    return new int[0];
                }
            }

        }
        return new int[0];
    }
}
