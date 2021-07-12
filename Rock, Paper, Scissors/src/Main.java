import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //The program sets the variables
        String playerMove;
        String computerMove;
        String playerMoveName;
        String computerMoveName;
        int win = 0;
        int loss = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose rock, paper, or scissors. 'r' is for rock, 'p' is for paper, 's' is for scissors. To exit, choose 'x'" +
                "\n******************************************************");

        /*The program is put in a loop. All the code below this – the actual rock, paper, scissors game – will repeat...
        ...until the player chooses to quit
        */
        while(true) {

            System.out.println("Wins: " + win + " Losses: " + loss + "\nChoose:");
            //The program asks for player input
            playerMove = scan.next();

            /*If the player inputs 'x' then the loop breaks and the program enters the last line of code after the loop then ends
            If the player enters in an invalid option, the program informs them of this and the program loops back
            If the player enters a valid (r, p, or s) option, the program continues
             */
            if(playerMove.equals("x")) {
                break;
            } else if(!playerMove.equals("r") && !playerMove.equals("p") && !playerMove.equals("s")) {
                System.out.println("Invalid move. Please try again.\n******************************************************");
            } else {

                /* The program generates a random number from 0-2
                If the number is 0, the computer chooses rock
                If the number is 1, the computer chooses paper
                If the number is 2, the computer chooses scissors
                The program sets the variable computerMoveName to 'rock,' 'paper,' or 'scissors' accordingly
                 */
                int rand = (int) (Math.random() * 3);
                if (rand == 0) {
                    computerMove = "r";
                    computerMoveName = "rock";
                } else if (rand == 1) {
                    computerMove = "p";
                    computerMoveName = "paper";
                } else {
                    computerMove = "s";
                    computerMoveName = "scissors";
                }

                //The program sets the variable playerMoveName to 'rock,' 'paper,' or 'scissors' accordingly
                if (playerMove.equals("r")) {
                    playerMoveName = "rock";
                } else if (playerMove.equals("p")) {
                    playerMoveName = "paper";
                } else {
                    playerMoveName = "scissors";
                }

                /*The program determines whether the player won, drew, or lost and responds as such
                The program uses the previously determined variables computerMoveName and playerMoveName to state...
                ...the full names of the chosen moves to the player
                The program raises the win or loss integer variable accordingly
                 */
                if (playerMove.equals(computerMove)) {
                    System.out.println("You drew!\nComputer choice: " + computerMoveName + "\tPlayer choice: " + playerMoveName);
                } else if ((playerMove.equals("r") && computerMove.equals("s")) ||
                        (playerMove.equals("p") && computerMove.equals("r")) ||
                        (playerMove.equals("s") && computerMove.equals("p"))) {
                    System.out.println("You win!\nComputer choice: " + computerMoveName + "\tPlayer choice: " + playerMoveName);
                    win++;
                } else {
                    System.out.println("You lose!\nComputer choice: " + computerMoveName + "\tPlayer choice: " + playerMoveName);
                    loss++;
                }
                System.out.println("******************************************************");
            }
        }
        System.out.println("Thank you for playing!");
    }
}