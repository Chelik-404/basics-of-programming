// Класс для представления музыкального трека
class Track extends MusicElement {
    // Название трека
    private String name;
    // Длительность трека в секундах
    private int duration;

    // Конструктор трека
    public Track(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    // Метод для воспроизведения трека
    @Override
    void play() {
        System.out.println("Playing track: " + name + " (" + duration + " seconds)");
    }
}
