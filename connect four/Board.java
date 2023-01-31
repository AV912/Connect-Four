


public class Board {
    private Piece[][] board = new Piece[6][7];
    private Player red;
    private Player yellow;

    /**
     * 
     */
    public Board(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                board[i][j] = new Piece();
            }
        }
        red = new Player("r");
        yellow = new Player("y");
    }

    public void printBoard(){
        for(Piece[] row: board){
            for(Piece piece : row){
                System.out.print(piece.getType() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean redTurn(int column){
        if(column < 1 || column >7){

        } else{
        for(int i = 5; i >= 0; i--){
            if(board[i][column - 1].isEmpty()){
                board[i][column -1] = red.placePiece();
                break;
            }
            
        }
        }

        printBoard();
        return checkForWinner("r");
        
    
    }

    public boolean yellowTurn(int column){
        if(column < 1 || column >7){

        } else{
        for(int i = 5; i >= 0; i--){
            if(board[i][column - 1].isEmpty()){
                board[i][column -1] = yellow.placePiece();
                break;
            }
            
        }
        }

        printBoard();
        return checkForWinner("y");
        
    
    }

    

    public boolean checkForWinner(String color){
        if(checkColumns(color)||checkRows(color)||checkForwardDiagonals(color)||checkBackwardDiagonals(color)){
            return true;
        }

        return false;
    }

    public boolean checkColumns(String color){
        boolean connectFour = false;
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 7; col++){
                if(connectFour == true){

                }else{
                    connectFour = fourInCol(color, row, col);
                }
            }
        }
        return connectFour;
    }

    public boolean fourInCol(String color, int row, int col){
        if(board[row][col].getType().equals(color) && 
        board[row+1][col].getType().equals(color) &&
        board[row+2][col].getType().equals(color) &&
        board[row+3][col].getType().equals(color)){
            return true;
        }
        return false;
    }

    public boolean checkRows(String color){
        boolean connectFour = false;
        for(int row = 0; row < 6; row++){
            for(int col = 0; col < 4; col++){
                if(connectFour == true){

                }else{
                    connectFour = fourInRow(color, row, col);
                }
            }
        }
        return connectFour;
    }

    public boolean fourInRow(String color, int row, int col){
        if(board[row][col].getType().equals(color) && 
        board[row][col+1].getType().equals(color) &&
        board[row][col+2].getType().equals(color) &&
        board[row][col+3].getType().equals(color)){
            return true;
        }
        return false;
    }

    public boolean checkForwardDiagonals(String color){
        boolean connectFour = false;
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 4; col++){
                if(connectFour == true){

                }else{
                    connectFour = fourInForwardDiagonal(color, row, col);
                }
            }
        }
        return connectFour;
    }

    public boolean fourInForwardDiagonal(String color, int row, int col){
        if(board[row][col].getType().equals(color) && 
        board[row+1][col+1].getType().equals(color) &&
        board[row+2][col+2].getType().equals(color) &&
        board[row+3][col+3].getType().equals(color)){
            return true;
        }
        return false;
    }

    public boolean checkBackwardDiagonals(String color){
        boolean connectFour = false;
        for(int row = 0; row < 3; row++){
            for(int col = 3; col < 7; col++){
                if(connectFour == true){

                }else{
                    connectFour = fourInBackwardDiagonal(color, row, col);
                }
            }
        }
        return connectFour;
    }

    public boolean fourInBackwardDiagonal(String color, int row, int col){
        if(board[row][col].getType().equals(color) && 
        board[row+1][col-1].getType().equals(color) &&
        board[row+2][col-2].getType().equals(color) &&
        board[row+3][col-3].getType().equals(color)){
            return true;
        }
        return false;
    }

    
    
}
