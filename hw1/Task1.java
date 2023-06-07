/* 
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n),
 * n! (произведение чисел от 1 до n) 
 * 1 + 2 + 3 и 1*2*3
 */

package HomeWorks.hw1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input_number = new Scanner(System.in);
        System.out.print("Введите число - ");
        int user_num = input_number.nextInt();
        int summ = 0;
        int multiply = 1;
        for (int i = 1; i <= user_num; i++) {
            summ += i;
            multiply *= i;
        }
        System.out.printf("Сумма - %d, произведение - %d", summ, multiply);
    }
}