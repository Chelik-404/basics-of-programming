// Класс, представляющий фасад для системы управления рестораном
class RestaurantFacade {
    private Menu menu; // Меню ресторана
    private Order order; // Заказ клиента
    private PaymentSystem paymentSystem; // Система оплаты

    public RestaurantFacade() {
        menu = new Menu();
        order = new Order();
        paymentSystem = new PaymentSystem();
        // Заполняем меню ресторана
        menu.addDish(new Dish("Салат Цезарь", 250));
        menu.addDish(new Dish("Суп-пюре из грибов", 150));
        menu.addDish(new Dish("Стейк из говядины", 450));
        menu.addDish(new Dish("Тирамису", 200));
    }

    // Метод для просмотра меню ресторана
    public void viewMenu() {
        menu.showMenu();
    }

    // Метод для добавления блюда в заказ по индексу
    public void addDishToOrder(int index) {
        Dish dish = menu.getDish(index - 1);
        order.addDish(dish);
        System.out.println("Вы добавили в заказ: " + dish);
    }

    // Метод для удаления блюда из заказа по индексу
    public void removeDishFromOrder(int index) {
        Dish dish = menu.getDish(index - 1);
        order.removeDish(dish);
        System.out.println("Вы удалили из заказа: " + dish);
    }

    // Метод для просмотра заказа
    public void viewOrder() {
        order.showOrder();
    }

    // Метод для оплаты заказа
    public void payOrder() {
        paymentSystem.pay(order);
        System.out.println("Спасибо за посещение нашего ресторана!");
    }
}
