public class Main {
    public static void task1() {
        System.out.println("Task3");

        short year = 2021; //ввод номера года

        boolean isLeapYear = ((year / 400 * 400 == year && year > 1584)
                || (year / 4 * 4 == year && !(year / 100 * 100 == year) && year > 1584));
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