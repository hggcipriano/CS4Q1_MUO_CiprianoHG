//EX04_MUO_CiprianoHG
package ex04_muo_ciprianohg;

import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args){
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        int roundsToWin = 2;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
        System.out.println("1. Start game");
        System.out.println("2. Change number of rounds");
        System.out.println("3. Exit application");
        System.out.print("> ");
        int option = input.nextInt();

        while(option != 3){
            if(option == 0){
                System.out.println("\nWelcome to Rock, Paper, Scissors. Please choose an option:");
                System.out.println("1. Start game");
                System.out.println("2. Change number of rounds");
                System.out.println("3. Exit application");
                System.out.print("> ");
                option = input.nextInt();
            }
            else if(option == 1){
                int playerScore = 0;
                int computerScore = 0;
                
                if(option != 0){
                    while((playerScore < roundsToWin) && (computerScore < roundsToWin)){
                        System.out.println("\nThe computer has selected its move. Select your move:");
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Scissors");
                        System.out.print("> ");
                        int move = input.nextInt();

                        int result = 0;

                        int random = (int) Math.floor(Math.random()*3) + 1;

                        if(random == 1){
                            if(move == 1){
                                result = rock.compareMoves(rock, rock);
                                System.out.println("\nPlayer chose rock. Computer chose rock. Round is tied!");                                 
                            }     
                            else if(move == 2){
                                result = rock.compareMoves(rock, paper);
                                System.out.println("\nPlayer chose paper. Computer chose rock. Player wins round!");
                            }
                            else if(move == 3){
                                result = rock.compareMoves(rock, scissors);
                                System.out.println("\nPlayer chose scissors. Computer chose rock. Computer wins round!");
                            }
                            else{
                                System.out.println("\nMove invalid.");
                            }
                        }
                        else if(random == 2){
                            if(move == 1){
                                result = paper.compareMoves(paper, rock);
                                System.out.println("\nPlayer chose rock. Computer chose paper. Computer wins round!");
                            }     
                            else if(move == 2){
                                result = paper.compareMoves(paper, paper);
                                System.out.println("\nPlayer chose paper. Computer chose paper. Round is tied!");
                            }
                            else if(move == 3){
                                result = paper.compareMoves(paper, scissors);
                                System.out.println("\nPlayer chose scissors. Computer chose paper. Player wins round!");
                            }
                            else{
                                System.out.println("\nMove invalid.");
                            }
                        }
                        else if(random == 3){
                            if(move == 1){
                                result = scissors.compareMoves(scissors, rock);
                                System.out.println("\nPlayer chose rock. Computer chose scissors. Player wins round!");
                            }     
                            else if(move == 2){
                                result = scissors.compareMoves(scissors, paper);
                                System.out.println("\nPlayer chose paper. Computer chose scissors. Computer wins round!");
                            }
                            else if(move == 3){
                                result = scissors.compareMoves(scissors, scissors);
                                System.out.println("\nPlayer chose scissors. Computer chose scissors. Round is tied!");
                            }
                            else{
                                System.out.println("\nMove invalid.");
                            }
                        }

                        if(result == 0){
                            computerScore += 1;
                        }
                        else if(result == 1){
                            playerScore += 1;
                        }
                        else if(result == 2){
                            computerScore += 0;
                            playerScore += 0;
                        }

                        System.out.println("Player: " + playerScore + " - Computer: " + computerScore);   

                        if(playerScore == roundsToWin){
                            System.out.println("Player wins!\n");
                        }
                        else if(computerScore == roundsToWin){
                            System.out.println("Computer wins!\n");
                        }
                        
                        option = 0;
                    }
                }
            }
            else if(option == 2){
                System.out.println("\nHow many rounds are needed to win a match?");
                System.out.print("> ");
                roundsToWin = input.nextInt();
                System.out.println("\nNew setting has been saved!\n");
                option = 0;
            }
            else{
                System.out.println("\nWelcome to Rock, Paper, Scissors. Please choose an option:");
                System.out.println("1. Start game");
                System.out.println("2. Change number of rounds");
                System.out.println("3. Exit application");
                System.out.print("> ");
                option = input.nextInt();
            }  
        }
        
        System.out.println("\nThank you for playing!");
    }
}