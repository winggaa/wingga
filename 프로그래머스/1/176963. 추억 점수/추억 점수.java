import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++){
            int temp = 0;
            for(int j = 0; j < photo[i].length; j++){
                int idx = Arrays.asList(name).indexOf(photo[i][j]);
                if(idx >= 0){
                    temp += yearning[idx];
                } else{
                    temp += 0;
                }
            }
            answer[i] = temp;
        }
        return answer;
    }
}