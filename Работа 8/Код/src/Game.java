import java.io.*;

// Класс для представления игры
class Game implements Serializable {
    private String name; // название игры
    private Player player; // игрок, участвующий в игре

    // Конструктор класса Game
    public Game(String name, Player player) {
        this.name = name;
        this.player = player;
    }

    // Геттер и сеттер для названия игры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Геттер и сеттер для игрока
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    // Метод для сохранения игры в файл
    public void saveGame(String filename) {
        try {
            // Создаем поток для записи объекта в файл
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Записываем объект игры в файл
            out.writeObject(this);

            // Закрываем потоки
            out.close();
            file.close();

            System.out.println("Игра успешно сохранена в файл " + filename);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при сохранении игры: " + e);
        }
    }

    // Метод для восстановления игры из файла
    public static Game loadGame(String filename) {
        Game game = null; // переменная для хранения объекта игры
        try {
            // Создаем поток для чтения объекта из файла
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Читаем объект игры из файла
            game = (Game) in.readObject();

            // Закрываем потоки
            in.close();
            file.close();

            System.out.println("Игра успешно восстановлена из файла " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Произошла ошибка при восстановлении игры: " + e);
        }
        return game; // возвращаем объект игры
    }
}
