/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internationalchess;

/**
 *
 * @author BryanS
 */
public interface ChessPiece {
    
    public void move();//figure out how the chesspiece is going to move
    
    //public void eat();
    
    //public void remove();
    
    public boolean isBlack();
    
    public Pos getPos();
}
