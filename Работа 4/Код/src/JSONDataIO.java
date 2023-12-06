// Класс для чтения и записи данных в формате JSON
class JSONDataIO implements DataIO {
    // Метод для чтения данных из файла JSON
    public void readData(String fileName) {
        // Логика для чтения данных из файла JSON
        System.out.println("Чтение данных из файла JSON: " + fileName);
    }

    // Метод для записи данных в файл JSON
    public void writeData(String fileName, String data) {
        // Логика для записи данных в файл JSON
        System.out.println("Запись данных в файл JSON: " + fileName);
    }
}
