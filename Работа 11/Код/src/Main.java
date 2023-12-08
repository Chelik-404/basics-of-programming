// Класс с точкой входа в программу
public class Main {
    public static void main(String[] args) {
        // Создаем прототип карты с островами
        WorldMap islandMap = new IslandMap();
        // Создаем генератор карт мира с прототипом карты с островами
        WorldMapGenerator islandMapGenerator = new WorldMapGenerator(islandMap);
        // Генерируем три новые карты с островами
        WorldMap islandMap1 = islandMapGenerator.generateNewMap();
        WorldMap islandMap2 = islandMapGenerator.generateNewMap();
        WorldMap islandMap3 = islandMapGenerator.generateNewMap();
        // Выводим результаты генерации
        islandMap1.generate();
        islandMap2.generate();
        islandMap3.generate();

        // Создаем прототип карты с горами
        WorldMap mountainMap = new MountainMap();
        // Создаем генератор карт мира с прототипом карты с горами
        WorldMapGenerator mountainMapGenerator = new WorldMapGenerator(mountainMap);
        // Генерируем две новые карты с горами
        WorldMap mountainMap1 = mountainMapGenerator.generateNewMap();
        WorldMap mountainMap2 = mountainMapGenerator.generateNewMap();
        // Выводим результаты генерации
        mountainMap1.generate();
        mountainMap2.generate();
    }
}
