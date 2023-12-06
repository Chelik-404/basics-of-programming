// Класс для тестирования системы
class Main {
    public static void main(String[] args) {
        // Создание объектов для чтения и записи данных в разных форматах
        DataIO csvDataIO = new CSVDataIO();
        DataIO jsonDataIO = new JSONDataIO();
        DataIO xmlDataIO = new XMLDataIO();

        // Создание адаптеров для преобразования интерфейса DataIO в другой интерфейс
        DataIO csvAdapter = new DataIOAdapter(csvDataIO);
        DataIO jsonAdapter = new DataIOAdapter(jsonDataIO);
        DataIO xmlAdapter = new DataIOAdapter(xmlDataIO);

        // Тестирование чтения и записи данных в разных форматах с помощью адаптеров
        csvAdapter.readData("data.csv");
        csvAdapter.writeData("data.csv", "some data");
        jsonAdapter.readData("data.json");
        jsonAdapter.writeData("data.json", "some data");
        xmlAdapter.readData("data.xml");
        xmlAdapter.writeData("data.xml", "some data");
    }
}