/* 
999. Available Captures for Rook

On an 8 x 8 chessboard, there is exactly one white rook 'R' and some number of white bishops 'B', black pawns 'p', and empty squares '.'.

When the rook moves, it chooses one of four cardinal directions (north, east, south, or west), then moves in that direction until it chooses to stop, reaches the edge of the board, captures a black pawn, or is blocked by a white bishop. A rook is considered attacking a pawn if the rook can capture the pawn on the rook's turn. The number of available captures for the white rook is the number of pawns that the rook is attacking.

Return the number of available captures for the white rook.

Example 1:
Input: board = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
Output: 3
Explanation: In this example, the rook is attacking all the pawns.

Example 2:
Input: board = [[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
Output: 0
Explanation: The bishops are blocking the rook from attacking any of the pawns.

Example 3:
Input: board = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".",".",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."]]
Output: 3
Explanation: The rook is attacking the pawns at positions b5, d6, and f5.
*/

class Solution {
    public int numRookCaptures(char[][] board) {
        
        int res = 0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 'R'){
                    res += rookUp(board , i , j) ? 1:0;
                    res += rookDown(board , i , j) ? 1:0;
                    res += rookLeft(board , i , j) ? 1:0;
                    res += rookRight(board , i , j)? 1:0;
                    return res;
                }
            }
        }
        
        return res;
        
    }
    
    public static boolean rookUp(char[][] board , int row , int col){
        for(int i=row;i>=0;i--){
            if(board[i][col] == 'p'){
                return true;
            }else if(board[i][col] == 'B'){
                return false;
            }
        }
        
        return false;
    }
    
    public static boolean rookDown(char[][] board , int row , int col){
        for(int i=row;i<board.length;i++){
            if(board[i][col] == 'p'){
                return true;
            }else if(board[i][col] == 'B'){
                return false;
            }
        }
        
        return false;
    }
    
    public static boolean rookLeft(char[][] board , int row , int col){
        for(int i=col;i>=0;i--){
            if(board[row][i] == 'p'){
                return true;
            }else if(board[row][i] == 'B'){
                return false;
            }
        }
        
        return false;
    }
    
    public static boolean rookRight(char[][] board , int row , int col){
        for(int i=col;i<board[0].length;i++){
            if(board[row][i] == 'p'){
                return true;
            }else if(board[row][i] == 'B'){
                return false;
            }
        }
        
        return false;
    }
}