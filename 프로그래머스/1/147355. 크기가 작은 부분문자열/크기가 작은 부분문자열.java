class Solution {
    public int solution(String t, String p) {
        int compare = 0;
        int index = 0;                
                     
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String compareNum = t.substring(i, i + p.length());
            long longCompareNum = Long.parseLong(compareNum);
            if (longCompareNum <= Long.parseLong(p)) {
                compare++;
            }
        }   
                                         
        int answer = compare;
        return answer;
    }
}