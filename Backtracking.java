//ex. Sudoku Solver
//rules- 1-9 once in row, column & grid(3*3)
//recurssion 

class Solution{

    //isSafe function
    public boolean isSafe(char[][] board, int row, int col, int number){
        //row & column
        for(int i=0; i<board.length; i++){
            if(board[i][col] == (char)(number + '0')){
                return false;
            }
            if(board[row][i] == (char)(number + '0')){
                return false;
            }
        }
        //grid
        int startrow = (row/3)*3;
        int startcol= (col/3)*3;
        for(int i=startrow; i<startrow+3; i++){
            for(int j=startcol; j<startcol+3; j++){
                if(board[i][j] == (char)(number + '0')){
                    return false; 
                }
            }
        }
        return true;
    }


    //helper recurrsive function
    public boolean helper(char[][] board, int row, int col){

        //base case
        if(row == board.length){
            return true;
        }


        int newrow=0;
        int newcol=0;
        if(col != board.length-1){
            newrow=row;
            newcol=col+1;
        }
        else{
            newrow = row+1;
            newcol=0;
        }
        if(board[row][col] != '.'){
            if(helper(board, newrow, newcol)){
                return true;
            }else{
                for(int i=1; i<=9; i++){
                    if(isSafe(board, row, col, i)){
                        board[row][col]=(char)(i+'0');
                        if(helper(board, newrow, newcol)){
                            return true;
                        }else{
                            board[row][col]='.';
                        }
                    }
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board){
        helper(board, 0, 0);

    }
}


public class Backtracking {
    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.solveSudoku(
            //enter sudoku 9*9 grid
        );
    }
}
