import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для вывода таблицы умножения: ");
        int number = scanner.nextInt();

        System.out.println("Таблица умножения для числа " + number + ":");
        for (int i = 1; i <= 10; i++) {
            // Здесь // используется вложенный цикл для формирования строки таблицы
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\t", number, j, number * j);
            }
            System.out.println(); // Переход на новую строку после каждой строки таблицы
        }

        scanner.close();
    }
}
