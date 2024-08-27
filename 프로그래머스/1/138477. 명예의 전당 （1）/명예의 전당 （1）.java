import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];        
        ArrayList<Integer> index = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            index.add(score[i]);  
            Collections.sort(index, Collections.reverseOrder());  
                        
            if (index.size() > k) {
                index.remove(index.size() - 1);
            }                                             
            answer[i] = index.get(index.size() - 1);
        }
    return answer;
    }
}
    