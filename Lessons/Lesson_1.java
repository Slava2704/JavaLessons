
/*
*
* Lesson One - Five. Homework
*
*/

public class MyClass {

    public static void main(String[] args){
        System.out.println("Hello, World!"); // Просто создать проверить, чтобы в консоль выводилось
        /* Работоспособность задачи 3
        int resultOne = mathOperationOne(10, 20, 30, 5);
        System.out.println(resultOne);
        */
        /* Работоспособность задачи 4
        boolean resultTwo = mathOperationTwo(10, 5);
        System.out.println(resultTwo);
        */
        /* Работоспособность задачи 5
        String resultThree = compareOperationOne(-5);
        System.out.println(resultThree);
        */
        /* Работоспособность задачи 6
        boolean resultFour = compareOperationTwo(-5);
        System.out.println(resultFour);
        */
        /* Работоспособность задачи 7
        String resultFive = concatenationOne("Maks");
        System.out.println(resultFive);
        */
        /* Работоспособность задачи 8
        String resultSix = CheckYear(2012);
        System.out.println(resultSix);
         */
    }

    // задача 3  По условию задачи не понятно какие будут числа, поэтому берем любой тип из числовых, я выбрал int как более универсальный
    private static int mathOperationOne(int a, int b, int c, int d) {
    //        int result = a * (b + (c / d)); Я поначалу создал переменную, но она в данном контексте будет избыточной. Это не ошибка, но "среда разработки" написала убрать
        return a * (b + (c / d));
    }

    // задача 4
    private static boolean mathOperationTwo(int a, int b) {
        int c = a + b;
        /*
        if(10 < c && c <= 20){
            return true;
        }
            return false;
        */
        return 10 < c && c <= 20; //Тоже самое что написано выше, но короче
    }

    // задача 5
    private static String compareOperationOne(int a) {
        // Если будешь потом проверять этот метод через консоль Винды, то чтобы правильно писались слова на русском надо поменять кодироку, просто в консоле пишешь команду chcp 65001
        if( a >= 0 ){
            return "Число положительное";
        } else
        {
            return "Число отрицательное";
        }

    }

    // задача 6
    private static boolean compareOperationTwo(int a) {
        /*Вариант один
        if( a >= 0 ){
            return false;
        } else
        {
            return true;
        }
        */
        //Вариант два
        return a < 0;
    }

    // задача 7
    private static String concatenationOne(String userName) {
        return "Привет, " + userName + "!";
    }

    // задача 8
    private static String CheckYear(int year) {
        /*
        тут самая сложная часть, т.к. надо понимать что возвращает вот такая операция %. Например, 3 % 2 = 1
        что значат символы && и ||, по факту они соответсвуют "и" и "или"
        а также как из true сделать false с помощью !
        */

        if ( ((year % 4 == 0) && !(year % 100 == 0)) || (year % 400== 0) ) {
            return "Год високосный";
        }
        return "Год не високосный";
    }

}
