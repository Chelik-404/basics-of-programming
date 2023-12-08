// Класс игровой сессии
class GameSession {
    private static GameSession instance;
    private String sessionName;

    private GameSession(String sessionName) {
        this.sessionName = sessionName;
    }

    public static GameSession getInstance(String sessionName) {
        if (instance == null) {
            instance = new GameSession(sessionName);
        }
        return instance;
    }

    public String getSessionName() {
        return sessionName;
    }
}
