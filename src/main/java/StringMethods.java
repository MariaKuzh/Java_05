public class StringMethods {
    
    /* Методы isEmpty(), length(), trim(), replace()

    1. Написать метод removeSpaces(), который принимает на вход строку.
Если строка не пустая (проверить методом класса String),
то примените метод по удалению пробелов в начале и в конце строки.
Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
Если пробелов не было, вернуть сообщение “Пробелов не было”.
Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
Методы isEmpty(), length(), trim(), replace()
        //a.isEmpty() - пустая строка или нет, вывод boolean
       //a.lenght() - подсчет длины текста, вывод int
       //a.trim() - убрать лишние пробелы, вначале и в конце, выводит String
       //a.replace(" ", "") - заменить символы, выводит String

Test Data:
“    Red Rover School   “ → “Лишние пробелы удалены”
“Red Rover School“ → “Пробелов не было”
“” → “Строка пустая”

     */


    public String removeSpaces(String a) {

        if (a.isEmpty()) {
            return "Строка пустая"; // true|false

        }
        if (a == a.trim()) {
            return "Пробелов не было"; // String
        }
        if (a != a.trim()) {
            return "Лишние пробелы удалены"; // String
        }


        return "";

    }


    /*2. Написать алгоритм removeAllAs().
С помощью методов из видео1,  написать алгоритм,
который принимает на вход строку. Если строка валидная,
то метод удаляет все буквы a из строки, если таковые имеются.
Метод возвращает обработанную строку.

Test Data:
 “    Red Rover School   “ →  “Red Rover School“
“panda   “ → “pnd”
“taramasalata” → “trmslt”
     */

    public String removeAllAs(String a) {
        if (a.length() != 0) {
            a = a.trim();
            return a.replace("a", "");
        }

        return "";
    }

    /*3. Написать алгоритм removeAllZeros().
    С помощью методов из видео1,  написать алгоритм,
    который принимает на вход строку, состоящую из цифр.
    Если строка валидная, то метод удаляет все пробелы из строки,
    если таковые имеются. Метод возвращает обработанную строку,
    в которой нет нулей. Если в строке не было нулей,
    метод возвращает сообщение “This is a valid string”.

    Test Data:
            “3504209706040000 “ →  “35429764“
            “0000000111“ → “111”
            */

    public String removeAllZeros(String a) {
        if (a.length() != 0) {
            String b = a;
            if (b != a.trim()) {
                a = a.trim();
                return a.replace("0", "");
            }
            if (b == a.trim()) {
                return "This is a valid string";
            }
        }
        return "";
    }


    /* 4.Написать алгоритм removeAllSpaces.
С помощью методов из видео1,  написать алгоритм,
который принимает на вход строку. Если строка валидная,
то метод удаляет все пробелы из строки, если таковые имеются.
 Метод возвращает обработанную строку.
Test Data:
 “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
“p a     n   d a   “ → “panda”  */

    public String removeAllSpaces(String a) {
        if (a.length() != 0) {

            return a.replace(" ", "");
        }
        return "";
    }

    /* Методы
charAt(), concat(), contains(), substring(), toLowerCase(),  toUpperCase()

5.Напишите метод countAs(), который принимает на вход строку
и считает, сколько букв а или А содержится в строке.
Метод возвращает количество букв a/A,  и количество
букв/знаков в слове без букв a/A. Итоговый результат
должен строится с помощью метода из видео 2.

Test Data:
“Abracadabra” → “5, 6”
“Homenum Revelio” → “0, 15”
“3 tarAmasAlatA” → “6, 8”*/

//concat() -  объединение строчек;
//contains() -проверяется наличие символа (букв) true|false
//charAt() - выводит символ строки по индексу
//substring() - выводит символ строки начиная с индекса
//toLowerCase() - все буквы нижним регистром
//toUpperCase() - все буквы верхним регистром

    public String countAs(String a) {

        int count_a = 0;
        int count_A = 0;
        for (char element : a.toCharArray()) {
            if (element == 'a') count_a++;
            if (element == 'A') count_A++;
        }
        return (count_a + count_A + ", " + (a.length() - (count_a + count_A)));
    }

     /*6. Напишите метод countJava(), который принимает
        на вход текст и проверяет, содержится ли в тексте
        хотя бы одно слово Java.

Test Data:
“As of March 2022, Java 18 is the latest version,
while Java 17, 11 and 8 are the current long-term
support (LTS) versions. Oracle released the last
zero-cost public update for the legacy version
Java 8 LTS in January 2019 for commercial use,
although it will otherwise still support Java 8 with
public updates for personal use indefinitely.
Other vendors have begun to offer zero-cost builds
of OpenJDK 8 and 11 that are still receiving security
and other upgrades.” → true

“99 little bugs in a code.
99 little bugs in a code.
Take one down, and patch it around.
235 critical bugs in the code.” → false */

    public boolean countJava(String a) {
        if (a.contains("Java") == true) {
            return a.contains("Java");
        }
        return false;
    }

     /*7. Напишите метод insertQuotes(), который принимает слово
     и возвращает строку, в которой это слово “обернуто” в кавычки:
    Test Data:
    “Abracadabra” →  ““Abracadabra””*/

    public String insertQuotes(String a) {
        if (a.length() != 0) {
            return a.replace(a, "\"" + a + "\"");
        }
        return "";
    }


    /*8.  Напишите метод insertQuotes(), который принимает на вход
    две строки, и добавляет знак :  после слова “писал”,
    и оборачивает в кавычки вторую строку
    (результат строится с помощью метода concat())

Test Data:
“Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
“Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
Задание со звездочкой:
“Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
"Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""*/

    public String insertQuotes2(String a, String b) {
        if (a.length() != 0) {
            return (a.replace(a, a + ": ")).concat(b.replace(b, "\"" + b + "\""));
        }
        return "";
    }

    public String insertQuotes3(String a, String b) {
        if (a.length() != 0) {
            String b1 = b.replace("«", "\"");
            String b2 = b1.replace("»", "\"");
            return (a.replace(a, a + ": ")).concat(b2.replace(b2, "\"" + b2 + "\"\""));
        }
        return "";
    }

    /*9. Напишите метод, кторый принимает на вход
    название города и исправляет написание:
Test Data:
“ташкент” → “Ташкент”
“ЧикаГО” → “Чикаго”*/

    public String nameCity(String a) {
        if (a.length() != 0) {
            return a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
        }
        return "";
    }

    /* indexOf(), lastIndexOf()
    //indexOf(), вернет позицию первого вхождения указанного символа
    //lastIndexOf(), вернет позицию последнего вхождения указанного символа
    10. Напишите метод, который принимает на вход строку
    и букву-параметр, и возвращает все, что находится
    между первой и последней буквой-параметром:
Test Data:
“Abracadabra”, “b” → “bracadab”
“Whippersnapper”, “p” → “ppersnapp”*/

    public String indexOf(String a, String b) {
        if (a.length() != 0) {
            return a.substring(a.indexOf(b), (a.lastIndexOf(b) + 1));
        }
        return "";
    }


    /*11. Напишите метод, который принимает на вход слово,
    и возвращает true, если слово начинается и заканчивается
    на одинаковую букву, и false иначе
Test Data:
	“Abracadabra” → true
	“Whippersnapper” → false*/
    public boolean identicalLetters(String a) {
        String a1 = a.toLowerCase();
        char l1 = a1.charAt(0);
        char l2 = a1.charAt(a1.length() - 1);
        String sL1 = String.valueOf(l1);
        String sL2 = String.valueOf(l2);
        if ((sL1).equals(sL2)) {
            return true;
        }
        return false;
    }
    
    /*12. Напишите метод, который принимает на вход
    строку из двух слов, разделенных пробелом,
    и возвращает последнее слово
Test Data:
	“Red Rover” → “Rover”*/

    public String oneString(String a) {
        if (a.length() != 0) {
            for (int i = 0; i < a.length(); i++) {

                if (a.charAt(i) == ' ') {
                    return a.substring(i + 1);
                }

            }
        }
        return "";
    }

	/*
13. Написать метод, который принимает строку,
и 2 индекса. Метод удаляет все, что находится
между двумя индексами включительно
Test Data:
	“Red rover”, 1, 4 → “Rover”*/

    public String twoString(String a, int b, int c) {
        if (a.length() != 0) {
            return a.substring(0, b) + a.substring((c + 1), a.length());
        }
        return "";
    }

    /*split()
14. Напишите метод, который принимает на вход предложение
и возвращает слова из этого предложения в виде массива слов
Test Data:
“QA for Everyone” → {“QA”, “for”, “Everyone”}
“Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}*/
    public String[] arrayString(String a) {
        if (a.length() != 0) {
            String[] a1 = a.split(" ");
            return a1;
        }
        return new String[0];
    }


/*15. Написать метод, который принимает на вход предложение,
которое состоит из имени, фамилии, отчества и возвращает текст:
Test Data:
“Александр Сергеевич Пушкин” →

“Имя: Александр
Отчество: Сергеевич
Фамилия: Пушкин”*/

    public String arrayString2(String a) {
        if (a.length() != 0) {
            String[] a1 = a.split(" ");
            String[] b = {"Имя: ", "Отчество: ", "Фамилия: "};
            for (int i = 0, j = 0; i < a1.length && j < b.length; i++, j++) {
                return b[j] + a1[i];
            }
        }
        return "";
    }

    /*16. Написать метод, который принимает на вход слово и число n,
    и возвращает строку, где слово повторяется n раз.
    Test Data:
    “one”, 5 → “oneoneoneoneone”*/

    public String repeatString(String a, int b){
        if (a.length() != 0) {

            return a.repeat(b);
        }
        return "";
    }

    /* 17. Напишите метод, который принимает строку и index,
    и возвращает численное значение буквы, которая находится
    на позиции index (использовать только один метод класса String)*/

    public char indexString(String a, int b){
        if (a.length() != 0) {


        }
        return '0';
    }


    /* 18. Написать метод, который принимает 3 слова,
    и сравнивает их методом, который считает,
    что прописные и заглавные буквы - это одни и те же буквы.
    Метод возвращает true, если все слова одинаковы,
    и метод возвращает false, если слова не одинаковы:
Test Data:
“one”, “One”, “ONE”  → true
“one”, “Один”, “ONE” → false */


}







