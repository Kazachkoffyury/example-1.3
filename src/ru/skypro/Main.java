package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //task1
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println(" Установите приложение на IOS");
        } else if (clientOs == 1) {
            System.out.println("Установите приложение на Android");
        }
        //task 2
        int clientDeviceYear = 2013;
        if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения на IOS по ссылке:");
        } else if (clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println("Установите версию приложения на IOS по ссылке :");
        }

        if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения на Android по ссылке:");
        } else if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Установите версию приложения на Android по ссылке :");
        }

        //task 3

        int year = 2021;
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println("Год  является не високосным! ");
        } else {
            System.out.println("Год  является  високосным!");
        }

        //task 4

        int deliveryDistance = 95;
        int deliveryTime = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет " + deliveryTime + "дней");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Доставка займет " + deliveryTime + "дней");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Срок доставки займет " + deliveryTime + " дней");


        }

        // task 5

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("зима");
                break;
            case 3:
                System.out.println("весна");
                break;
            case 4:
                System.out.println("весна");
                break;
            case 5:
                System.out.println("весна");
                break;
            case 6:
                System.out.println("лето");
                break;
            case 7:
                System.out.println("лето");
                break;
            case 8:
                System.out.println("лето");
                break;
            case 9:
                System.out.println("осень");
                break;
            case 10:
                System.out.println("осень");
                break;
            case 11:
                System.out.println("зима");
            case 12:
                System.out.println("зима");
                break;
            default:
                System.out.println("такого месяца не существует!");

        }

    }
}
