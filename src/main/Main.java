package main;

public class Main {
    public static void main(String[] args) {
        // Task 1: Создание одного товара
        Product product = new Product("Смартфон X10", "15.05.2023", "TechCorp",
                "Китай", 49999.99, false);
        System.out.println("Task 1:");
        System.out.println(product);

        // Task 2: Массив из 5 товаров
        System.out.println("\nTask 2:");
        Product[] products = new Product[5];
        products[0] = new Product("Телевизор QLED", "15.03.2024", "Samsung", "Южная Корея", 89999, false);
        products[1] = new Product("Ноутбук ProBook", "10.01.2024", "HP", "США", 65999, true);
        products[2] = new Product("Наушники TWS", "20.11.2023", "Xiaomi", "Китай", 2999, false);
        products[3] = new Product("Фотоаппарат D3500", "05.05.2023", "Nikon", "Япония", 32999, false);
        products[4] = new Product("Планшет Tab S7", "01.02.2025", "Samsung", "Вьетнам", 55999, true);

        for (int i = 0; i < products.length; i++) {
            System.out.println("Товар " + (i + 1) + ":\n" + products[i] + "\n");
        }

        // Task 3: Работа с парком аттракционов
        System.out.println("Task 3:");
        Park park = new Park("Развлекательный центр");
        park.addAttraction("Колесо обозрения", "10:00 - 23:00", 500);
        park.addAttraction("Американские горки", "11:00 - 20:00", 800);
        park.addAttraction("Дом с привидениями", "12:00 - 23:00", 650);

        System.out.println("Аттракционы в парке " + park.getName() + ":");
        park.listAttractions();
    }
}