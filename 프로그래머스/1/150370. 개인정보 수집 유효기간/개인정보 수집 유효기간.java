import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        String[] todaySplit = today.split("\\.");
        
        int todayYear = Integer.parseInt(todaySplit[0]);
        int todayMonth = Integer.parseInt(todaySplit[1]);
        int todayDay = Integer.parseInt(todaySplit[2]);
        
        
        Map<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] termSplit = term.split(" ");
            termsMap.put(termSplit[0], Integer.parseInt(termSplit[1]));
        }
        
        int[] index = new int[privacies.length];        
        int count = 0;
                                                
        for(int i=0; i<= privacies.length -1 ; i++){
            String[] privaciesSplit = privacies[i].split(" ");
            String[] dateSplit = privaciesSplit[0].split("\\.");
            
            int year = Integer.parseInt(dateSplit[0]);
            int month = Integer.parseInt(dateSplit[1]);
            int day = Integer.parseInt(dateSplit[2]);
            
            month += termsMap.get(privaciesSplit[1]);
            
            //System.out.println(month);
            while(month > 12){
                month -= 12;
                year += 1;
            }
            
            if( todayYear > year || (todayYear == year && todayMonth > month) || 
                (todayYear == year && todayMonth == month && todayDay >= day)){
                
                index[count] = i+1;
                count++;
            }
            
        }
        index = Arrays.stream(index)
                      .filter(item -> item != 0)
                      .toArray();             
        return index;
    }
}