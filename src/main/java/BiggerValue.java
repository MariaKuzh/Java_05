public class BiggerValue {

//    4. Напишите алгоритм BiggerValue, который из двух
//    параметров типа int возвращает бОльшее значение.
//    Test Data:
//            3333, 9999
//    Expected Result = 9999

public int BiggerValue(int a, int b) {
    if (a > b) {
    return a;
    } else if (a < b){
        return b;
    } else if (a == b){
        return a;
    }
    return -1;
}

}
