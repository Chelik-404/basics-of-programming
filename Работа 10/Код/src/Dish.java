// Класс, представляющий блюдо
class Dish {
    private String name; // Название блюда
    private double price; // Цена блюда

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Метод для получения названия блюда
    public String getName() {
        return name;
    }

    // Метод для получения цены блюда
    public double getPrice() {
        return price;
    }

    // Метод для вывода блюда на экран
    public String toString() {
        return name + " - " + price + " руб.";
    }
}
