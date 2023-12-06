// Класс, представляющий пользователя приложения для мониторинга погоды
class User {
    // Поле для хранения имени пользователя
    private String name;

    // Конструктор для создания нового пользователя с заданным именем
    public User(String name) {
        this.name = name;
    }

    // Геттер и сеттер для доступа и изменения имени пользователя
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Метод для подписки на уведомления о изменении погодных условий в заданном регионе
    public void subscribe(String region, WeatherApp app) {
        // Добавляем пользователя в список подписчиков приложения для данного региона
        app.addSubscriber(region, this);
        // Выводим сообщение о подписке в консоль
        System.out.println("Пользователь "+this.name + " подписался на уведомления о погоде в регионе " + region);
    }

    // Метод для получения уведомления о изменении погодных условий в заданном регионе
    public void notify(Weather weather) {
        // Выводим сообщение об уведомлении в консоль
        System.out.println(this.name + " получил уведомление о погоде в регионе " + weather.getRegion());
        // Выводим информацию о погоде в консоль
        weather.printWeather();
    }
}
