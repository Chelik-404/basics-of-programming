// Пример использования контроллера игры
public class Main {
    public static void main(String[] args) {
        GameController gameController1 = GameController.getInstance();
        GameController gameController2 = GameController.getInstance();

        gameController1.startGame("Сессия 1");
        gameController2.createGameObject(1, "Объект 1");
    }
}
