public class GuessNumGame {

    public static void main(String[] args) {

        Boss finalBoss = new Boss("Final Boss");

        Player playerOne = new Player("Player One");

        Player playerTwo = new Player("Player Two");

        int target = finalBoss.generateTarget();

        while (target != playerOne.generateGuess() || target != playerTwo.generateGuess()) {

            int p1 = playerOne.generateGuess();
            int p2 = playerTwo.generateGuess();

            System.out.println("Final Boss: " + target);
            System.out.println("Player One: " + p1);
            System.out.println("Player Two: " + p2);

            if (target == p1 && target == p2) {
                System.out.println("Congratulations, both players won!");
                break;
            } else if (target == p1) {
                System.out.println("Congratulations, " + playerOne.getName() + ", you guessed it right!");
                break;
            } else if (target == p2) {
                System.out.println("Congratulations, " + playerTwo.getName() + ", you guessed it right!");
                break;
            } else {
                System.out.println("No one guessed right, keep playing!");
                System.out.println();
            }
        }
    }
}
