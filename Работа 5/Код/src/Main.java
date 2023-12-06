// Класс, содержащий точку входа в программу
class Main {
    // Метод, запускающий программу
    public static void main(String[] args) {
        // Создаем новое приложение для мониторинга погоды
        WeatherApp app = new WeatherApp();

        // Создаем новых пользователей
        // Создаем новых пользователей
        User alice = new User("Алиса");
        User bob = new User("Боб");
        User charlie = new User("Чарли");

// Создаем новые объекты погоды для разных регионов
        Weather weather1 = new Weather("Москва", -5.0, 80.0, 750.0, 10.0);
        Weather weather2 = new Weather("Париж", 10.0, 60.0, 760.0, 0.0);
        Weather weather3 = new Weather("Нью-Йорк", 5.0, 70.0, 770.0, 5.0);

// Добавляем регионы и их погодные условия в приложение
        app.addRegion(weather1);
        app.addRegion(weather2);
        app.addRegion(weather3);

// Подписываем пользователей на уведомления о погоде в разных регионах
        alice.subscribe("Москва", app);
        bob.subscribe("Париж", app);
        charlie.subscribe("Нью-Йорк", app);

// Обновляем погодные условия в регионах
        app.updateWeather("Москва", -10.0, 90.0, 740.0, 20.0);
        app.updateWeather("Париж", 15.0, 50.0, 765.0, 0.0);
        app.updateWeather("Нью-Йорк", 10.0, 65.0, 775.0, 0.0);
    }
}