import java.awt.*; 															// импорт пакета awt
import java.awt.event.ActionEvent; 											// импорт пакета awt.event.ActionEvent
import java.awt.event.ActionListener; 										// импорт пакета awt.event.ActionListener
import java.awt.event.ItemEvent; 											// импорт пакета awt.event.ItemEvent
import java.awt.event.ItemListener; 										// импорт пакета event.ItemListener
import java.text.*; 														// импорт пакета text
import javax.swing.*; 														// импорт пакета swing
import javafx.*;															// импорт пакета javafx
public class nds															// открытый класс "nds"
{																			// открывающий символ
	private JLabel log;														// добавление часного модуля log типа Jlabel(надпись)
	private JLabel log11;													// добавление часного модуля log11 типа Jlabel(надпись)
	private JLabel log1;													// добавление часного модуля log1 типа Jlabel(надпись)
    private JLabel log2;													// добавление часного модуля log2 типа Jlabel(надпись)
    private JLabel log3;													// добавление часного модуля log3 типа Jlabel(надпись)
    private JLabel log4;													// добавление часного модуля log4 типа Jlabel(надпись)
    private JLabel log5;													// добавление часного модуля log5 типа Jlabel(надпись)
    private JLabel log6;													// добавление часного модуля log6 типа Jlabel(надпись)
    private JLabel log7;													// добавление часного модуля log7 типа Jlabel(надпись)
    private JLabel log8;													// добавление часного модуля log8 типа Jlabel(надпись)
    private JLabel rubl1;													// добавление часного модуля rubl1 типа Jlabel(надпись)
    private JLabel rubl2;													// добавление часного модуля rubl2 типа Jlabel(надпись)
    private JLabel rubl3;													// добавление часного модуля rubl3 типа Jlabel(надпись)
    private JLabel rubl4;													// добавление часного модуля rubl4 типа Jlabel(надпись)
    private JLabel result;													// добавление часного модуля result типа Jlabel(надпись)
    private JTextField text1;												// добавление часного модуля text1 типа JTextField(текстовое поле)
    private JTextField text2;												// добавление часного модуля text2 типа JTextField(текстовое поле)
    private JTextField text3;												// добавление часного модуля text3 типа JTextField(текстовое поле)
    private JTextField text4;												// добавление часного модуля text4 типа JTextField(текстовое поле)
    private JComboBox comboBox;												// добавление часного модуля comboBox типа JComboBox(выпадающий список)
    private JComboBox comboBox1;											// добавление часного модуля comboBox1 типа JComboBox(выпадающий список)
    private JComboBox comboBox2;											// добавление часного модуля comboBox2 типа JComboBox(выпадающий список)
    private JComboBox comboBox3;											// добавление часного модуля comboBox3 типа JComboBox(выпадающий список)
    private JComboBox comboBox4;											// добавление часного модуля comboBox4 типа JComboBox(выпадающий список)
    private JButton Button1;												// добавление часного модуля Button1 типа JButton(кнопка)
    private JButton Button2;												// добавление часного модуля Button2 типа JButton(кнопка)
    private JFrame mainFrame;												// добавление часного модуля mainFrame типа JFrame(форма)    
    nds() {																	// начало класса
//colors
Color back = new Color(245,245,220);										// присвоение переменной back цвета
Color font = new Color(132,132,130);										// присвоение переменной font цвета
Color button = new Color(255, 229, 180);									// присвоение переменной button цвета
//labels  
        log = new JLabel("Программа для расчета НДС");						// создание объекта log типа  Jlable
       	Font head = new Font("Verdana", Font.BOLD, 12);						// присвоение переменной head стиля текста
       	log.setFont(head);													// присвоение объекту log стиля текста равному значению переменной head
        log11 = new JLabel("Введите цену товара в поле");					// создание объекта log11 типа  Jlable
        log1 = new JLabel("Цена товара введена");							// создание объекта log1 типа  Jlable
    	log2 = new JLabel("Вид торговли");									// создание объекта log2 типа  Jlable
        log3 = new JLabel("Наличие комплекта документов");					// создание объекта log3 типа  Jlable
        log4 = new JLabel("Реализация специальных товаров");				// создание объекта log4 типа  Jlable
        log5 = new JLabel("Налогоплательщик это");							// создание объекта log5 типа  Jlable
        log6 = new JLabel("Сумма с НДС");       							// создание объекта log6 типа  Jlable
        log6.setVisible(false);												// задаем значение свойства отображения объекта log6 = невидимый
        log7 = new JLabel("Сумма без НДС");        							// создание объекта log7 типа  Jlable
        log7.setVisible(false);												// задаем значение свойства отображения объекта log7 = невидимый
        log8 = new JLabel("НДС");              								// создание объекта log8 типа  Jlable
        log8.setVisible(false);												// задаем значение свойства отображения объекта log8 = невидимый
       	Font font1 = new Font("", Font.BOLD, 13);							// присвоение переменной font1 стиля текста
       	log6.setFont(font1);												// присвоение объекту log6 стиля текста равному значению переменной font1
       	log7.setFont(font1);												// присвоение объекту log7 стиля текста равному значению переменной font1
       	log8.setFont(font1);												// присвоение объекту log8 стиля текста равному значению переменной font1
        rubl1 = new JLabel("руб");											// создание объекта rubl1 типа  Jlable
        rubl2 = new JLabel("руб");											// создание объекта rubl2 типа  Jlable
        rubl2.setVisible(false);											// задаем значение свойства отображения объекта rubl2 = невидимый
        rubl3 = new JLabel("руб");											// создание объекта rubl3 типа  Jlable
        rubl3.setVisible(false);											// задаем значение свойства отображения объекта rubl3 = невидимый
        rubl4 = new JLabel("руб");											// создание объекта rubl4 типа  Jlable
        rubl4.setVisible(false);											// задаем значение свойства отображения объекта rubl4 = невидимый
        result = new JLabel("Введите необходимые данные");					// создание объекта result типа  JLabel
        result.setForeground(Color.RED);									// установка цвета текста Jlabel result
//buttons
        Button1 = new JButton("Расчитать");									// создание объекта Button3 типа  JButton
      	Button1.setEnabled(false);											// перевод кнопки Button3 в не доступное состояние (для нажатия) методом setEnabled
      	Button2 = new JButton("Заново");									// создание объекта Button4 типа  JButton
      	Button2.setVisible(false);											// задаем значение свойства отображения объекта Button2 = невидимый
      	Button1.setBackground(button);										// присвоение объекту Button1 цвета фона равному значению переменной button
      	Button2.setBackground(button);										// присвоение объекту Button2 цвета фона равному значению переменной button
// comboboxes
    	String[] items = {													// создание строк текста 			
    			"",															// первая строка
                "Физическое лицо",											// вторая строка
                "Индивидуальный предприниматель"							// третья строка
            };																// конец создания строк			
    	JComboBox editComboBox = new JComboBox(items);						// объединение строк в выпадающий список                        
        comboBox = new JComboBox(items);									// создание объекта  comboBox типа  JComboBox
        comboBox.setEnabled(false);											// перевод выбора из списка comboBox в недоступное состояние (для нажатия) методом setEnabled
      	String[] items1 = {													// создание строк текста 			
    			"",															// первая строка
    			"С НДС",													// вторая строка
    			"Без НДС"													// третья строка
            };																// конец создания строк	
      	JComboBox editComboBox1 = new JComboBox(items1);					// объединение строк в выпадающий список  
      	comboBox1 = new JComboBox(items1);									// создание объекта  comboBox1 типа  JComboBox
      	String[] items2 = {													// создание строк текста 			
    			"",															// первая строка
    			"Местная",													// вторая строка
    			"Экспорт"													// третья строка
            };																// конец создания строк	
      	JComboBox editComboBox2 = new JComboBox(items2);					// объединение строк в выпадающий список  
      	comboBox2 = new JComboBox(items2);									// создание объекта  comboBox2 типа  JComboBox
      	comboBox2.setEnabled(false);										// перевод выбора из списка comboBox2 в недоступное состояние (для нажатия) методом setEnabled   	
      	String[] items3 = {													// создание строк текста 			
    			"",															// первая строка
    			"Есть",														// вторая строка
    			"Отсутствует"												// третья строка
            };																// конец создания строк	
      	JComboBox editComboBox3 = new JComboBox(items3);					// объединение строк в выпадающий список
      	comboBox3 = new JComboBox(items3);									// создание объекта  comboBox3 типа  JComboBox
      	comboBox3.setEnabled(false);										// перевод выбора из списка comboBox3 в недоступное состояние (для нажатия) методом setEnabled      	
      	String[] items4 = {													// создание строк текста 			
    			"",															// первая строка
    			"Да",														// вторая строка
    			"Нет"														// третья строка
            };																// конец создания строк	
      	JComboBox editComboBox4 = new JComboBox(items4);					// объединение строк в выпадающий список
      	comboBox4 = new JComboBox(items4);									// создание объекта  comboBox4 типа  JComboBox
      	comboBox4.setEnabled(false);										// перевод выбора из списка comboBox4 в недоступное состояние (для нажатия) методом setEnabled
	    comboBox.setBackground(button);										// присвоение объекту comboBox цвета фона равному значению переменной button
		comboBox1.setBackground(button);									// присвоение объекту comboBox1 цвета фона равному значению переменной button
		comboBox2.setBackground(button);									// присвоение объекту comboBox2 цвета фона равному значению переменной button
		comboBox3.setBackground(button);									// присвоение объекту comboBox3 цвета фона равному значению переменной button
		comboBox4.setBackground(button);									// присвоение объекту comboBox4 цвета фона равному значению переменной button
//textfields
        text1 = new JTextField("");											// создание объекта text1 типа  JTextField
        text1.setHorizontalAlignment(JTextField.RIGHT);						// установка выравнивания содержания метки вдоль X осей
        text2 = new JTextField("");											// создание объекта text2 типа  JTextField
        text2.setEditable(false);											// запрет редактирования поля  text2
        text2.setVisible(false);											// задаем значение свойства отображения объекта text2 = невидимый
        text2.setHorizontalAlignment(JTextField.RIGHT);						// установка выравнивания содержания метки вдоль X осей
        text3 = new JTextField("");											// создание объекта text3 типа  JTextField
        text3.setEditable(false);											// запрет редактирования поля  text3		
        text3.setVisible(false);											// задаем значение свойства отображения объекта text3 = невидимый
        text3.setHorizontalAlignment(JTextField.RIGHT);						// установка выравнивания содержания метки вдоль X осей
        text4 = new JTextField("");											// создание объекта text4 типа  JTextField
        text4.setEditable(false);											// запрет редактирования поля  text4		
        text4.setVisible(false);											// задаем значение свойства отображения объекта text4 = невидимый
        text4.setHorizontalAlignment(JTextField.RIGHT);						// установка выравнивания содержания метки вдоль X осей
		text1.setBackground(button);										// присвоение объекту text1 цвета фона равному значению переменной button
		text2.setBackground(button);										// присвоение объекту text2 цвета фона равному значению переменной button
		text3.setBackground(button);										// присвоение объекту text3 цвета фона равному значению переменной button
		text4.setBackground(button);										// присвоение объекту text4 цвета фона равному значению переменной button
 //action listeners       
        ActionListener again = new ActionListener() {						// объявление слушателя again (обработку события нажатия на кнопку)
            @Override														// добавление аннотации Override
             public void actionPerformed(ActionEvent ar) {					// объявление метода actionPerformed
                comboBox.setSelectedItem("");								// присвоение объекту comboBox значения равного пустому полю
                comboBox1.setSelectedItem("");								// присвоение объекту comboBox1 значения равного пустому полю
                comboBox2.setSelectedItem("");								// присвоение объекту comboBox2 значения равного пустому полю
                comboBox3.setSelectedItem("");								// присвоение объекту comboBox3 значения равного пустому полю
                comboBox4.setSelectedItem("");								// присвоение объекту comboBox4 значения равного пустому полю
            	comboBox1.setEnabled(true);									// перевод выбора из списка comboBox1 в доступное состояние (для нажатия) методом setEnabled	
               	Button1.setEnabled(false);									// перевод кнопки Button3 в не доступное состояние (для нажатия) методом setEnabled
            	Button2.setEnabled(false);									// перевод кнопки Button4 в не доступное состояние (для нажатия) методом setEnabled
                text1.setEnabled(true);										// разрешение редактирования поля  text1
                log11.setVisible(true);										// задаем значение свойства отображения объекта log11 = видимый
                log1.setVisible(true);										// задаем значение свойства отображения объекта log1 = видимый
                log2.setVisible(true);										// задаем значение свойства отображения объекта log2 = видимый
                log3.setVisible(true);										// задаем значение свойства отображения объекта log3 = видимый
                log4.setVisible(true);										// задаем значение свойства отображения объекта log4 = видимый
                log5.setVisible(true);										// задаем значение свойства отображения объекта log5 = видимый
                text1.setVisible(true);										// задаем значение свойства отображения объекта text1 = видимый
                comboBox.setVisible(true);									// задаем значение свойства отображения объекта comboBox = видимый
                comboBox1.setVisible(true);									// задаем значение свойства отображения объекта comboBox1 = видимый
                comboBox2.setVisible(true);									// задаем значение свойства отображения объекта comboBox2 = видимый
                comboBox3.setVisible(true);									// задаем значение свойства отображения объекта comboBox3 = видимый
                comboBox4.setVisible(true);									// задаем значение свойства отображения объекта comboBox4 = видимый
                Button1.setVisible(true);									// задаем значение свойства отображения объекта Button1 = видимый
                rubl1.setVisible(true);										// задаем значение свойства отображения объекта rubl1 = невидимый
                Button2.setVisible(false);									// задаем значение свойства отображения объекта Button2 = невидимый
                log6.setVisible(false);										// задаем значение свойства отображения объекта log6 = невидимый
                log7.setVisible(false);										// задаем значение свойства отображения объекта log7 = невидимый
                log8.setVisible(false);										// задаем значение свойства отображения объекта log8 = невидимый
                text2.setVisible(false);									// задаем значение свойства отображения объекта text2 = невидимый
                text3.setVisible(false);									// задаем значение свойства отображения объекта text3 = невидимый
                text4.setVisible(false);									// задаем значение свойства отображения объекта text4 = невидимый
                rubl2.setVisible(false);									// задаем значение свойства отображения объекта rubl2 = невидимый
                rubl3.setVisible(false);									// задаем значение свойства отображения объекта rubl3 = невидимый
                rubl4.setVisible(false);									// задаем значение свойства отображения объекта rubl4 = невидимый
                result.setText("Введите необходимые данные");				// присваиваем значению объекта result текстовое значение "Введите необходимые данные"
            }																// конец метода actionPerformed    
        };																	// конец работы слушателя again
        final ActionListener bnds1 = new ActionListener() {					// объявление слушателя bnds1 (обработку события нажатия на кнопку)
            @Override														// добавление аннотации Override
             public void actionPerformed(ActionEvent calc) {				// объявление метода actionPerformed	
               try {														// объявление оператора try (попытка выполнить действия)
                double cost2 = Double.parseDouble(text1.getText()); 		// определение типа(Double) переменной(cost2) методом parseDouble,присваиваение переменной cost2 введенного значения из text1
                double nds2 = cost2 * 0.1;									// определение типа переменной(nds2), присваиваение nds2 значение выражения
                double summas2 = cost2 + nds2;								// определение типа переменной(summas2), присваиваение summas2 значение выражения
                double summabez2 = cost2; 									// определение типа переменной(summabez2), присваиваение summabez2 значение выражения
                NumberFormat na = NumberFormat.getInstance();				// присвоение класса NumberFormat переменной na методом getInstance
                na.setMaximumFractionDigits(2);   							// ограничение количества цифр после запятой до 2-ух
                text2.setText(""+na.format(summas2));						// вывод значения summas2 в поле text2, используя метод setText и ограничение количества цифр после запятой методом format
                text3.setText(""+na.format(summabez2));						// вывод значения summabez2 в поле text3, используя метод setText и ограничение количества цифр после запятой методом format
                text4.setText(""+na.format(nds2));							// вывод значения nds2 в поле text4, используя метод setText и ограничение количества цифр после запятой методом format
                result.setText("");											// вывод текста "" в поле  result, используя метод setText
                log11.setVisible(false);									// задаем значение свойства отображения объекта log11 = невидимый
                log1.setVisible(false);										// задаем значение свойства отображения объекта log1 = невидимый
                log2.setVisible(false);										// задаем значение свойства отображения объекта log2 = невидимый
                log3.setVisible(false);										// задаем значение свойства отображения объекта log3 = невидимый
                log4.setVisible(false);										// задаем значение свойства отображения объекта log4 = невидимый
                log5.setVisible(false);										// задаем значение свойства отображения объекта log5 = невидимый
                text1.setVisible(false);									// задаем значение свойства отображения объекта text1 = невидимый
                comboBox.setVisible(false);									// задаем значение свойства отображения объекта comboBox = невидимый
                comboBox1.setVisible(false);								// задаем значение свойства отображения объекта comboBox1 = невидимый
                comboBox2.setVisible(false);								// задаем значение свойства отображения объекта comboBox2 = невидимый
                comboBox3.setVisible(false);								// задаем значение свойства отображения объекта comboBox3 = невидимый
                comboBox4.setVisible(false);								// задаем значение свойства отображения объекта comboBox4 = невидимый
                Button1.setVisible(false);									// задаем значение свойства отображения объекта Button1 = невидимый
                rubl1.setVisible(false);									// задаем значение свойства отображения объекта rubl1 = невидимый
                Button2.setVisible(true);									// задаем значение свойства отображения объекта Button2 = видимый
                log6.setVisible(true);										// задаем значение свойства отображения объекта log6 = видимый
                log7.setVisible(true);										// задаем значение свойства отображения объекта log7 = видимый
                log8.setVisible(true);										// задаем значение свойства отображения объекта log8 = видимый
                text2.setVisible(true);										// задаем значение свойства отображения объекта text2 = видимый
                text3.setVisible(true);										// задаем значение свойства отображения объекта text3 = видимый
                text4.setVisible(true);										// задаем значение свойства отображения объекта text4 = видимый
                rubl2.setVisible(true);										// задаем значение свойства отображения объекта rubl2 = видимый
                rubl3.setVisible(true);										// задаем значение свойства отображения объекта rubl3 = видимый
                rubl4.setVisible(true);										// задаем значение свойства отображения объекта rubl4 = видимый
                Button2.setEnabled(true);									// перевод объекта Button2 в доступное состояние (для нажатия) методом setEnabled
                comboBox1.setEnabled(false);								// перевод объекта comboBox1 в недоступное состояние (для нажатия) методом setEnabled
                comboBox2.setEnabled(false);								// перевод объекта comboBox2 в недоступное состояние (для нажатия) методом setEnabled
                comboBox3.setEnabled(false);								// перевод объекта comboBox3 в недоступное состояние (для нажатия) методом setEnabled
                comboBox4.setEnabled(false);								// перевод объекта comboBox4 в недоступное состояние (для нажатия) методом setEnabled
                comboBox.setEnabled(false);									// перевод объекта comboBox в недоступное состояние (для нажатия) методом setEnabled
                text1.setEnabled(false);									// перевод объекта text1 в недоступное состояние (для нажатия) методом setEnabled
               }															// конец выполнения действий оператора try
               catch ( NumberFormatException error ) {						// перехват исключения оператором catch
                   result.setText("Проверьте введённые данные"); 			// вывод текста "Проверьте введённые данные" в поле  result, через метод setText
                   result.setForeground(Color.RED);						// установка цвета текста Jlabel result
             }																// конец выполнения действий при перехвате исключения оператором catch
            }																// конец метода actionPerformed    
        };																	// конец работы слушателя bnds1
           final ActionListener bnds2 = new ActionListener() {				// объявление слушателя bnds2 (обработку события нажатия на кнопку)
           @Override														// добавление аннотации Override
            public void actionPerformed(ActionEvent calc) {				// объявление метода actionPerformed	
                try {														// объявление оператора try (попытка выполнить действия)
                   double cost3 = Double.parseDouble(text1.getText());		// определение типа(Double) переменной(cost3) методом parseDouble,присваиваение переменной cost3 введенного значения из text1
                   double nds3 = 0;										// определение типа переменной(nds3), присваиваение nds3 значение выражения
                   double summas3 = cost3 + nds3;							// определение типа переменной(summas3), присваиваение summas3 значение выражения
                   double summabez3 = cost3; 								// определение типа переменной(summabez3), присваиваение summabez3 значение выражения
                   NumberFormat na = NumberFormat.getInstance();			// присвоение класса NumberFormat переменной na методом getInstance
                   na.setMaximumFractionDigits(2);  						// ограничение количества цифр после запятой до 2-ух
                   text2.setText(""+na.format(summas3));					// вывод значения summas3 в поле text2, используя метод setText и ограничение количества цифр после запятой методом format
                   text3.setText(""+na.format(summabez3));					// вывод значения summabez3 в поле text3, используя метод setText и ограничение количества цифр после запятой методом format
                   text4.setText(""+na.format(nds3));						// вывод значения nds3 в поле text4, используя метод setText и ограничение количества цифр после запятой методом format
                   result.setText("");										// вывод текста "" в поле  result, используя метод setText
                   log11.setVisible(false);								// задаем значение свойства отображения объекта log11 = невидимый
                   log1.setVisible(false); 								// задаем значение свойства отображения объекта log1 = невидимый
                   log2.setVisible(false); 								// задаем значение свойства отображения объекта log2 = невидимый
                   log3.setVisible(false); 								// задаем значение свойства отображения объекта log3 = невидимый
                   log4.setVisible(false); 								// задаем значение свойства отображения объекта log4 = невидимый
                   log5.setVisible(false); 								// задаем значение свойства отображения объекта log5 = невидимый
                   text1.setVisible(false); 								// задаем значение свойства отображения объекта text1 = невидимый
                   comboBox.setVisible(false); 							// задаем значение свойства отображения объекта comboBox = невидимый
                   comboBox1.setVisible(false); 							// задаем значение свойства отображения объекта comboBox1 = невидимый
                   comboBox2.setVisible(false); 							// задаем значение свойства отображения объекта comboBox2 = невидимый
                   comboBox3.setVisible(false); 							// задаем значение свойства отображения объекта comboBox3 = невидимый
                   comboBox4.setVisible(false); 							// задаем значение свойства отображения объекта comboBox4 = невидимый
                   Button1.setVisible(false); 								// задаем значение свойства отображения объекта Button1 = невидимый
                   rubl1.setVisible(false); 								// задаем значение свойства отображения объекта rubl1 = невидимый
                   Button2.setVisible(true); 								// задаем значение свойства отображения объекта Button2 = видимый
                   log6.setVisible(true); 									// задаем значение свойства отображения объекта log6 = видимый
                   log7.setVisible(true); 									// задаем значение свойства отображения объекта log7 = видимый
                   log8.setVisible(true); 									// задаем значение свойства отображения объекта log8 = видимый
                   text2.setVisible(true);									// задаем значение свойства отображения объекта text2 = видимый
                   text3.setVisible(true);									// задаем значение свойства отображения объекта text3 = видимый
                   text4.setVisible(true);									// задаем значение свойства отображения объекта text4 = видимый
                   rubl2.setVisible(true);									// задаем значение свойства отображения объекта rubl2 = видимый
                   rubl3.setVisible(true);									// задаем значение свойства отображения объекта rubl3 = видимый
                   rubl4.setVisible(true);									// задаем значение свойства отображения объекта rubl4 = видимый
                   Button2.setEnabled(true);								// перевод объекта Button2 в доступное состояние (для нажатия) методом setEnabled
                   comboBox1.setEnabled(false);							// перевод объекта  comboBox1 в недоступное состояние (для нажатия) методом setEnabled
                   comboBox2.setEnabled(false);							// перевод объекта  comboBox2 в недоступное состояние (для нажатия) методом setEnabled
                   comboBox3.setEnabled(false);							// перевод объекта  comboBox3 в недоступное состояние (для нажатия) методом setEnabled
                   comboBox4.setEnabled(false);							// перевод объекта  comboBox4 в недоступное состояние (для нажатия) методом setEnabled
                   comboBox.setEnabled(false);								// перевод объекта  comboBox в недоступное состояние (для нажатия) методом setEnabled
                   text1.setEnabled(false);								// перевод объекта  text1 в недоступное состояние (для нажатия) методом setEnabled
                }															// конец выполнения действий оператора try
            catch ( NumberFormatException error ) {						// перехват исключения оператором catch
                   result.setText("Проверьте введённые данные"); 			// вывод текста "Проверьте введённые данные" в поле  result, через метод setText
                   result.setForeground(Color.RED);						// установка цвета текста Jlabel result
             }																// конец выполнения действий при перехвате исключения оператором catch
            }																// конец метода actionPerformed    
        };																	// конец работы слушателя bnds2       
       final ActionListener snds1 = new ActionListener() {					// объявление слушателя snds1 (обработку события нажатия на кнопку)
           @Override														// добавление аннотации Override
            public void actionPerformed(ActionEvent calc) {				// объявление метода actionPerformed	
                try {														// объявление оператора try (попытка выполнить действия)
                   double cost4 = Double.parseDouble(text1.getText());		// определение типа(Double) переменной(cost4) методом parseDouble,присваиваение переменной cost4 введенного значения из text1
                   double nds4 = cost4-cost4/1.1;							// определение типа переменной(nds4), присваиваение nds4 значение выражения
                   double summas4 = cost4;									// определение типа переменной(summas4), присваиваение summas4 значение выражения
                   double summabez4 = cost4/1.1; 							// определение типа переменной(summabez4), присваиваение summabez4 значение выражения
                   NumberFormat na = NumberFormat.getInstance();			// присвоение класса NumberFormat переменной na методом getInstance
                   na.setMaximumFractionDigits(2); 						// ограничение количества цифр после запятой до 2-ух
                   text2.setText(""+na.format(summas4));					// вывод значения summas4 в поле text2, используя метод setText и ограничение количества цифр после запятой методом format
                   text3.setText(""+na.format(summabez4));					// вывод значения summabez4 в поле text3, используя метод setText и ограничение количества цифр после запятой методом format
                   text4.setText(""+na.format(nds4));						// вывод значения nds4 в поле text4, используя метод setText и ограничение количества цифр после запятой методом format
                   result.setText("");										// вывод текста "" в поле  result, используя метод setText
                   log11.setVisible(false);								// задаем значение свойства отображения объекта log11 = невидимый
                   log1.setVisible(false);									// задаем значение свойства отображения объекта log1 = невидимый
                   log2.setVisible(false);									// задаем значение свойства отображения объекта log2 = невидимый
                   log3.setVisible(false);									// задаем значение свойства отображения объекта log3 = невидимый
                   log4.setVisible(false);									// задаем значение свойства отображения объекта log4 = невидимый
                   log5.setVisible(false);									// задаем значение свойства отображения объекта log5 = невидимый
                   text1.setVisible(false);								// задаем значение свойства отображения объекта text1 = невидимый
                   comboBox.setVisible(false);								// задаем значение свойства отображения объекта comboBox = невидимый
                   comboBox1.setVisible(false);							// задаем значение свойства отображения объекта comboBox1 = невидимый
                   comboBox2.setVisible(false);							// задаем значение свойства отображения объекта comboBox2 = невидимый
                   comboBox3.setVisible(false);							// задаем значение свойства отображения объекта comboBox3 = невидимый
                   comboBox4.setVisible(false);							// задаем значение свойства отображения объекта comboBox4 = невидимый
                   Button1.setVisible(false);								// задаем значение свойства отображения объекта Button1 = невидимый
                   rubl1.setVisible(false);								// задаем значение свойства отображения объекта rubl1 = невидимый
                   Button2.setVisible(true);								// задаем значение свойства отображения объекта Button2 = видимый
                   log6.setVisible(true);									// задаем значение свойства отображения объекта log6 = видимый
                   log7.setVisible(true);									// задаем значение свойства отображения объекта log7 = видимый
                   log8.setVisible(true);									// задаем значение свойства отображения объекта log8 = видимый
                   text2.setVisible(true);									// задаем значение свойства отображения объекта text2 = видимый
                   text3.setVisible(true);									// задаем значение свойства отображения объекта text3 = видимый
                   text4.setVisible(true);									// задаем значение свойства отображения объекта text4 = видимый
                   rubl2.setVisible(true);									// задаем значение свойства отображения объекта rubl2 = видимый
                   rubl3.setVisible(true);									// задаем значение свойства отображения объекта rubl3 = видимый
                   rubl4.setVisible(true);									// задаем значение свойства отображения объекта rubl4 = видимый
                   Button2.setEnabled(true);								// перевод объекта Button2 в доступное состояние (для нажатия) методом setEnabled
                   comboBox1.setEnabled(false);							// перевод объекта comboBox1 в недоступное состояние (для нажатия) методом setEnabled
                   comboBox2.setEnabled(false);							// перевод объекта comboBox2 в недоступное состояние (для нажатия) методом setEnabled
                   comboBox3.setEnabled(false);							// перевод объекта comboBox3 в недоступное состояние (для нажатия) методом setEnabled
                   comboBox4.setEnabled(false);							// перевод объекта comboBox4 в недоступное состояние (для нажатия) методом setEnabled
                   comboBox.setEnabled(false);								// перевод объекта comboBox в недоступное состояние (для нажатия) методом setEnabled
                   text1.setEnabled(false);								// перевод объекта text1 в недоступное состояние (для нажатия) методом setEnabled
                }															// конец выполнения действий оператора try
            catch ( NumberFormatException error ) {						// перехват исключения оператором catch		
                   result.setText("Проверьте введённые данные");			// вывод текста "Проверьте введённые данные" в поле  result, через метод setText
                   result.setForeground(Color.RED);						// установка цвета текста Jlabel result методом setForeground
             }																// конец выполнения действий при перехвате исключения оператором catch
            }																// конец метода actionPerformed    
        };																	// конец работы слушателя snds1        
        final ActionListener snds = new ActionListener() {					// объявление слушателя snds (обработку события нажатия на кнопку)
             @Override														// добавляем аннотации Override
              public void actionPerformed(ActionEvent calc) {				// объявление метода actionPerformed
                  try {													// объявление оператора try (попытка выполнить действия)
                     double cost = Double.parseDouble(text1.getText());	// определение типа(Double) переменной(cost) методом parseDouble, присваиваение переменной cost введенного значения из text1
                     double nds = cost-cost/1.18;							// определение типа переменной(nds), присваиваение nds значения выражения
                     double summas = cost;									// определение типа переменной(summas), присваиваение (summas значения выражения		
                     double summabez = cost/1.18; 							// определение типа переменной(summabez), присваиваение summabez значения выражения
                     NumberFormat na = NumberFormat.getInstance();			// присвоение класса NumberFormat переменной na методом getInstance
                     na.setMaximumFractionDigits(2);  						// ограничение количества цифр после запятой до 2-ух
                     text2.setText(""+na.format(summas));					// вывод значения summas в поле text2, используя метод setText и ограничение количества цифр после запятой методом format
                     text3.setText(""+na.format(summabez));				// вывод значения summabez в поле text2, используя метод setText и ограничение количества цифр после запятой методом format
                     text4.setText(""+na.format(nds));						// вывод значения nds в поле text2, используя метод setText и ограничение количества цифр после запятой методом format
                     result.setText("");									// вывод текстf "" в поле  result, используя метод setText
                     log11.setVisible(false);							 	// задаем значение свойства отображения объекта log11 = невидимый
                     log1.setVisible(false);							 	// задаем значение свойства отображения объекта log1 = невидимый
                     log2.setVisible(false);							 	// задаем значение свойства отображения объекта log2 = невидимый
                     log3.setVisible(false);							 	// задаем значение свойства отображения объекта log3 = невидимый
                     log4.setVisible(false);							 	// задаем значение свойства отображения объекта log4 = невидимый
                     log5.setVisible(false);							 	// задаем значение свойства отображения объекта log5 = невидимый
                     text1.setVisible(false);							 	// задаем значение свойства отображения объекта text1 = невидимый
                     comboBox.setVisible(false);						    // задаем значение свойства отображения объекта comboBox = невидимый
                     comboBox1.setVisible(false);						    // задаем значение свойства отображения объекта comboBox1 = невидимый
                     comboBox2.setVisible(false);						    // задаем значение свойства отображения объекта comboBox2 = невидимый
                     comboBox3.setVisible(false);						    // задаем значение свойства отображения объекта comboBox3 = невидимый
                     comboBox4.setVisible(false);						    // задаем значение свойства отображения объекта comboBox4 = невидимый
                     Button1.setVisible(false); 						    // задаем значение свойства отображения объекта Button1 = невидимый
                     rubl1.setVisible(false); 						   		// задаем значение свойства отображения объекта rubl1 = невидимый
                     Button2.setVisible(true); 						   	// задаем значение свойства отображения объекта Button2 = видимый
                     log6.setVisible(true); 						   		// задаем значение свойства отображения объекта log6 = видимый
                     log7.setVisible(true); 						   		// задаем значение свойства отображения объекта log7 = видимый
                     log8.setVisible(true); 						   		// задаем значение свойства отображения объекта log8 = видимый
                     text2.setVisible(true); 						   		// задаем значение свойства отображения объекта text2 = видимый
                     text3.setVisible(true); 						   		// задаем значение свойства отображения объекта text3 = видимый
                     text4.setVisible(true); 						   		// задаем значение свойства отображения объекта text4 = видимый
                     rubl2.setVisible(true); 						   		// задаем значение свойства отображения объекта rubl2 = видимый
                     rubl3.setVisible(true); 						   		// задаем значение свойства отображения объекта rubl3 = видимый
                     rubl4.setVisible(true); 						   		// задаем значение свойства отображения объекта rubl4 = видимый
                     Button2.setEnabled(true);								// перевод объекта Button2 в доступное состояние(для нажатия) методом setEnabled
                     comboBox1.setEnabled(false);							// перевод объекта comboBox1 в не доступное состояние (для нажатия) методом setEnabled
                     comboBox2.setEnabled(false);							// перевод объекта comboBox2 в не доступное состояние (для нажатия) методом setEnabled
                     comboBox3.setEnabled(false);							// перевод объекта comboBox3 в не доступное состояние (для нажатия) методом setEnabled
                     comboBox4.setEnabled(false);							// перевод объекта comboBox4 в не доступное состояние (для нажатия) методом setEnabled
                     comboBox.setEnabled(false);							// перевод объекта comboBox в не доступное состояние (для нажатия) методом setEnabled
                     text1.setEnabled(false);								// перевод объекта text1 в не доступное состояние (для нажатия) методом setEnabled
                  }														// конец выполнения действий оператора try
              catch ( NumberFormatException error ) {						// перехват исключения оператором catch
                     result.setText("Проверьте введённые данные"); 		// вывод текста "Проверьте введённые данные" в поле  result, через метод setText
                     result.setForeground(Color.RED);						// установка цвета текста Jlabel result методом setForeground
               }															// конец выполнения действий при перехвате исключения оператором catch
              }															// конец метода actionPerformed    
          };																// конец работы слушателя snds
          final ActionListener bnds = new ActionListener() {				// объявление слушателя bnds (обработку события нажатия на кнопку)
     	     @Override													// добавление аннотации Override
     	      public void actionPerformed(ActionEvent calc1) {			// объявление метода actionPerformed
     	          try {													// объявление оператора try (попытка выполнить действия)
     	             double cost = Double.parseDouble(text1.getText());	// определение типа (Double) переменной(cost) методом parseDouble, присваиваение переменной cost введенного значения из text1
     	             double nds1 = cost * 0.18;							// определение типа переменной(nds1), присваиваение nds1 значения выражения
     	             double summas1 = cost + nds1;						// определение типа переменной(summas1), присваиваение summas1 значения выражения
     	             double summabez1 = cost;							// определение типа переменной(summas1), присваиваение summabez1 значения выражения
     	             NumberFormat na = NumberFormat.getInstance();		// присвоение класса NumberFormat переменной na методом getInstance
                      na.setMaximumFractionDigits(2);   					// ограничение количества цифр после запятой до 2-ух
     	             text2.setText(""+na.format(summas1));				// вывод значения summas1 в поле text2, через метод setText и ограничение количества цифр после запятой методом format
     	             text3.setText(""+na.format(summabez1));			// вывод значения summabez1 в поле text2, через метод setText и ограничение количество цифр после запятой методом format
     	             text4.setText(""+na.format(nds1)); 				// вывод значения nds1 в поле text2, через метод setText и ограничение количества цифр после запятой методом format
     	             result.setText("");								// вывод текста "" в поле  result, используя метод setText
                      log11.setVisible(false);							// задаем значение свойства отображения объекта log11 = невидимый
                      log1.setVisible(false);							// задаем значение свойства отображения объекта log1 = невидимый
                      log2.setVisible(false);							// задаем значение свойства отображения объекта log2 = невидимый
                      log3.setVisible(false);							// задаем значение свойства отображения объекта log3 = невидимый
                      log4.setVisible(false);							// задаем значение свойства отображения объекта log4 = невидимый
                      log5.setVisible(false);							// задаем значение свойства отображения объекта log5 = невидимый
                      text1.setVisible(false);							// задаем значение свойства отображения объекта text1 = невидимый
                      comboBox.setVisible(false);						// задаем значение свойства отображения объекта comboBox = невидимый
                      comboBox1.setVisible(false);						// задаем значение свойства отображения объекта comboBox1 = невидимый
                      comboBox2.setVisible(false);						// задаем значение свойства отображения объекта comboBox2 = невидимый
                      comboBox3.setVisible(false);						// задаем значение свойства отображения объекта comboBox3 = невидимый
                      comboBox4.setVisible(false);						// задаем значение свойства отображения объекта comboBox4 = невидимый
                      Button1.setVisible(false);							// задаем значение свойства отображения объекта Button1 = невидимый
                      rubl1.setVisible(false);							// задаем значение свойства отображения объекта rubl1 = невидимый
                      Button2.setVisible(true);							// задаем значение свойства отображения объекта Button2 = видимый
                      log6.setVisible(true);								// задаем значение свойства отображения объекта log6 = видимый
                      log7.setVisible(true);								// задаем значение свойства отображения объекта log7 = видимый
                      log8.setVisible(true);								// задаем значение свойства отображения объекта log8 = видимый
                      text2.setVisible(true);							// задаем значение свойства отображения объекта text2 = видимый
                      text3.setVisible(true);							// задаем значение свойства отображения объекта text3 = видимый
                      text4.setVisible(true);							// задаем значение свойства отображения объекта text4 = видимый
                      rubl2.setVisible(true);							// задаем значение свойства отображения объекта rubl2 = видимый
                      rubl3.setVisible(true);							// задаем значение свойства отображения объекта rubl3 = видимый
                      rubl4.setVisible(true);							// задаем значение свойства отображения объекта rubl4 = видимый
     	             Button2.setEnabled(true);							// перевод объекта Button2 в доступное состояние (для нажатия) методом setEnabled
     	             comboBox1.setEnabled(false);						// перевод объекта comboBox1 в недоступное состояние (для нажатия) методом setEnabled
                      comboBox2.setEnabled(false);						// перевод объекта comboBox2 в недоступное состояние (для нажатия) методом setEnabled
                      comboBox3.setEnabled(false);						// перевод объекта comboBox3 в недоступное состояние (для нажатия) методом setEnabled
                      comboBox4.setEnabled(false);						// перевод объекта comboBox4 в недоступное состояние (для нажатия) методом setEnabled
                      comboBox.setEnabled(false);						// перевод объекта comboBox в недоступное состояние (для нажатия) методом setEnabled
                      text1.setEnabled(false);							// перевод объекта text1 в недоступное состояние (для нажатия) методом setEnabled
     	          }														// конец выполнения действий оператора try
     	      catch ( NumberFormatException error ) {					// перехват исключения оператором catch
     	             result.setText("Проверьте введённые данные");  	// вывод текста "Проверьте введённые данные" в поле  result, через метод setText
     	             result.setForeground(Color.RED); 					// установка цвета текста Jlabel result методом setForeground
     	       }														// конец выполнения действий при перехвате исключения оператором catch   
     	      }															// конец метода actionPerformed    
     	  };															// конец работы слушателя bnds	
        	  final ActionListener combob1 = new ActionListener() {			// объявление слушателя combob1 (обработку события выбора из списка)
               public void actionPerformed(ActionEvent a2) {  			// объявление метода actionPerformed
                   JComboBox box = (JComboBox)a2.getSource(); 			// присвоение переменной box значения JComboBox
                           String item = (String)box.getSelectedItem();  // присвоение переменной item значения box
                           if(item == "Да"){ 							// проверка выполнения логического выражения оператором if
                          	 comboBox.setEnabled(false);				// перевод объекта comboBox в недоступное состояние (для нажатия) методом setEnabled
                          	 comboBox.setSelectedItem("");				// присвоение объекту comboBox значения равного пустому полю
                          	 Button1.addActionListener(bnds1); 			// присваение объекту Button1 слушателя bnds1
                          	 Button1.removeActionListener(bnds); 		// прекращение прослушивания объекта Button1 слушателем bnds
                          	 Button1.removeActionListener(snds); 		// прекращение прослушивания объекта Button1 слушателем snds
                          	 Button1.removeActionListener(snds1); 		// прекращение прослушивания объекта Button1 слушателем snds1
                          	 Button1.removeActionListener(bnds2); 		// прекращение прослушивания объекта Button1 слушателем bnds2
                           }												// конец выполнения действий при выполнении условия оператора if   
                           else if(item == "Нет"){	 					// проверка выполнения логического выражения оператором else if
                           	 comboBox.setEnabled(true);					// перевод объекта comboBox в доступное состояние (для нажатия) методом setEnabled
                          	 Button1.removeActionListener(bnds); 		// пприсваение объекту Button1 слушателя bnds
                          	 Button1.removeActionListener(bnds1); 		// прекращение прослушивания кнопки Button1 слушателем bnds1                            	
                          	 Button1.removeActionListener(snds); 		// прекращение прослушивания кнопки Button1 слушателем snds
                          	 Button1.removeActionListener(snds1); 		// прекращение прослушивания кнопки Button1 слушателем snds1
                          	 Button1.removeActionListener(bnds2); 		// прекращение прослушивания кнопки Button1 слушателем bnds2
                           }												// конец выполнения действий при выполнении условия оператора else if
                           else if(item == ""){ 							// проверка выполнения логического выражения оператором else if
                          	 comboBox.setEnabled(false);				// перевод объекта comboBox в недоступное состояние (для нажатия) методом setEnabled
                              comboBox.setSelectedItem("");				// присвоение объекту comboBox значения равного пустому полю
                          	 Button1.removeActionListener(bnds); 		// присваение объекту Button1 слушателя bnds
                          	 Button1.removeActionListener(bnds1); 		// прекращение прослушивания кнопки Button1 слушателем bnds1                            	
                          	 Button1.removeActionListener(snds); 		// прекращение прослушивания кнопки Button1 слушателем snds
                          	 Button1.removeActionListener(snds1); 		// прекращение прослушивания кнопки Button1 слушателем snds1
                          	 Button1.removeActionListener(bnds2); 		// прекращение прослушивания кнопки Button1 слушателем bnds2
                           };											// конец выполнения действий при выполнении условия оператора else if                                 
                  }														// конец метода actionPerformed    
              };															// конец работы слушателя combob1
           	  final ActionListener combos1 = new ActionListener() {		// объявление слушателя combob (обработку события выбора из списка)
                   public void actionPerformed(ActionEvent a2) {  		// объявление метода actionPerformed
                       JComboBox box = (JComboBox)a2.getSource(); 		// присвоение переменной box значения JComboBox
                             String item = (String)box.getSelectedItem();// присвоение переменной item значения box	
                               if(item == "Да"){ 						// проверка выполнения логического выражения оператором if
                              	 comboBox.setEnabled(false);			// перевод объекта comboBox в недоступное состояние (для нажатия) методом setEnabled
                              	 comboBox.setSelectedItem("");			// присвоение объекту comboBox значения равного пустому полю
                              	 Button1.addActionListener(snds1); 		// присваение объекту Button1 слушателя snds1
                              	 Button1.removeActionListener(bnds); 	// прекращение прослушивания кнопки Button1 слушателем bnds
                              	 Button1.removeActionListener(snds); 	// прекращение прослушивания кнопки Button1 слушателем snds
                              	 Button1.removeActionListener(bnds2); 	// прекращение прослушивания кнопки Button1 слушателем bnds2
                              	 Button1.removeActionListener(bnds1); 	// прекращение прослушивания кнопки Button1 слушателем bnds1
                               }											// конец выполнения действий при выполнении условия оператора if   
                               else if(item == "Нет"){	 				// проверка выполнения логического выражения оператором else if
                              	 comboBox.setEnabled(true);				// перевод объекта comboBox в доступное состояние (для нажатия) методом setEnabled
                              	 Button1.removeActionListener(bnds); 	// присваение объекту Button1 слушателя bnds
                              	 Button1.removeActionListener(bnds1); 	// прекращение прослушивания кнопки Button1 слушателем bnds1                            	
                              	 Button1.removeActionListener(snds); 	// прекращение прослушивания кнопки Button1 слушателем snds
                              	 Button1.removeActionListener(snds1); 	// прекращение прослушивания кнопки Button1 слушателем snds1
                              	 Button1.removeActionListener(bnds2); 	// прекращение прослушивания кнопки Button1 слушателем bnds2
                               }											// конец выполнения действий при выполнении условия оператора else if
                               else if(item == ""){ 						// проверка выполнения логического выражения оператором else if
                              	 comboBox.setEnabled(false);			// перевод объекта comboBox в недоступное состояние (для нажатия) методом setEnabled
                                  comboBox.setSelectedItem("");			// присвоение объекту comboBox значения равного пустому полю
                              	 Button1.removeActionListener(bnds); 	// присваение объекту Button1 слушателя bnds
                              	 Button1.removeActionListener(bnds1); 	// прекращение прослушивания кнопки Button1 слушателем bnds1                            	
                              	 Button1.removeActionListener(snds); 	// прекращение прослушивания кнопки Button1 слушателем snds
                              	 Button1.removeActionListener(snds1); 	// прекращение прослушивания кнопки Button1 слушателем snds1
                              	 Button1.removeActionListener(bnds2); 	// прекращение прослушивания кнопки Button1 слушателем bnds2
                               };										// конец выполнения действий при выполнении условия оператора else if                                 
                      }													// конец метода actionPerformed    
                  };														// конец работы слушателя combos1
     	  final ActionListener combos = new ActionListener() {			// объявление слушателя combos (обработку события выбора из списка)
               public void actionPerformed(ActionEvent a) {  			// объявление метод actionPerformed
                   JComboBox box = (JComboBox)a.getSource();  			// присвоение переменной box значения JComboBox
                           String item = (String)box.getSelectedItem(); 	// присвоение переменной item значения box
                           if(item == "Физическое лицо"){ 				// проверка выполнения логического выражения оператором if
                          	 Button1.addActionListener(snds1); 			// присваение объекту Button1 слушателя snds1
                          	 Button1.removeActionListener(snds); 		// прекращение прослушивания кнопки Button1 слушателем snds
                          	 Button1.removeActionListener(bnds); 		// прекращение прослушивания кнопки Button1 слушателем bnds
                          	 Button1.removeActionListener(bnds1); 		// прекращение прослушивания кнопки Button1 слушателем bnds1
                          	 Button1.removeActionListener(bnds2);  		// прекращение прослушивания кнопки Button1 слушателем bnds2
                           }												// конец выполнения действий при выполнении условия оператора if   
                      else if(item == "Индивидуальный предприниматель"){ // проверка выполнения логического выражения оператором else if
                          	 Button1.addActionListener(snds); 			// присваение объекту Button1 слушателя snds
                          	 Button1.removeActionListener(snds1); 		// прекращение прослушивания кнопки Button1 слушателем snds1
                          	 Button1.removeActionListener(bnds); 		// прекращение прослушивания кнопки Button1 слушателем bnds
                          	 Button1.removeActionListener(bnds1); 		// прекращение прослушивания кнопки Button1 слушателем bnds1
                          	 Button1.removeActionListener(bnds2); 		// прекращение прослушивания кнопки Button1 слушателем bnds2
                           }												// конец выполнения действий при выполнении условия оператора else if   
                           else if(item == ""){ 							// проверка выполнения логического выражения оператором else if;
                           	 Button1.removeActionListener(snds); 		// прекращение прослушивания кнопки Button3 слушателем snds
                         	 Button1.removeActionListener(snds1); 		// прекращение прослушивания кнопки Button3 слушателем snds1
                           	 Button1.removeActionListener(bnds); 		// прекращение прослушивания кнопки Button3 слушателем snds
                           	 Button1.removeActionListener(bnds1); 		// прекращение прослушивания кнопки Button3 слушателем bnds1
                           	 Button1.removeActionListener(bnds2); 		// прекращение прослушивания кнопки Button3 слушателем bnds2
                           };											// конец выполнения действий при выполнении условия оператора else if                              
                  }														// конец метода actionPerformed         
              };															// конец работы слушателя combos                  
              final ActionListener combob = new ActionListener() {		// объявление слушателя combob (обработку события выбора из списка)
                  public void actionPerformed(ActionEvent a1) {  		// объявление метода actionPerformed
                      JComboBox box = (JComboBox)a1.getSource(); 		// присвоение переменной box значения JComboBox
                           String item = (String)box.getSelectedItem(); 	// присвоение переменной item значения box	
                              if(item == "Физическое лицо"){ 			// проверка выполнения логического выражения оператором if
                             	 Button1.addActionListener(bnds1); 		// присваение объекту Button1 слушателя bnds1
                             	 Button1.removeActionListener(bnds); 	// прекращение прослушивания кнопки Button1 слушателем bnds
                             	 Button1.removeActionListener(snds); 	// прекращение прослушивания кнопки Button1 слушателем snds
                             	 Button1.removeActionListener(snds1); 	// прекращение прослушивания кнопки Button1 слушателем snds1
                             	 Button1.removeActionListener(bnds2); 	// прекращение прослушивания кнопки Button1 слушателем bnds2
                              }											// конец выполнения действий при выполнении условия оператора if   
                       else if(item == "Индивидуальный предприниматель"){// проверка выполнения логического выражения оператором else if
                             	 Button1.addActionListener(bnds); 		// присваение объекту Button3 слушателя snds
                             	 Button1.removeActionListener(bnds1); 	// прекращение прослушивания кнопки Button3 слушателем bnds1                            	
                             	 Button1.removeActionListener(snds); 	// прекращение прослушивания кнопки Button3 слушателем snds
                             	 Button1.removeActionListener(snds1); 	// прекращение прослушивания кнопки Button3 слушателем snds1
                             	 Button1.removeActionListener(bnds2); 	// прекращение прослушивания кнопки Button3 слушателем bnds2
                              }											// конец выполнения действий при выполнении условия оператора else if
                              else if(item == ""){ 						// проверка выполнения логического выражения оператором else if
                              	 Button1.removeActionListener(bnds); 	// присваение объекту Button3 слушателя snds
                              	 Button1.removeActionListener(bnds1); 	// прекращение прослушивания кнопки Button3 слушателем bnds1                            	
                              	 Button1.removeActionListener(snds); 	// прекращение прослушивания кнопки Button3 слушателем snds
                              	 Button1.removeActionListener(snds1); 	// прекращение прослушивания кнопки Button3 слушателем snds1
                              	 Button1.removeActionListener(bnds2); 	// прекращение прослушивания кнопки Button3 слушателем bnds2
                              };											// конец выполнения действий при выполнении условия оператора else if                                 
                     }													// конец метода actionPerformed    
                 };														// конец работы слушателя combob        
     	  final ActionListener combo = new ActionListener() {			// объявление слушателя combob (обработку события выбора из списка)
               public void actionPerformed(ActionEvent a2) {  			// объявление метода actionPerformed
                   JComboBox box = (JComboBox)a2.getSource(); 			// присвоение переменной box значения JComboBox
                           String item = (String)box.getSelectedItem();  // присвоение переменной item значения box	
                           if(item == "С НДС"){ 							// проверка выполнения логического выражения оператором if
                           comboBox2.setEnabled(true);					// перевод объекта comboBox2 в доступное состояние (для нажатия) методом setEnabled
                           comboBox4.addActionListener(combos1); 		// присваение объекту comboBox4 слушателя combos1
                           comboBox.addActionListener(combos); 			// присваение объекту comboBox слушателя combos
                           comboBox4.removeActionListener(combob1); 		// прекращение прослушивания объекта comboBox4 слушателем combob1
                           comboBox.removeActionListener(combob); 		// прекращение прослушивания объекта comboBox слушателем combob
                           }												// конец выполнения действий при выполнении условия оператора if   
                           else if(item == "Без НДС"){					// проверка выполнения логического выражения оператором else if
                           comboBox2.setEnabled(true);					// перевод объекта comboBox2 в доступное состояние (для нажатия) методом setEnabled
                           comboBox4.addActionListener(combob1); 		// присваение объекту comboBox4 слушателя combob1
                           comboBox.addActionListener(combob); 			// присваение объекту comboBox слушателя combob
                           comboBox4.removeActionListener(combos1); 		// прекращение прослушивания объекта comboBox4 слушателем combos1
                           comboBox.removeActionListener(combos); 		// прекращение прослушивания объекта comboBox слушателем combos
                           }												// конец выполнения действий при выполнении условия оператора else if
                           else if(item == ""){ 							// проверка выполнения логического выражения оператором else if
                           comboBox2.setEnabled(false);					// перевод объекта comboBox2 в недоступное состояние (для нажатия) методом setEnabled
                       	  comboBox2.setSelectedItem("");				// присвоение объекту comboBox2 значения равного пустому полю
                           comboBox4.removeActionListener(combob1); 		// прекращение прослушивания объекта comboBox4 слушателем combob1
                           comboBox.removeActionListener(combob); 		// прекращение прослушивания объекта comboBox слушателем combob
                           comboBox4.removeActionListener(combos1); 		// прекращение прослушивания объекта comboBox4 слушателем combos1
                           comboBox.removeActionListener(combos); 		// прекращение прослушивания объекта comboBox слушателем combos
                           comboBox2.setSelectedItem("");				// присвоение объекту comboBox2 значения равного пустому полю
                           };											// конец выполнения действий при выполнении условия оператора else if                                 
                  }														// конец метода actionPerformed    
              };															//конец работы слушателя combo
     	  final ActionListener combobx = new ActionListener() {			// объявление слушателя combob (обработку события выбора из списка)
               public void actionPerformed(ActionEvent a2) {  			// объявление метода actionPerformed
                   JComboBox box = (JComboBox)a2.getSource(); 			// присвоение переменной box значения JComboBox
                           String item = (String)box.getSelectedItem();  // присвоение переменной item значения box
                           if(item == "Есть"){ 							// проверка выполнения логического выражения оператором if
                           	 comboBox4.setEnabled(false);				// перевод объекта comboBox4 в недоступное состояние (для нажатия) методом setEnabled
                          	 comboBox4.setSelectedItem("");				// присвоение объекту comboBox4 значения равного пустому полю
                          	 Button1.addActionListener(bnds2); 			// присваиваение объекту Button1 слушателя bnds2
                          	 Button1.removeActionListener(bnds); 		// прекращение прослушивания кнопки Button1 слушателем bnds
                          	 Button1.removeActionListener(snds); 		// прекращение прослушивания кнопки Button1 слушателем snds
                          	 Button1.removeActionListener(snds1); 		// прекращение прослушивания кнопки Button1 слушателем snds1
                          	 Button1.removeActionListener(bnds1); 		// прекращение прослушивания кнопки Button1 слушателем bnds2
                           }												// конец выполнения действий при выполнении условия оператора if   