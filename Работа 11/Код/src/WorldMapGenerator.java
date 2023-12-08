// Класс для генератора карт мира
class WorldMapGenerator {
    // Поле для хранения прототипа карты
    private WorldMap prototype;

    // Конструктор с параметром прототипа
    public WorldMapGenerator(WorldMap prototype) {
        this.prototype = prototype;
    }

    // Метод для генерации новой карты на основе прототипа
    public WorldMap generateNewMap() {
        return prototype.clone();
    }
}
