// Класс игрового объекта
class GameObject {
    private int id;
    private String name;

    public GameObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
