import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;                
        int giftValue = 0;
        Integer cnt = 0;
        // 받을 선물수
        Map<String, Integer> receiveGift = new HashMap<String, Integer>();
        // 선물지수 
        Map<String, Integer> score = new HashMap<String, Integer>();
        // 준사람 , 받은사람 + 선물횟수
        Map<String, Map<String, Integer>> table = new HashMap<String, Map<String, Integer>>();
        
        for(int i = 0 ; i <= friends.length - 1 ; i++){
            score.put(friends[i],0);
            receiveGift.put(friends[i],0);
            table.put(friends[i], new HashMap<String, Integer>());
        }             
        
        for(int j = 0 ; j <= gifts.length - 1 ; j++){
            // 주는사람 " "<-- 공백전
            // 받는사람 " "<-- 공백후            
            int idx = gifts[j].lastIndexOf(" ");
            // 선물주는사람
            String giver = gifts[j].substring(0,idx);
            // 받는사람
            String recipient = gifts[j].substring(idx + 1);
            // 처음 주는거면 값 생성후 선물지수 + 주고받은 횟수 count
            table.get(giver).put(recipient, table.get(giver).getOrDefault(recipient, 0) + 1 );
            // 받은사람 선물지수 - 1 
            score.put(giver, score.get(giver) + 1);
            score.put(recipient, score.get(recipient) - 1);
        }
        
        for(int i = 0 ; i <= friends.length - 1; i++){
            for(int j = 0 ; j <= friends.length - 1 ; j++){
                
                if( i != j){
                    table.get(friends[i]).put(friends[j],table.get(friends[i]).getOrDefault(friends[j],0));                       table.get(friends[j]).put(friends[i],table.get(friends[j]).getOrDefault(friends[i],0));     
                    if(table.get(friends[i]).get(friends[j]) > table.get(friends[j]).get(friends[i])){
                        
                        cnt = receiveGift.get(friends[i]);
                        receiveGift.put(friends[i], cnt + 1);
                    } else if(table.get(friends[i]).get(friends[j]) == table.get(friends[j]).get(friends[i])){
                        if(score.get(friends[i]) > score.get(friends[j])){                            
                            cnt = receiveGift.get(friends[i]);
                            receiveGift.put(friends[i], cnt + 1);
                        }
                    }                        
                }    
            }
        }
        
        for(int i =0; i <= friends.length -1 ; i++){
           if(answer < receiveGift.get(friends[i])){ 
               answer = receiveGift.get(friends[i]);
           }
        }
        return answer;
    }
}