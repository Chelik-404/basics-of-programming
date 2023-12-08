// Контроллер игры (Одиночка)
class GameController {
    private static GameController instance;

    private GameController() {
        // Приватный конструктор
    }

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    public void startGame(String sessionName) {
        GameSession session = GameSession.getInstance(sessionName);
        System.out.println("Игровая сессия '" + session.getSessionName() + "' начата");
    }

    public void createGameObject(int id, String name) {
        GameObject gameObject = new GameObject(id, name);
        System.out.println("Создан игровой объект: ID = " + gameObject.getId() + ", Name = " + gameObject.getName());
    }
}
