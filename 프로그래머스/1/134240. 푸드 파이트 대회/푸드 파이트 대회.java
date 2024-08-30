import java.util.*;
class Solution {
    public String solution(int[] food) {        
        
        String result = "";
        
        // 선수1
        for(int i = 1; i <= food.length - 1; i++){
                if(food[i] % 2 == 1){
                    food[i] -= 1;
                }
            for(int j = 1; j <= food[i] / 2 ; j++){
                  result += String.valueOf(i);      
            }
        }
        result += "0";
        
        // 선수2
        for(int i = food.length -1 ; i >= 1;i--){                                    
            for(int j = 1; j <= food[i] / 2 ; j++)   {
                result += String.valueOf(i);
            }
        }
        return result;
    }
}