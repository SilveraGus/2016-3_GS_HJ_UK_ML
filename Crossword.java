
public class Crossword{
    private Square[][] puzzle;
    public Crossword(boolean[][] blackSquares){
        for(int r = 0; r < blackSquares[0].length; r++){
            for(int c = 0; c < blackSquares[1].length;c++){
                puzzle[r][c] = new Square(blackSquares[r][c], r);
            }
        }
    }
    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){
        if( puzzle[r][c].isBlack == false   &&//is white
            puzzle[r-1][c].isBlack == false &&//directly to left is white 
            puzzle[r][c-1].isBlack == false   //directly above is white
            )
            return true;
        return false;
    }

    
}
