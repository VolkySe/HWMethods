public class Main {
    public static void task1() {
        System.out.println("Task1");
        short year = 2057; //ввод номера года
        if (isLeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year + " год не является високосным");
        System.out.println();
    }

    public static boolean isLeapYear(short year) {
        return (year > 1584 && (year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0))));
    }

    public static void task2() {
    }

    public static void task3() {
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}