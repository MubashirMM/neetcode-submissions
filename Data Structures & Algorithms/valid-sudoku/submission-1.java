class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++){
            if(!isValidRow(i,board)){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(!isValidCol(i,board)){
                return false;
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3)
            if(!isValidBox(i,j,board)){
                return false;
            }
        }
        return true;
    }
    boolean isValidRow(int row,char[][] board){
        Set<Character> seen=new HashSet<>();
        for(int i=0;i<9;i++){
            if(board[row][i]!='.' && !seen.add(board[row][i])){
                return false;
            }
        }
        return true;
    }
    boolean isValidCol(int col,char[][] board){
        Set<Character> seen=new HashSet<>();
        for(int i=0;i<9;i++){
            if(board[i][col]!='.' && !seen.add(board[i][col])){
                return false;
            }
        }
        return true;
    }
    boolean isValidBox(int row,int col,char[][] board){
        Set<Character> seen=new HashSet<>();
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
            if(board[i][j]!='.' && !seen.add(board[i][j])){
                return false;
            }
            }
        }
        return true;
    }

}
