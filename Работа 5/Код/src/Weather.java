// Класс, представляющий погодные условия в определенном регионе
class Weather {
    // Поля для хранения названия региона, температуры, влажности, давления и осадков
    private String region;
    private double temperature;
    private double humidity;
    private double pressure;
    private double precipitation;

    // Конструктор для создания нового объекта погоды с заданными параметрами
    public Weather(String region, double temperature, double humidity, double pressure, double precipitation) {
        this.region = region;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.precipitation = precipitation;
    }

    // Геттеры и сеттеры для доступа и изменения полей погоды
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    // Метод для вывода информации о погоде в консоль
    public void printWeather() {
        System.out.println("Погода в регионе " + region + ":");
        System.out.println("Температура: " + temperature + " °C");
        System.out.println("Влажность: " + humidity + " %");
        System.out.println("Давление: " + pressure + " мм рт. ст.");
        System.out.println("Осадки: " + precipitation + " мм");
    }
}
