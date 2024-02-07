package hw11;

public class ComputerPlayer  extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public Move makeMove() {
        int choice = (int) (Math.random() * 3) + 1;

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
    }
}
