import java.util.*;
class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int count = 0;
        int n = board.length;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        for(int i =0; i<= 3 ; i++){
           int h_check = h + dh[i];
           int w_check = w + dw[i];
           if(h_check >= 0 && h_check < n && w_check >= 0 && n > w_check){
               if(board[h][w].equals(board[h_check][w_check])){
                   count = count + 1;
               }
           }     
        }
        
        return count;

        
    }
}


// 위아래면 ex) [2][2] ---> 위 [1][2] 아래 [3][2] 왼 [2][1] 오 [2][3]