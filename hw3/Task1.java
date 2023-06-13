/* 
 * Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее ариф. значение
 */

package HomeWorks.hw3;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> my_ArrayList = create_ArrayList_random(10, 1, 99);
        System.out.printf("Произвольный список целых чисел - %s\n", my_ArrayList);

        double mean_my_list = mean_ArrayList(my_ArrayList);
        System.out.printf("Cреднее ариф. значение - %.2f\n", mean_my_list);

        int min_my_list = min_value_ArrayList(my_ArrayList);
        System.out.printf("Минимальное значение - %d\n", min_my_list);

        int max_my_list = max_value_ArrayList(my_ArrayList);
        System.out.printf("Максимальное значение -  %d\n", max_my_list);

        my_ArrayList = del_evens_ArrayList(my_ArrayList);
        System.out.printf("Список после удаления четных чисел - %s\n", my_ArrayList);
    }

    public static ArrayList<Integer> create_ArrayList_random(int length, int lower_num,int upper_num) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();
        int num_for_add = -1;
        for (int i = 0; i < length; i++) {
            num_for_add = -1;
            while (num_for_add < lower_num) {
            num_for_add = rnd.nextInt(upper_num);
            }
            numbers.add(num_for_add);
        }
        return numbers;
    }

    public static double mean_ArrayList(ArrayList<Integer> arraylist) {
        double summ_values = 0;
        double result = 0;
        for (int i = 0; i < arraylist.size(); i++) {
            summ_values += arraylist.get(i);
        }
        result = summ_values / arraylist.size();
        return result;
    }

    public static int min_value_ArrayList(ArrayList<Integer> arraylist) {
        int min_position = 0;
        for (int i = 1; i < arraylist.size(); i++) {
            if (arraylist.get(i) < arraylist.get(min_position)) {
                min_position = i;
            }
        }
        return arraylist.get(min_position);
    }

    public static int max_value_ArrayList(ArrayList<Integer> arraylist) {
        int max_position = 0;
        for (int i = 1; i < arraylist.size(); i++) {
            if (arraylist.get(i) > arraylist.get(max_position)) {
                max_position = i;
            }
        }
        return arraylist.get(max_position);
    }

    public static ArrayList<Integer> del_evens_ArrayList(ArrayList<Integer> arraylist) {
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i) % 2 == 0) {
                arraylist.remove(i);
                --i;
            }
        }
        return arraylist;
    }
}
