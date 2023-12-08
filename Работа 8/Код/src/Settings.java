import java.io.Serializable;

// Класс для представления настроек
class Settings implements Serializable {
    private int volume; // громкость звука
    private int brightness; // яркость экрана
    private String language; // язык интерфейса

    // Конструктор класса Settings
    public Settings(int volume, int brightness, String language) {
        this.volume = volume;
        this.brightness = brightness;
        this.language = language;
    }

    // Геттер и сеттер для громкости звука
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Геттер и сеттер для яркости экрана
    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    // Геттер и сеттер для языка интерфейса
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
