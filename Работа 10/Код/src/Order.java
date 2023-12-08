import java.util.ArrayList;
import java.util.List;

// Класс, представляющий заказ клиента
class Order {
    private List<Dish> dishes; // Список блюд в заказе
    private double total; // Общая сумма заказа

    public Order() {
        dishes = new ArrayList<>();
        total = 0;
    }

    // Метод для добавления блюда в заказ
    public void addDish(Dish dish) {
        dishes.add(dish);
        total += dish.getPrice();
    }

    // Метод для удаления блюда из заказа
    public void removeDish(Dish dish) {
        dishes.remove(dish);
        total -= dish.getPrice();
    }

    // Метод для получения общей суммы заказа
    public double getTotal() {
        return total;
    }

    // Метод для вывода заказа на экран
    public void showOrder() {
        System.out.println("Ваш заказ:");
        for (Dish dish : dishes) {
            System.out.println(dish);
        }
        System.out.println("Итого: " + total + " руб.");
    }
}
