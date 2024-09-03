/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathappgame;
import java.util.Scanner;

/**
 *
 * @author Thato Mthembu
 */
public class MathappGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       
        QuizQuestions generator = new QuizQuestions();
        Player player = new Player();

        System.out.println("Welcome to the Math'o Quiz!");
        System.out.print("Enter your name: ");
        player.setName(scanner.nextLine());
        
        int totalQuestions = 5; // Adjust the number of questions here

        playGame(scanner, generator, player, totalQuestions);

        scanner.close();   
    }
    
    private static void playGame(Scanner scanner, QuizQuestions generator, Player player, int totalQuestions) {
        int correctAnswers = 0;

        for (int i = 0; i < totalQuestions; i++) {
            MathQuestion problem = generator.generateProblem();
            System.out.println(problem.getQuestion());
            int userAnswer = scanner.nextInt();

            if (userAnswer == problem.getAnswer()) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. The correct answer is " + problem.getAnswer());
            }
        }

        System.out.println(player.getName() + ", you answered " + correctAnswers + " out of " + totalQuestions + " questions correctly.");
    }

    }
    

