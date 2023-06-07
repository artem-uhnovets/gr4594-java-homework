/* 
 * Вывести все простые числа от 1 до 1000
 */

package HomeWorks.hw1;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("1 2 ");
        for (int i = 3; i <= 1000; i++) {
            int count = 0;
            for (int j = 1; j <= (i / 2); j++) {
                count = ((i % j) == 0) ? ++count : count;
                if (count > 1) break;
            }
            if (count <= 1) {
                System.out.printf("%d ", i);
            }
        }
    }
}
