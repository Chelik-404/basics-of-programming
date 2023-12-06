// Импортировать необходимые классы и пакеты из библиотеки Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Класс CitySimulator, который наследует от класса JFrame и реализует интерфейс ActionListener
class CitySimulator extends JFrame implements ActionListener {
    // Константы для определения размеров окна и компонентов
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int GAP = 10;
    private static final int TEXT_SIZE = 20;
    private static final int BUTTON_SIZE = 40;
    // Переменные для хранения ссылок на компоненты GUI
    private JLabel labelType;
    private JLabel labelAddress;
    private JLabel labelArea;
    private JLabel labelParameter;
    private JComboBox<String> comboType;
    private JTextField textAddress;
    private JTextField textArea;
    private JTextField textParameter;
    private JButton buttonAdd;
    private JButton buttonClear;
    private JTextArea textInfo;
    private JScrollPane scrollInfo;
    // Переменная для хранения ссылки на объект класса City
    private City city;
    // Конструктор, который принимает название окна и создает GUI
    public CitySimulator(String title) {
        // Вызвать конструктор суперкласса и передать название окна
        super(title);
        // Установить размер, расположение и закрытие окна
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Установить менеджер компоновки для окна
        setLayout(new BorderLayout(GAP, GAP));
        // Создать панель для ввода данных о здании
        JPanel panelInput = new JPanel();
        panelInput.setLayout(new GridLayout(4, 2, GAP, GAP));
        // Создать и добавить на панель метки и поля для ввода типа, адреса, площади и дополнительного параметра здания
        labelType = new JLabel("Тип здания:");
        labelType.setFont(new Font("Arial", Font.BOLD, TEXT_SIZE));
        panelInput.add(labelType);
        comboType = new JComboBox<String>(new String[] {"Жилой", "Коммерческий", "Промышленный"});
        comboType.setFont(new Font("Arial", Font.PLAIN, TEXT_SIZE));
        panelInput.add(comboType);
        labelAddress = new JLabel("Адрес здания:");
        labelAddress.setFont(new Font("Arial", Font.BOLD, TEXT_SIZE));
        panelInput.add(labelAddress);
        textAddress = new JTextField();
        textAddress.setFont(new Font("Arial", Font.PLAIN, TEXT_SIZE));
        panelInput.add(textAddress);
        labelArea = new JLabel("Площадь здания (кв.м):");
        labelArea.setFont(new Font("Arial", Font.BOLD, TEXT_SIZE));
        panelInput.add(labelArea);
        textArea = new JTextField();
        textArea.setFont(new Font("Arial", Font.PLAIN, TEXT_SIZE));
        panelInput.add(textArea);
        labelParameter = new JLabel("Дополнительный параметр:");
        labelParameter.setFont(new Font("Arial", Font.BOLD, TEXT_SIZE));
        panelInput.add(labelParameter);
        textParameter = new JTextField();
        textParameter.setFont(new Font("Arial", Font.PLAIN, TEXT_SIZE));
        panelInput.add(textParameter);
        // Добавить панель ввода в верхнюю часть окна
        add(panelInput, BorderLayout.NORTH);
        // Создать панель для кнопок добавления и очистки зданий
        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(1, 2, GAP, GAP));
        // Создать и добавить на панель кнопки добавления и очистки зданий
        buttonAdd = new JButton("Добавить здание");
        buttonAdd.setFont(new Font("Arial", Font.BOLD, BUTTON_SIZE));
        buttonAdd.addActionListener(this);
        panelButtons.add(buttonAdd);
        buttonClear = new JButton("Очистить город");
        buttonClear.setFont(new Font("Arial", Font.BOLD, BUTTON_SIZE));
        buttonClear.addActionListener(this);
        panelButtons.add(buttonClear);
        // Добавить панель кнопок в нижнюю часть окна
        add(panelButtons, BorderLayout.SOUTH);
        // Создать текстовую область для вывода информации о городе
        textInfo = new JTextArea();
        textInfo.setFont(new Font("Arial", Font.PLAIN, TEXT_SIZE));
        textInfo.setEditable(false);
        // Создать прокручиваемую панель для текстовой области
        scrollInfo = new JScrollPane(textInfo);
        // Добавить прокручиваемую панель в центральную часть окна
        add(scrollInfo, BorderLayout.CENTER);
        // Создать объект класса City
        city = new City();
        // Сделать окно видимым
        setVisible(true);
    }
    // Метод, который обрабатывает события от кнопок
    public void actionPerformed(ActionEvent e) {
        // Получить источник события
        Object source = e.getSource();
        // Если источник события - кнопка добавления здания
        if (source == buttonAdd) {
            // Получить данные о здании из полей ввода
            String type = (String) comboType.getSelectedItem();
            String address = textAddress.getText();
            double area = Double.parseDouble(textArea.getText());
            int parameter = Integer.parseInt(textParameter.getText());
            // Получить единственный экземпляр класса BuildingFactory
            BuildingFactory buildingFactory = BuildingFactory.getInstance();
            // Создать и добавить здание в город с помощью одиночной фабрики
            city.addBuilding(buildingFactory.createBuilding(type, address, area, parameter));
            // Очистить поля ввода
            textAddress.setText("");
            textArea.setText("");
            textParameter.setText("");
            // Вывести информацию о городе в текстовую область
            displayCityInfo();
        }
        // Если источник события - кнопка очистки города
        else if (source == buttonClear) {
            // Создать новый объект класса City
            city = new City();
            // Очистить текстовую область
            textInfo.setText("");
        }
    }
    // Метод, который выводит информацию о городе в текстовую область
    public void displayCityInfo() {
        // Очистить текстовую область
        textInfo.setText("");
        // Вывести количество зданий в городе
        textInfo.append("В городе " + city.getBuildings().size() + " зданий\n");
        // Вывести общую площадь всех зданий в городе
        textInfo.append("Общая площадь всех зданий: " + city.getTotalArea() + " кв.м\n");
        // Вывести количество зданий каждого типа в городе
        textInfo.append("Количество жилых зданий: " + city.countBuildingsByType("Жилой") + "\n");
        textInfo.append("Количество коммерческих зданий: " + city.countBuildingsByType("Коммерческий") + "\n");
        textInfo.append("Количество промышленных зданий: " + city.countBuildingsByType("Промышленный") + "\n");
        // Вывести данные о каждом здании в городе
        for (Building building : city.getBuildings()) {
            textInfo.append("--------------------------------------------------\n");
            textInfo.append("Тип здания: " + building.getType() + "\n");
            textInfo.append("Адрес здания: " + building.getAddress() + "\n");
            textInfo.append("Площадь здания: " + building.getArea() + " кв.м\n");
            // В зависимости от типа здания, вывести дополнительный параметр
            if (building instanceof ResidentialBuilding) {
                textInfo.append("Количество жильцов: " + ((ResidentialBuilding) building).getResidents() + "\n");
            } else if (building instanceof CommercialBuilding) {
                textInfo.append("Количество магазинов: " + ((CommercialBuilding) building).getShops() + "\n");
            } else if (building instanceof IndustrialBuilding) {
                textInfo.append("Количество производственных цехов: " + ((IndustrialBuilding) building).getFactories() + "\n");
            }
        }
    }
}
