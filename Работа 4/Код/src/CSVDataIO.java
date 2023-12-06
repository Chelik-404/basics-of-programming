// Класс для чтения и записи данных в формате CSV
class CSVDataIO implements DataIO {
    // Метод для чтения данных из файла CSV
    public void readData(String fileName) {
        // Логика для чтения данных из файла CSV
        System.out.println("Чтение данных из файла CSV: " + fileName);
    }

    // Метод для записи данных в файл CSV
    public void writeData(String fileName, String data) {
        // Логика для записи данных в файл CSV
        System.out.println("Запись данных в файл CSV: " + fileName);
    }
}
