import java.util.*;

public class Code50{
    public List<String> construct(char[][]board){
        List<String>list=new ArrayList<>();

        for(int i=0;i<board.length;i++){
            list.add(new String(board[i]));
        }
        return list;
    }
    public void nQueens(char[][]board,int row,List<List<String>>result){

        //Base Case
        if(row==board.length){
            result.add(construct(board));
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1,result); //explore
                board[row][j]='.';//backtracking step

            }
        }
    }
    public boolean isSafe(char[][]board,int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }



        //left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }


        //right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {

        List<List<String>>result=new ArrayList<>();
        char[][]board=new char[n][n];

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                 board[i][j]='.';
            }
        }
        nQueens(board,0,result);
        return result;
        
    }
}