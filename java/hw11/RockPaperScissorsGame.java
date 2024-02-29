package hw11;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.logging.Logger;

public class RockPaperScissorsGame {
    public static final Logger logger = Logger.getLogger(String.valueOf(RockPaperScissorsGame.class));

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя Игрока #1: ");
        String player1Name = scanner.nextLine();
        Player player1 = new HumanPlayer(player1Name);

        System.out.println("Введите имя Игрока #2: ");
        String player2Name = scanner.nextLine();
        Player player2 = new HumanPlayer(player2Name);

        for (int round = 1; round <= 3; round++) {
            System.out.println("Раунд " + round + ":");

            Move movePlayer1 = player1.makeMove();
            Move movePlayer2 = player2.makeMove();

            System.out.println(player1.getName() + " выбрал: " + movePlayer1);
            System.out.println(player2.getName() + " выбрал: " + movePlayer2);

            int result = movePlayer1.compareTo(movePlayer2);
            if (result > 0) {
                player1.incrementScore();
                logger.info(player1.getName() + " выиграл раунд!");
            } else if (result < 0) {
                player2.incrementScore();
               logger.info(player2.getName() + " выиграл раунд!");
            } else {
                logger.info("Ничья.");
            }

            System.out.println();
        }

        System.out.println("Количество очков:");
        System.out.println(player1.getName() + " набрал " + player1.getScore() + " очков.");
        System.out.println(player2.getName() + " набрал " + player2.getScore() + " очков.");

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " выиграл игру!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " выиграл игру!");
        } else {
            System.out.println("Ничья.");
        }

        System.out.println("Продолжить игру? (1 - Да, 2 - Нет): ");
        int playAgainChoice = scanner.nextInt();

        while (playAgainChoice == 1) {
            main(args);
        }

        System.out.println("Будь здоров");
    }

}