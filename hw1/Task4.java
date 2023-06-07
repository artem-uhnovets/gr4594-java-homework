/* 
Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.

Под знаком вопроса - одинаковые цифры
Введите уравнение: ?? + ?? = 44
Ответ: 22 + 22 = 44
 */


package HomeWorks.hw1;

public class Task4 {
    public static void main(String[] args) {
        String equation = "2? + ?5 = 69"; // 4

        String[] letters = equation.split(" ");
        String[] letters_modif = new String[] {letters[0], letters[2], letters[4]};
        
        String val_1_char_1 = letters_modif[0].substring(0, 1);
        String val_1_char_2 = letters_modif[0].substring(1, 2);
        String val_2_char_1 = letters_modif[1].substring(0, 1);
        String val_2_char_2 = letters_modif[1].substring(1, 2);

        boolean is_checked = false;

        for (int i = 0; i < 10; i++) {
            String first_num;
            String second_num;

            if (isNumeric(val_1_char_1)) {
                if (isNumeric(val_1_char_2)) {
                    first_num = letters_modif[0];
                } else {
                    first_num = val_1_char_1 + Integer.toString(i);
                }
            } else if (isNumeric(val_1_char_2)) {
                first_num = Integer.toString(i) + val_1_char_2;
            } else {
                first_num = Integer.toString(i) + Integer.toString(i);
            }
            
            if (isNumeric(val_2_char_1)) {
                if (isNumeric(val_2_char_2)) {
                    second_num = letters_modif[1];
                } else {
                    second_num = val_2_char_1 + Integer.toString(i);
                }
            } else if (isNumeric(val_2_char_2)) {
                second_num = Integer.toString(i) + val_2_char_2;
            } else {
                second_num = Integer.toString(i) + Integer.toString(i);
            }

            if ((Integer.parseInt(letters_modif[2]) - Integer.parseInt(first_num)) == Integer.parseInt(second_num)) {
                System.out.printf("В представленном уравнении - %s\n", equation);
                System.out.printf("Под ? скрывается число - %d\n", i);
                is_checked = true;
            }
        }

        if (is_checked == false) {
            System.out.printf("В представленном уравнении - %s\n", equation);
            System.out.println("Решения нет!");
        }
    }

    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}