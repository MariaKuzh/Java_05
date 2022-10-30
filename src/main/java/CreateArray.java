public class CreateArray {

//1.1.  В голубой папке java создать класс CreateArray,
// написать в этом классе метод createIntArray(),
// который принимает на вход 5 целых чисел,
// и возвращает массив из этих же чисел.

//Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}

    public int[] createIntArray(int a, int b, int c, int d, int e) {
        int[] newArray = new int[]{a, b, c, d, e};
        return newArray;
    }


//   1.2. Написать метод createDoubleArray(),
//    который принимает на вход 5 чисел типа double,
//    и возвращает массив из этих же чисел
//    Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}

    public double[] createDoubleArray(double a, double b, double c, double d, double e) {
        double[] newArray = new double[]{a, b, c, d, e};
        return newArray;
    }

//1.3. Написать метод createStringArray(),
// который принимает на вход 5 слов,
// и возвращает массив из этих слов

//Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}

    public String[] createStringArray(String a, String b, String c, String d, String e) {
        String[] newArray = new String[]{a, b, c, d, e};
        return newArray;
    }


    ////4я задача только для тех, кто хочет
    // разобраться с методом класса String split()
    //1.4. Написать метод createArrayFromText(),
    // который принимает на вход предложение из
    // нескольких слов и возвращает массив из этих слов.

    //Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}

    public String[] createArrayFromText(String a) {
        String[] parts = a.split(" ");
        String part1 = parts[0]; // It
        String part2 = parts[1]; // was
        String part3 = parts[2]; // an
        String part4 = parts[3]; // apple
        String part5 = parts[4]; // pie
        return parts;
    }
}


