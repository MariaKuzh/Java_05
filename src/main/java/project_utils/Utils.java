package project_utils;

public class Utils {


    static String task = "\n_____________Task № ";
    static String line = "_____________";
    static int number = 1;


    // печать номера
    public static void printTask() {
        System.out.println(task + (number++) + line);
    }


    //метод verifyEquals
    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }





}
