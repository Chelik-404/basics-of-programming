// Абстрактный класс для карты мира
abstract class WorldMap implements Cloneable {
    // Метод для генерации карты
    abstract void generate();

    // Метод для клонирования карты
    public WorldMap clone() {
        WorldMap cloned = null;
        try {
            cloned = (WorldMap) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
