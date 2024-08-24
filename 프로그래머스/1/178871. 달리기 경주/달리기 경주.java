import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        /*
        런타임초과
        String[] answer = {};
        
        for(int i = 0; i <= callings.length -1 ; i++){
            int num = Arrays.asList(players).indexOf(callings[i]);
            String temp = players[num - 1];
            players[num - 1] = callings[i];
            players[num] = temp;
        }
        answer = players;
        */
        Map<String, Integer> playerMap = new HashMap<String, Integer>();
        for(int i = 0 ; i <= players.length -1 ; i++){
            playerMap.put(players[i] , i);
        }
        for(String call : callings){
            int index = playerMap.get(call);
            
            if(index > 0){
                String temp = players[index - 1];
                players[index - 1] = players[index];
                players[index] = temp;
                
            playerMap.put(players[index],index);
            playerMap.put(players[index -1], index -1);    
            }
        }
        
        
        return players;
    }
}