package main;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isReserved;

    public Product(String name, String productionDate, String manufacturer,
                   String countryOfOrigin, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }

    public String toString() {
        return "Название: " + name + "\n" +
                "Дата производства: " + productionDate + "\n" +
                "Производитель: " + manufacturer + "\n" +
                "Страна происхождения: " + countryOfOrigin + "\n" +
                "Цена: " + price + " руб.\n" +
                "Состояние бронирования: " + (isReserved ? "Забронирован" : "Свободен");
    }
}