import java.io.*;

// Класс для тестирования кода
class Main {
    public static void main(String[] args) {
        // Создаем объекты настроек, игрока и игры
        Settings settings = new Settings(50, 80, "Русский");
        Player player = new Player("Алексей", settings);
        Game game = new Game("Морской бой", player);

        // Сохраняем игру в файл
        game.saveGame("game.dat");

        // Изменяем настройки игрока
        player.getSettings().setVolume(30);
        player.getSettings().setBrightness(60);
        player.getSettings().setLanguage("English");

        // Восстанавливаем игру из файла
        game = Game.loadGame("game.dat");

        // Выводим информацию об игре, игроке и настройках
        System.out.println("Название игры: " + game.getName());
        System.out.println("Имя игрока: " + game.getPlayer().getName());
        System.out.println("Громкость звука: " + game.getPlayer().getSettings().getVolume());
        System.out.println("Яркость экрана: " + game.getPlayer().getSettings().getBrightness());
        System.out.println("Язык интерфейса: " + game.getPlayer().getSettings().getLanguage());
    }
}
