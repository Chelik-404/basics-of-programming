import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

// Класс для представления графического интерфейса для работы с данными о студентах
class GUI extends JFrame implements ActionListener {
    // Поля для хранения интерфейса, панели, кнопок, меток и таблицы
    private Interface interface1;
    private JPanel panel;
    private JButton groupButton;
    private JButton subgroupButton;
    private JButton studentButton;
    private JButton subjectButton;
    private JLabel label;
    private JTable table;

    // Конструктор для создания графического интерфейса с заданным интерфейсом
    public GUI(Interface interface1) {
        // Вызываем конструктор суперкласса с заголовком окна
        super("Информация о студентах");

        // Инициализируем поле для хранения интерфейса
        this.interface1 = interface1;

        // Устанавливаем размер и расположение окна
        setSize(1800, 600);
        setLocation(100, 100);

        // Устанавливаем действие при закрытии окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем панель для размещения компонентов
        panel = new JPanel();

        // Создаем кнопки для выбора группы, подгруппы, студента или предмета
        groupButton = new JButton("Выбрать группу");
        subgroupButton = new JButton("Выбрать подгруппу");
        studentButton = new JButton("Выбрать студента");
        subjectButton = new JButton("Выбрать предмет");

        // Добавляем слушателей к кнопкам
        groupButton.addActionListener(this);
        subgroupButton.addActionListener(this);
        studentButton.addActionListener(this);
        subjectButton.addActionListener(this);

        // Добавляем кнопки на панель
        panel.add(groupButton);
        panel.add(subgroupButton);
        panel.add(studentButton);
        panel.add(subjectButton);

        // Создаем метку для отображения сообщений
        label = new JLabel("Выберите один из вариантов");

        // Добавляем метку на панель
        panel.add(label);

        // Создаем таблицу для отображения информации
        table = new JTable();

        // Добавляем таблицу на панель
        panel.add(table);

        // Добавляем панель в окно
        add(panel);

        // Делаем окно видимым
        setVisible(true);
    }

