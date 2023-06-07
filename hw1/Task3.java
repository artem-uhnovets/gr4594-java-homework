/* 
 * Реализовать простой калькулятор (+-/*)
* sc.next() - считывает 1 элемент
* sc.nextInt() - считывает только число
* sc.nextLine() - считывает строчку
* Введите число: 4 \n
* Введите знак:
*/

package HomeWorks.hw1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input_from_user = new Scanner(System.in);
        boolean was_operation = false;
        double result = 0;
        String operation;
        
        System.out.print("Enter a first number - ");
        double first_num = input_from_user.nextInt();

        System.out.print("Enter a second number - ");
        double second_num = input_from_user.nextInt();

        while (true) {
            System.out.print("Enter a arithmetic operation - ");
            switch (operation = input_from_user.next()) {
                case "*":
                    result = first_num * second_num;
                    was_operation = true;
                    break;
                case "/":
                    result = first_num / second_num;
                    was_operation = true;
                    break;
                case "+":
                    result = first_num + second_num;
                    was_operation = true;
                    break;
                case "-":
                    result = first_num - second_num;
                    was_operation = true;
                    break;
                case "%":
                    result = first_num % second_num;
                    was_operation = true;
                    break;
                default:
                    System.out.println("Mistake!");
            }
            if (was_operation) break;
        }    
        System.out.printf("%d %s %d = %f", (int)first_num, operation, (int)second_num, result);
    }
}
