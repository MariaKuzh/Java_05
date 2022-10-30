import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

 /*1. Написать метод removeSpaces(), который принимает на вход строку.
Если строка не пустая (проверить методом класса String),
то примените метод по удалению пробелов в начале и в конце строки.
Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
Если пробелов не было, вернуть сообщение “Пробелов не было”.
Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
Методы isEmpty(), length(), trim(), replace()
        //a.isEmpty() - пустая строка или нет, вывод boolean
       //a.lenght() - подсчет длины текста, вывод int
       //a.trim() - убрать лишние пробелы, вначале и в концеб выводит String
       //a.replace(" ", "") - заменить символы, выводит String

Test Data:
“    Red Rover School   “ → “Лишние пробелы удалены”
“Red Rover School“ → “Пробелов не было”
“” → “Строка пустая”

     */

    //Positive Happy path
    @Test
    public void removeSpacesTest(){
        String a = "    Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";
        //act
        String actualResult = new StringMethods().removeSpaces(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void removeSpacesTest2(){
        String a = "Red Rover School";
        String expectedResult = "Пробелов не было";
        //act
        String actualResult = new StringMethods().removeSpaces(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void removeSpacesTest3(){
        String a = "";
        String expectedResult = "Строка пустая";
        //act
        String actualResult = new StringMethods().removeSpaces(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
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
    //Positive Happy path
    @Test
    public void removeAllAsTest(){
        String a = "    Red Rover School   ";
        String expectedResult = "Red Rover School";
        //act
        String actualResult = new StringMethods().removeAllAs(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void removeAllAsTest2(){
        String a = "panda   ";
        String expectedResult = "pnd";
        //act
        String actualResult = new StringMethods().removeAllAs(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void removeAllAsTest3(){
        String a = "taramasalata";
        String expectedResult = "trmslt";
        //act
        String actualResult = new StringMethods().removeAllAs(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    //Negative test
    @Test
    public void removeAllAsTest4(){
        String a = "";
        String expectedResult = "";
        //act
        String actualResult = new StringMethods().removeAllAs(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
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

    //Positive Happy path
    @Test
    public void removeAllZerosTest(){
        String a = "3504209706040000 ";
        String expectedResult = "35429764";
        //act
        String actualResult = new StringMethods().removeAllZeros(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void removeAllZerosTest2(){
        String a = "0000000111";
        String expectedResult = "111";
        //act
        String actualResult = new StringMethods().removeAllZeros(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void removeAllZerosTest3(){
        String a = "111";
        String expectedResult = "This is a valid string";
        //act
        String actualResult = new StringMethods().removeAllZeros(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Negative test
    @Test
    public void removeAllZerosTest4(){
        String a = "";
        String expectedResult = "";
        //act
        String actualResult = new StringMethods().removeAllZeros(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

/* 4.Написать алгоритм removeAllSpaces.
С помощью методов из видео1,  написать алгоритм,
который принимает на вход строку. Если строка валидная,
то метод удаляет все пробелы из строки, если таковые имеются.
 Метод возвращает обработанную строку.
Test Data:
 “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
“p a     n   d a   “ → “panda”  */

    //Positive Happy path
    @Test
    public void removeAllSpacesTest(){
        String a = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";
        //act
        String actualResult = new StringMethods().removeAllSpaces(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void removeAllSpacesTest2(){
        String a = "p a     n   d a   ";
        String expectedResult = "panda";
        //act
        String actualResult = new StringMethods().removeAllSpaces(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Negative test
    @Test
    public void removeAllSpacesTest3(){
        String a = "";
        String expectedResult = "";
        //act
        String actualResult = new StringMethods().removeAllSpaces(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
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

    //Positive Happy path
    @Test
    public void countAsTest(){
        String a = "Abracadabra";
        String expectedResult = "5, 6";
        //act
        String actualResult = new StringMethods().countAs(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void countAsTest2(){
        String a = "Homenum Revelio";
        String expectedResult = "0, 15";
        //act
        String actualResult = new StringMethods().countAs(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void countAsTest3(){
        String a = "3 tarAmasAlatA";
        String expectedResult = "6, 8";
        //act
        String actualResult = new StringMethods().countAs(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
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


    //Positive Happy path
    @Test
    public void countJavaTest(){
        String a = "s of March 2022, Java 18 is the latest version,\n" +
                "while Java 17, 11 and 8 are the current long-term\n" +
                "support (LTS) versions. Oracle released the last\n" +
                "zero-cost public update for the legacy version\n" +
                "Java 8 LTS in January 2019 for commercial use,\n" +
                "although it will otherwise still support Java 8 with\n" +
                "public updates for personal use indefinitely.\n" +
                "Other vendors have begun to offer zero-cost builds\n" +
                "of OpenJDK 8 and 11 that are still receiving security\n" +
                "and other upgrades.";
        boolean expectedResult = true;
        //act
        boolean actualResult = new StringMethods().countJava(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Negative
    @Test
    public void countJavaTest2(){
        String a = "99 little bugs in a code.\n" +
                "99 little bugs in a code.\n" +
                "Take one down, and patch it around.\n" +
                "235 critical bugs in the code.";
        boolean expectedResult = false;
        //act
        boolean actualResult = new StringMethods().countJava(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /*7. Напишите метод insertQuotes(), который принимает слово
     и возвращает строку, в которой это слово “обернуто” в кавычки:
    Test Data:
    “Abracadabra” →  ““Abracadabra””*/

    //Positive Happy path
    @Test
    public void insertQuotesTest(){
        String a = "Abracadabra";
        String expectedResult = "\"Abracadabra\"";
        //act
        String actualResult = new StringMethods().insertQuotes(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Negative test
    @Test
    public void insertQuotesTest2(){
        String a = "";
        String expectedResult = "";
        //act
        String actualResult = new StringMethods().insertQuotes(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
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

    //Positive Happy path
     @Test
     public void insertQuotes2Test(){
         String a = "Федор Достоевский писал";
         String b = "Надо любить жизнь больше, чем смысл жизни.";
         String expectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";
         //act
         String actualResult = new StringMethods().insertQuotes2(a,b);
         //assert
         Assert.assertEquals(actualResult,expectedResult);
     }

    //Positive Happy path
    @Test
    public void insertQuotes3Test(){
        String a = "Наполеон Бонапарт писал";
        String b = "В моем словаре нет слова «невозможно».";
        String expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"\"";
        //act
        String actualResult = new StringMethods().insertQuotes3(a,b);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    /*9. Напишите метод, кторый принимает на вход
    название города и исправляет написание:
Test Data:
“ташкент” → “Ташкент”
“ЧикаГО” → “Чикаго”*/

    //Positive Happy path
    @Test
    public void nameCityTest(){
        String a = "ташкент";
        String expectedResult = "Ташкент";
        //act
        String actualResult = new StringMethods().nameCity(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void nameCityTest2(){
        String a = "ЧикаГО";
        String expectedResult = "Чикаго";
        //act
        String actualResult = new StringMethods().nameCity(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /*
     10. Напишите метод, который принимает на вход строку
    и букву-параметр, и возвращает все, что находится
    между первой и последней буквой-параметром:
Test Data:
“Abracadabra”, “b” → “bracadab”
“Whippersnapper”, “p” → “ppersnapp”*/

    //Positive Happy path
    @Test
    public void indexOfTest(){
        String a = "Abracadabra";
        String b = "b";
        String expectedResult = "bracadab";
        //act
        String actualResult = new StringMethods().indexOf(a,b);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void indexOfTest2(){
        String a = "Whippersnapper";
        String b = "p";
        String expectedResult = "ppersnapp";
        //act
        String actualResult = new StringMethods().indexOf(a,b);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    /*11. Напишите метод, который принимает на вход слово,
    и возвращает true, если слово начинается и заканчивается
    на одинаковую букву, и false иначе
Test Data:
	“Abracadabra” → true
	“Whippersnapper” → false*/

    //Positive Happy path
    @Test
    public void identicalLettersTest(){
        String a = "Abracadabra";

        boolean expectedResult = true;
        //act
        boolean actualResult = new StringMethods().identicalLetters(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void identicalLettersTest2(){
        String a = "Whippersnapper";

        boolean expectedResult = false;
        //act
        boolean actualResult = new StringMethods().identicalLetters(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /*12. Напишите метод, который принимает на вход
    строку из двух слов, разделенных пробелом,
    и возвращает последнее слово
Test Data:
	“Red Rover” → “Rover”*/

    //Positive Happy path
    @Test
    public void oneStringTest(){
        String a = "Red Rover";
        String expectedResult = "Rover";
        //act
        String actualResult = new StringMethods().oneString(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /* 13. Написать метод, который принимает строку,
    и 2 индекса. Метод удаляет все, что находится
    между двумя индексами включительно
    Test Data:
            “Red rover”, 1, 4 → “Rover”*/


    //Positive Happy path
    @Test
    public void twoStringTest(){
        String a = "Red rover";
        int b = 1;
        int c = 4;
        String expectedResult = "Rover";
        //act
        String actualResult = new StringMethods().twoString(a,b,c);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void twoStringTest2(){
        String a = "Red rover";
        int b = 0;
        int c = 4;
        String expectedResult = "over";
        //act
        String actualResult = new StringMethods().twoString(a,b,c);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /*14. Напишите метод, который принимает на вход предложение
    и возвращает слова из этого предложения в виде массива слов
    Test Data:
            “QA for Everyone” → {“QA”, “for”, “Everyone”}
“Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}*/

    //Positive Happy path
    @Test
    public void arrayStringTest(){
        String a = "QA for Everyone";
        String[] expectedResult = {"QA", "for", "Everyone"};
        //act
        String[] actualResult = new StringMethods().arrayString(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void arrayStringTest2(){
        String a = "Александр Сергеевич Пушкин";
        String[] expectedResult = {"Александр", "Сергеевич", "Пушкин"};
        //act
        String[] actualResult = new StringMethods().arrayString(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }
/*15. Написать метод, который принимает на вход предложение,
которое состоит из имени, фамилии, отчества и возвращает текст:
Test Data:
“Александр Сергеевич Пушкин” →

“Имя: Александр
Отчество: Сергеевич
Фамилия: Пушкин”*/

    //Positive Happy path
    @Test
    public void arrayString2Test(){
        String a = "Александр Сергеевич Пушкин";
        String expectedResult = "Имя: Александр\n" +
                "Отчество: Сергеевич\n" +
                "Фамилия: Пушкин";
        //act
        String actualResult = new StringMethods().arrayString2(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /*16. Написать метод, который принимает на вход слово и число n,
    и возвращает строку, где слово повторяется n раз.
    Test Data:
    “one”, 5 → “oneoneoneoneone”*/

    //Positive Happy path
    @Test
    public void repeatStringTest(){
        String a = "one";
        int b = 5;
        String expectedResult = "oneoneoneoneone";
        //act
        String actualResult = new StringMethods().repeatString(a,b);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

}
