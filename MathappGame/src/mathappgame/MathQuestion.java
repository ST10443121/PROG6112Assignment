/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathappgame;

/**
 *
 * @author Thato Mthembu
 */
public abstract class MathQuestion 
{
    protected int operate1;
    protected int operate2;
    
    public MathQuestion(int operate1, int operate2)
    {
        this.operate1 = operate1;
        this.operate2 = operate2;
    }
    
    public abstract int getAnswer();
    public abstract String getQuestion();
    
}
