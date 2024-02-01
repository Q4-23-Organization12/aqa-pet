package hw11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public Move makeMove() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(getName() + ", выберите (1 - Камень, 2 - Ножницы, 3 - Бумага): ");
            int choice = scanner.nextInt();

            if (choice < 1 || choice > 3) {
                throw new IllegalArgumentException("Неверный выбор. Введите число от 1 до 3 для выбора действия");
            }

            switch (choice) {
                case 1:
                    return Move.ROCK;
                case 2:
                    return Move.SCISSORS;
                case 3:
                    return Move.PAPER;
                default:
                    return null;
            }
        } catch (InputMismatchException e) {
            // Обработка исключения, если введено нечисловое значение
            throw new InputMismatchException("Неверный формат ввода. Введите число для выбора действия");
        }
    }
}
