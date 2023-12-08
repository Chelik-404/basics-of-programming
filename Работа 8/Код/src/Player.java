import java.io.Serializable;

// Класс для представления игрока
class Player implements Serializable {
    private String name; // имя игрока
    private Settings settings; // настройки игрока

    // Конструктор класса Player
    public Player(String name, Settings settings) {
        this.name = name;
        this.settings = settings;
    }

    // Геттер и сеттер для имени игрока
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Геттер и сеттер для настроек игрока
    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}
