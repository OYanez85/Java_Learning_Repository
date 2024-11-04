public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1IsRight = true;
            }
            if (guessp2 == targetNumber) {
                p2IsRight = true;
            }
            if (guessp3 == targetNumber) {
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1IsRight);
                System.out.println("Player two got it right? " + p2IsRight);
                System.out.println("Player three got it right? " + p3IsRight);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}
