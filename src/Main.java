import java.time.LocalDate;

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
        System.out.println("Task2");

        int typeOS = 0;
        int clientDeviceYear = 9999;

        msgLinkToClient(typeOS, clientDeviceYear);
        System.out.println();
    }

    public static void msgLinkToClient(int operatingSystem, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String msgVersionForUse;
        if (clientDeviceYear < currentYear) {
            msgVersionForUse = "Установите облегченную версию приложения для ";
        } else if (clientDeviceYear == currentYear) {
            msgVersionForUse = "Установите обычную версию приложения для ";
        } else {
            msgVersionForUse = "Воспользуйтесь веб-версией приложения для ";
        }
        String msgTypeOfOS;
        if (operatingSystem == 0) {
            msgTypeOfOS = "iOS";
        } else if (operatingSystem == 1) {
            msgTypeOfOS = "Android";
        } else {
            msgTypeOfOS = "Вашей операционной системы";
        }
        System.out.println(msgVersionForUse + msgTypeOfOS + " по ссылке");
    }

    public static void task3() {
        System.out.println("Task 3");

        int deliveryDistance = 10;

        int deliveryDays = calcDeliveryDays(deliveryDistance);
        if (deliveryDays == -1) {
            System.out.println("Необходимо согласовать индивидуальные условия доставки по телефону горячей линии");
        } else {
            System.out.println("Доставка на расстояние в " + deliveryDistance + " км займёт " + deliveryDays + " дн.");
        }

        System.out.println();
    }

    public static int calcDeliveryDays(int deliveryDistance) {
        int deliveryDays;
        if (deliveryDistance >= 0 && deliveryDistance < 20) {
            deliveryDays = 1;
        } else if (deliveryDistance < 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
        }

        return deliveryDays;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}