// Класс, демонстрирующий работу фасада
class Main {
    public static void main(String[] args) {
        // Создаем фасад для системы управления рестораном
        RestaurantFacade facade = new RestaurantFacade();
        // Просматриваем меню ресторана
        facade.viewMenu();
        // Добавляем блюда в заказ
        facade.addDishToOrder(1);
        facade.addDishToOrder(3);
        facade.addDishToOrder(4);
        // Просматриваем заказ
        facade.viewOrder();
        // Удаляем блюдо из заказа
        facade.removeDishFromOrder(4);
        // Просматриваем заказ
        facade.viewOrder();
        // Оплачиваем заказ
        facade.payOrder();
    }
}
