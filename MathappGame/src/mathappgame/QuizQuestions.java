/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathappgame;
import java.util.Random;

/**
 *
 * @author Thato Mthembu
 */
public class QuizQuestions 
{
    private Random random = new Random();

    public MathQuestion generateProblem() {
        int operatorIndex = random.nextInt(4);
        int operate1 = random.nextInt(10) + 1;
        int operate2 = random.nextInt(10) + 1;

        switch (operatorIndex) {
            case 0:
                return new Sum(operate1, operate2);
            case 1:
                return new Minus(operate1, operate2);
            case 2:
                return new Times(operate1, operate2);
            case 3:
                return new Division(operate1, operate2);
            default:
                return null; // it handle unexpected cases
        }
    }
    
}

//REFRENCES: github.com lmwshow/Interview_Algorithm_Train