    // Метод для обработки событий от кнопок
    public void actionPerformed(ActionEvent e) {
        // Получаем источник события
        Object source = e.getSource();

        // Если источник события - кнопка выбора группы
        if (source == groupButton) {
            // Создаем массив строк с названиями групп
            String[] groupNames = new String[interface1.getSize()];
            for (int i = 0; i < interface1.getSize(); i++) {
                groupNames[i] = interface1.getGroup(i).getName();
            }

            // Создаем диалоговое окно с выпадающим списком для выбора группы
            String groupName = (String) JOptionPane.showInputDialog(this, "Выберите группу:", "Выбор группы", JOptionPane.QUESTION_MESSAGE, null, groupNames, groupNames[0]);

            // Если пользователь выбрал группу
            if (groupName != null) {
                // Находим индекс выбранной группы
                int groupIndex = -1;
                for (int i = 0; i < interface1.getSize(); i++) {
                    if (interface1.getGroup(i).getName().equals(groupName)) {
                        groupIndex = i;
                        break;
                    }
                }
                // Получаем объект класса JTableHeader, связанный с таблицей
                JTableHeader header = table.getTableHeader();

                if (header != null) {
                    panel.remove(header);
                }
                // Удаляем предыдущую таблицу с панели, если она существует
                if (table != null) {
                    panel.remove(table);
                }
                // Создаем двумерный массив объектов с данными о студентах в группе
                Object[][] data = new Object[12][11];
                for (int i = 0; i < 6; i++) {
                    // Заполняем первый столбец с именами и фамилиями студентов из первой подгруппы
                    data[i][0] = interface1.getGroup(groupIndex).getSubgroup(0).getStudent(i).getFirstName() + " " + interface1.getGroup(groupIndex).getSubgroup(0).getStudent(i).getLastName();
                    // Заполняем остальные столбцы с оценками студентов из первой подгруппы
                    for (int j = 1; j < 10; j++) {
                        data[i][j] = interface1.getGroup(groupIndex).getSubgroup(0).getStudent(i).getGrade(j - 1) + "%";
                    }
                    // Заполняем последний столбец с номером подгруппы
                    data[i][10] = "Подгруппа 1";
                }
                for (int i = 6; i < 12; i++) {
                    // Заполняем первый столбец с именами и фамилиями студентов из второй подгруппы
                    data[i][0] = interface1.getGroup(groupIndex).getSubgroup(1).getStudent(i - 6).getFirstName() + " " + interface1.getGroup(groupIndex).getSubgroup(1).getStudent(i - 6).getLastName();
                    // Заполняем остальные столбцы с оценками студентов из второй подгруппы
                    for (int j = 1; j < 10; j++) {
                        data[i][j] = interface1.getGroup(groupIndex).getSubgroup(1).getStudent(i - 6).getGrade(j - 1) + "%";
                    }
                    // Заполняем последний столбец с номером подгруппы
                    data[i][10] = "Подгруппа 2";
                }


                // Создаем массив строк с названиями столбцов таблицы
                String[] columnNames = {"Имя и фамилия", "База данных", "Инф системы и сети", "Методы проектирования", "Надежность инф систем", "Физ-ра", "Программирование", "ОХТ", "Продукты питания", "Финансовая культура", "Подгруппа"};

                // Создаем новую таблицу с данными о студентах в группе
                table = new JTable(data, columnNames);

                // Получаем объект класса JTableHeader, связанный с таблицей
                JTableHeader groupheader = table.getTableHeader();

// Добавляем объект JTableHeader на панель
                panel.add(groupheader);

// Добавляем таблицу на панель
                panel.add(table);

                // Устанавливаем ширину столбцов таблицы
                table.getColumnModel().getColumn(0).setPreferredWidth(200);
                for (int i = 1; i < 11; i++) {
                    table.getColumnModel().getColumn(i).setPreferredWidth(150);
                }

                // Добавляем таблицу на панель
                panel.add(table);

                // Обновляем панель
                panel.revalidate();
                panel.repaint();

                // Изменяем метку с сообщением
                label.setText("Вы выбрали группу " + groupName);

            }
        }

        // Если источник события - кнопка выбора подгруппы
        if (source == subgroupButton) {
            // Получаем объект класса JTableHeader, связанный с таблицей
            JTableHeader header = table.getTableHeader();

            if (header != null) {
                panel.remove(header);
            }
            // Создаем массив строк с названиями групп
            String[] groupNames = new String[interface1.getSize()];
            for (int i = 0; i < interface1.getSize(); i++) {
                groupNames[i] = interface1.getGroup(i).getName();
            }

            // Создаем диалоговое окно с выпадающим списком для выбора группы
            String groupName = (String) JOptionPane.showInputDialog(this, "Выберите группу:", "Выбор группы", JOptionPane.QUESTION_MESSAGE, null, groupNames, groupNames[0]);

            // Если пользователь выбрал группу
            if (groupName != null) {
                // Находим индекс выбранной группы
                int groupIndex = -1;
                for (int i = 0; i < interface1.getSize(); i++) {
                    if (interface1.getGroup(i).getName().equals(groupName)) {
                        groupIndex = i;
                        break;
                    }
                }

                // Создаем массив строк с номерами подгрупп
                String[] subgroupNumbers = {"1", "2"};

                // Создаем диалоговое окно с выпадающим списком для выбора подгруппы
                String subgroupNumber = (String) JOptionPane.showInputDialog(this, "Выберите подгруппу:", "Выбор подгруппы", JOptionPane.QUESTION_MESSAGE, null, subgroupNumbers, subgroupNumbers[0]);

                // Если пользователь выбрал подгруппу
                if (subgroupNumber != null) {
                    // Находим индекс выбранной подгруппы
                    int subgroupIndex = Integer.parseInt(subgroupNumber) - 1;

                    // Удаляем предыдущую таблицу с панели, если она существует
                    if (table != null) {
                        panel.remove(table);
                    }
                    // Создаем двумерный массив объектов с данными о студентах в подгруппе
                    Object[][] data = new Object[6][10];
                    for (int i = 0; i < 6; i++) {
                        // Заполняем первый столбец с именами и фамилиями студентов
                        data[i][0] = interface1.getGroup(groupIndex).getSubgroup(subgroupIndex).getStudent(i).getFirstName() + " " + interface1.getGroup(groupIndex).getSubgroup(subgroupIndex).getStudent(i).getLastName();
                        // Заполняем остальные столбцы с оценками студентов
                        for (int j = 1; j < 10; j++) {
                            data[i][j] = interface1.getGroup(groupIndex).getSubgroup(subgroupIndex).getStudent(i).getGrade(j - 1) + "%";
                        }
                    }

                    // Создаем массив строк с названиями столбцов таблицы
                    String[] columnNames = {"Имя и фамилия", "База данных", "Инф системы и сети", "Методы проектирования", "Надежность инф систем", "Физ-ра", "Программирование", "ОХТ", "Продукты питания", "Финансовая культура"};

                    // Создаем новую таблицу с данными о студентах в подгруппе
                    table = new JTable(data, columnNames);

                    // Получаем объект класса JTableHeader, связанный с таблицей
                    JTableHeader subgroupheader = table.getTableHeader();

// Добавляем объект JTableHeader на панель
                    panel.add(subgroupheader);

// Добавляем таблицу на панель
                    panel.add(table);


                    // Устанавливаем ширину столбцов таблицы
                    table.getColumnModel().getColumn(0).setPreferredWidth(200);
                    for (int i = 1; i < 10; i++) {
                        table.getColumnModel().getColumn(i).setPreferredWidth(150);
                    }

                    // Добавляем таблицу на панель
                    panel.add(table);

                    // Обновляем панель
                    panel.revalidate();
                    panel.repaint();

                    // Изменяем метку с сообщением
                    label.setText("Вы выбрали подгруппу " + subgroupNumber + " в группе " + groupName);
                }
            }
        }

        // Если источник события - кнопка выбора студента
        if (source == studentButton) {
            // Создаем массив строк с названиями групп
            String[] groupNames = new String[interface1.getSize()];
            for (int i = 0; i < interface1.getSize(); i++) {
                groupNames[i] = interface1.getGroup(i).getName();
            }

            // Создаем диалоговое окно с выпадающим списком для выбора группы
            String groupName = (String) JOptionPane.showInputDialog(this, "Выберите группу:", "Выбор группы", JOptionPane.QUESTION_MESSAGE, null, groupNames, groupNames[0]);

            // Если пользователь выбрал группу
            if (groupName != null) {
                // Находим индекс выбранной группы
                int groupIndex = -1;
                for (int i = 0; i < interface1.getSize(); i++) {
                    if (interface1.getGroup(i).getName().equals(groupName)) {
                        groupIndex = i;
                        break;
                    }
                }

                // Создаем массив строк с номерами подгрупп
                String[] subgroupNumbers = {"1", "2"};

                // Создаем диалоговое окно с выпадающим списком для выбора подгруппы
                String subgroupNumber = (String) JOptionPane.showInputDialog(this, "Выберите подгруппу:", "Выбор подгруппы", JOptionPane.QUESTION_MESSAGE, null, subgroupNumbers, subgroupNumbers[0]);

                // Если пользователь выбрал подгруппу
                if (subgroupNumber != null) {
                    // Находим индекс выбранной подгруппы
                    int subgroupIndex = Integer.parseInt(subgroupNumber) - 1;

                    // Создаем массив строк с именами и фамилиями студентов в подгруппе
                    String[] studentNames = new String[6];
                    for (int i = 0; i < 6; i++) {
                        studentNames[i] = interface1.getGroup(groupIndex).getSubgroup(subgroupIndex).getStudent(i).getFirstName() + " " + interface1.getGroup(groupIndex).getSubgroup(subgroupIndex).getStudent(i).getLastName();
                    }

                    // Создаем диалоговое окно с выпадающим списком для выбора студента
                    String studentName = (String) JOptionPane.showInputDialog(this, "Выберите студента:", "Выбор студента", JOptionPane.QUESTION_MESSAGE, null, studentNames, studentNames[0]);

                    // Если пользователь выбрал студента
                    if (studentName != null) {
                        // Находим индекс выбранного студента
                        int studentIndex = -1;
                        for (int i = 0; i < 6; i++) {
                            if (interface1.getGroup(groupIndex).getSubgroup(subgroupIndex).getStudent(i).getFirstName().equals(studentName.split(" ")[0]) && interface1.getGroup(groupIndex).getSubgroup(subgroupIndex).getStudent(i).getLastName().equals(studentName.split(" ")[1])) {
                                studentIndex = i;
                                break;
                            }
                        }
                        // Получаем объект класса JTableHeader, связанный с таблицей
                        JTableHeader header = table.getTableHeader();

                        if (header != null) {
                            panel.remove(header);
                        }
                        // Удаляем предыдущую таблицу с панели, если она существует
                        if (table != null) {
                            panel.remove(table);
                        }
                        // Создаем двумерный массив объектов с данными о студенте
                        Object[][] data = new Object[1][10];
                        // Заполняем первый столбец с именем и фамилией студента
                        data[0][0] = interface1.getGroup(groupIndex).getSubgroup(subgroupIndex).getStudent(studentIndex).getFirstName() + " " + interface1.getGroup(groupIndex).getSubgroup(subgroupIndex).getStudent(studentIndex).getLastName();
                        // Заполняем остальные столбцы с оценками студента
                        for (int i = 1; i < 10; i++) {
                            data[0][i] = interface1.getGroup(groupIndex).getSubgroup(subgroupIndex).getStudent(studentIndex).getGrade(i - 1) + "%";
                        }

                        // Создаем массив строк с названиями столбцов таблицы
                        String[] columnNames = {"Имя и фамилия", "База данных", "Инф системы и сети", "Методы проектирования", "Надежность инф систем", "Физ-ра", "Программирование", "ОХТ", "Продукты питания", "Финансовая культура"};

                        // Создаем новую таблицу с данными о студенте
                        table = new JTable(data, columnNames);

                        // Получаем объект класса JTableHeader, связанный с таблицей
                        JTableHeader studheader = table.getTableHeader();

// Добавляем объект JTableHeader на панель
                        panel.add(studheader);

// Добавляем таблицу на панель
                        panel.add(table);

                        // Устанавливаем ширину столбцов таблицы
                        table.getColumnModel().getColumn(0).setPreferredWidth(200);
                        for (int i = 1; i < 10; i++) {
                            table.getColumnModel().getColumn(i).setPreferredWidth(150);
                        }

                        // Добавляем таблицу на панель
                        panel.add(table);

                        // Обновляем панель
                        panel.revalidate();
                        panel.repaint();

                        // Изменяем метку с сообщением
                        label.setText("Вы выбрали студента " + studentName + " в подгруппе " + subgroupNumber + " в группе " + groupName);
                    }
                }
            }
        }

        // Если источник события - кнопка выбора предмета
        if (source == subjectButton) {
            // Создаем массив строк с номерами предметов
            String[] subjectNames = {"База данных", "Инф системы и сети", "Методы проектирования", "Надежность инф систем", "Физ-ра", "Программирование", "ОХТ", "Продукты питания", "Финансовая культура"};

            // Создаем диалоговое окно с выпадающим списком для выбора предмета
            String subjectName = (String) JOptionPane.showInputDialog(this, "Выберите предмет:", "Выбор предмета", JOptionPane.QUESTION_MESSAGE, null, subjectNames, subjectNames[0]);

            // Если пользователь выбрал предмет
            if (subjectName != null) {
                // Находим индекс выбранного предмета в массиве названий
                int subjectIndex = Arrays.asList(subjectNames).indexOf(subjectName);
                // Если индекс не равен -1, то предмет найден
                if (subjectIndex != -1) {
                    // Удаляем предыдущую таблицу с панели, если она существует
                    if (table != null) {
                        panel.remove(table);
                    }
                    // Получаем объект класса JTableHeader, связанный с таблицей
                    JTableHeader header = table.getTableHeader();

                    if (header != null) {
                        panel.remove(header);
                    }
                    // Создаем двумерный массив объектов с данными о студентах по предмету
                    Object[][] data = new Object[24][3];
                    for (int i = 0; i < 12; i++) {
                        // Заполняем первый столбец с именами и фамилиями студентов из первой группы
                        data[i][0] = interface1.getGroup(0).getSubgroup(i / 6).getStudent(i % 6).getFirstName() + " " + interface1.getGroup(0).getSubgroup(i / 6).getStudent(i % 6).getLastName();
                        // Заполняем второй столбец с оценками студентов из первой группы
                        data[i][1] = interface1.getGroup(0).getSubgroup(i / 6).getStudent(i % 6).getGrade(subjectIndex) + "%";
                        // Заполняем третий столбец с названием группы
                        data[i][2] = interface1.getGroup(0).getName();
                    }
                    for (int i = 12; i < 24; i++) {
                        // Заполняем первый столбец с именами и фамилиями студентов из второй группы
                        data[i][0] = interface1.getGroup(1).getSubgroup((i - 12) / 6).getStudent((i - 12) % 6).getFirstName() + " " + interface1.getGroup(1).getSubgroup((i - 12) / 6).getStudent((i - 12) % 6).getLastName();
                        // Заполняем второй столбец с оценками студентов из второй группы
                        data[i][1] = interface1.getGroup(1).getSubgroup((i - 12) / 6).getStudent((i - 12) % 6).getGrade(subjectIndex) + "%";
                        // Заполняем третий столбец с названием группы
                        data[i][2] = interface1.getGroup(1).getName();
                    }

                    // Создаем массив строк с названиями столбцов таблицы
                    String[] columnNames = {"Имя и фамилия", "Оценка", "Группа"};

                    // Создаем новую таблицу с данными о студентах по предмету
                    table = new JTable(data, columnNames);

                    // Получаем объект класса JTableHeader, связанный с таблицей
                    JTableHeader subjectheader = table.getTableHeader();

// Добавляем объект JTableHeader на панель
                    panel.add(subjectheader);

// Добавляем таблицу на панель
                    panel.add(table);

                    /// Устанавливаем ширину столбцов таблицы
                    table.getColumnModel().getColumn(0).setPreferredWidth(200);
                    for (int i = 1; i < 10; i++) {
                        table.getColumnModel().getColumn(i).setPreferredWidth(150);
                    }

                    // Добавляем таблицу на панель
                    panel.add(table);

                    // Обновляем панель
                    panel.revalidate();
                    panel.repaint();

                    // Изменяем метку с сообщением
                    label.setText("Успеваемость студентов по предмету: " + subjectName);
                }
            }
        }
    }
}