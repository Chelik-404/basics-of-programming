import java.util.ArrayList;
import java.util.List;

// Класс, представляющий меню ресторана
class Menu {
    private List<Dish> dishes; // Список блюд

    public Menu() {
        dishes = new ArrayList<>();
    }

    // Метод для добавления блюда в меню
    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    // Метод для получения блюда по индексу
    public Dish getDish(int index) {
        return dishes.get(index);
    }

    // Метод для вывода меню на экран
    public void showMenu() {
        System.out.println("Меню ресторана:");
        for (int i = 0; i < dishes.size(); i++) {
            System.out.println((i + 1) + ". " + dishes.get(i));
        }
    }
}
