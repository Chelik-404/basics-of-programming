import java.util.ArrayList;
import java.util.HashMap;

// Класс, представляющий приложение для мониторинга погоды
class WeatherApp {
    // Поле для хранения карты, связывающей регионы с их погодными условиями
    private HashMap<String, Weather> weatherMap;

    // Поле для хранения карты, связывающей регионы с их списками подписчиков
    private HashMap<String, ArrayList<User>> subscribersMap;

    // Конструктор для создания нового приложения для мониторинга погоды
    public WeatherApp() {
        // Инициализируем карты пустыми
        weatherMap = new HashMap<String, Weather>();
        subscribersMap = new HashMap<String, ArrayList<User>>();
    }

    // Метод для добавления нового региона и его погодных условий в приложение
    public void addRegion(Weather weather) {
        // Добавляем регион и его погоду в карту погоды
        weatherMap.put(weather.getRegion(), weather);
        // Создаем пустой список подписчиков для данного региона
        subscribersMap.put(weather.getRegion(), new ArrayList<User>());
        // Выводим сообщение о добавлении региона в консоль
        System.out.println("Регион " + weather.getRegion() + " добавлен в приложение");
    }

    // Метод для добавления нового подписчика на уведомления о погоде в заданном регионе
    public void addSubscriber(String region, User user) {
        // Проверяем, существует ли такой регион в приложении
        if (weatherMap.containsKey(region)) {
            // Добавляем пользователя в список подписчиков для данного региона
            subscribersMap.get(region).add(user);
        } else {
            // Выводим сообщение об ошибке в консоль
            System.out.println("Регион " + region + " не найден в приложении");
        }
    }

    // Метод для обновления погодных условий в заданном регионе
    public void updateWeather(String region, double temperature, double humidity, double pressure, double precipitation) {
        // Проверяем, существует ли такой регион в приложении
        if (weatherMap.containsKey(region)) {
            // Получаем текущую погоду в регионе
            Weather currentWeather = weatherMap.get(region);
            // Создаем новый объект погоды с обновленными параметрами
            Weather newWeather = new Weather(region, temperature, humidity, pressure, precipitation);
            // Заменяем текущую погоду на новую в карте погоды
            weatherMap.put(region, newWeather);
            // Выводим сообщение об обновлении погоды в консоль
            System.out.println("Погода в регионе " + region + " обновлена");
            // Проверяем, изменились ли погодные условия в регионе
            if (!currentWeather.equals(newWeather)) {
                // Отправляем уведомления всем подписчикам о регионе
                notifySubscribers(region, newWeather);
            }
        } else {
            // Выводим сообщение об ошибке в консоль
            System.out.println("Регион " + region + " не найден в приложении");
        }
    }

    // Метод для отправки уведомлений всем подписчикам о погоде в заданном регионе
    public void notifySubscribers(String region, Weather weather) {
        // Проверяем, существует ли такой регион в приложении
        if (weatherMap.containsKey(region)) {
            // Получаем список подписчиков для данного региона
            ArrayList<User> subscribers = subscribersMap.get(region);
            // Перебираем всех подписчиков в списке
            for (User user : subscribers) {
                // Отправляем уведомление каждому подписчику о погоде в регионе
                user.notify(weather);
            }
        } else {
            // Выводим сообщение об ошибке в консоль
            System.out.println("Регион " + region + " не найден в приложении");
        }
    }
}
