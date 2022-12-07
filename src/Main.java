public class Main {
    public static void main(String[] args) {


    }
     public static void task1(){
        System.out.println("Задача 1: ");
        boolean clientOsAndroid = true;

        if(clientOsAndroid == true){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
    public static void task2(){
        System.out.println("Задача 2: ");
        boolean clientOsAndroid = true;
        int clientDeviceYear = 2015;

        if (clientOsAndroid == true){
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
    public static void task3(){
        System.out.println("Задача 3: ");
        int year = 2022;
        switch (year){
            case 2022:
                System.out.println("Год не високосный");
                break;
            case 2023:
                System.out.println("Год не високосный");
                break;
            case 2024:
                System.out.println("Год високосный");
                break;
            default:
                System.out.println(" ");
        }
    }
    public static void task4(){
        System.out.println("Задача 4: ");
        int deliveryDistance = 95;
        int deliveryTime = 1;

        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 || deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + deliveryTime++);
        } else if (deliveryDistance >= 60 || deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + deliveryTime + 2);
        }else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5(){
        System.out.println("Задача 5: ");
        int monthNumber = 12;

        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}