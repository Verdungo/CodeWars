package kata.kyu7.monty_hall;

public class MontyHall {
    public int montyHallCase(int correctDoorNumber, int[] participantGuesses) {
        int wins = 0;
        for (int i = 0; i < participantGuesses.length; i++) {
            if (participantGuesses[i] != correctDoorNumber)
                wins++;
        }
        return Math.round((float)wins*100/participantGuesses.length);
    }
}
