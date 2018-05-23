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
public class Queen {
    private Pos pos;
    private int stepLimit;
    private boolean isBlack;
    public Queen(int x, int y){
        pos.setX(x);
        pos.setY(y);
    }
    public void move(){
        
    }
    public Pos getPos(){
        return pos;
    }
    public boolean isBlack(){
        return isBlack;
    }
}
