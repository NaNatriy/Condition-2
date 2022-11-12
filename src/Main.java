public class Main {
    public static void main(String[] args) {

        //Задача 1 и 2
        System.out.println("Решение задачи 1 и 2");
        //0 — iOS, 1 — Android
        int clientOS = 0;
        int clientDeviceYear = 2015;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
        }

        //Задача 3
        System.out.println("Решение задачи 3");
        int year = 2020;
        boolean LeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (LeapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        //Задача 4
        System.out.println("Решение задачи 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
                int deliveryDay = 1;
                System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                int deliveryDay = 2;
                System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                int deliveryDay = 3;
                System.out.println("Потребуется дней: " + deliveryDay);
        } else {
                System.out.println("Свыше 100 км доставки нет.");
        }

        //Задача 5
        System.out.println("Решение задачи 5");
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + " месяц январь принадлежит к сезону зима");
                break;
            case 2:
                System.out.println(monthNumber + " месяц февраль принадлежит к сезону зима");
                break;
            case 3:
                System.out.println(monthNumber + " месяц март принадлежит к сезону зима");
                break;
            case 4:
                System.out.println(monthNumber + " месяц апрель принадлежит к сезону зима");
                break;
            case 5:
                System.out.println(monthNumber + " месяц май принадлежит к сезону зима");
                break;
            case 6:
                System.out.println(monthNumber + " месяц июнь принадлежит к сезону зима");
                break;
            case 7:
                System.out.println(monthNumber + " месяц июль принадлежит к сезону зима");
                break;
            case 8:
                System.out.println(monthNumber + " месяц август принадлежит к сезону зима");
                break;
            case 9:
                System.out.println(monthNumber + " месяц сентябрь принадлежит к сезону зима");
                break;
            case 10:
                System.out.println(monthNumber + " месяц октябрь принадлежит к сезону зима");
                break;
            case 11:
                System.out.println(monthNumber + " месяц ноябрь принадлежит к сезону зима");
                break;
            case 12:
                System.out.println(monthNumber + " месяц декабрь принадлежит к сезону зима");
                break;
            default:
                System.out.println("В году только 12 месяцев!");
        }
    }
}