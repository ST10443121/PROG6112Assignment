/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathappgame;

/**
 *
 * @author Thato Mthembu
 */
public class Times extends MathQuestion 
{
     public Times(int operate1, int operate2)
    {
        super(operate1,operate2);
    }
    
    
    @Override
    public int getAnswer() 
    {
        return operate1 * operate2;
    }
    
    @Override
    public String getQuestion() {
        return operate1 + " x " + operate2 + " = ?";
    }    
}
