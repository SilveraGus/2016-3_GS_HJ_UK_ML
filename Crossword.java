
public class Crossword{
    private Square[][] puzzle;
    public Crossword(boolean[][] blackSquares){
        int num = 0;
            if(blackSquares[0].length > 0){//makes sure at least one row
            for(int r = 0; r < blackSquares[0].length; r++){
                for(int c = 0; c < blackSquares[1].length;c++){
                    int label = 0;//defaulted to 0
                    if( toBeLabeled(r, c, blackSquares) ) {
                        label = num;//updates label with current iterator
                        num++;//increases iterator
                    }
                    puzzle[r][c] = new Square(blackSquares[r][c], label);
                    
                }
            }
        }
    }
    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){
        boolean whiteAbove = (!puzzle[r][c-1].isBlack);//white immediately above
        boolean whiteLeft =  (!puzzle[r-1][c].isBlack);//white immediately to left
        
        if( ( !puzzle[r][c].isBlack && ( r == 0 || c == 0) )  || //also checks if on beginning lanes (upper or leftmost)
               !puzzle[r][c].isBlack && (!whiteAbove || !whiteLeft || (!whiteAbove && !whiteLeft ) ) ) //not above, left, or both
             return true;
             
        return false;
    }

    
}
