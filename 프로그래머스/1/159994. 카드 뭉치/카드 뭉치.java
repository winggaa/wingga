class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        String[] goalCompare = new String[goal.length];
        int c1 = 0;
        int c2 = 0;
        for(int i = 0 ; i <= goal.length -1 ; i++){
            
            if(c1 < cards1.length && cards1[c1].equals(goal[i])){
                c1 += 1;
            } else if(c2 < cards2.length && cards2[c2].equals(goal[i])){
                c2 += 1;
            } else{
                return "No";
            }
            
            }                                    
        return "Yes";
        }
        
}
