import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int condition = 0;
        int sortCondition = 0;
        
        if (ext.equals("date")) {
            condition = 1;
        } else if (ext.equals("maximum")) {
            condition = 2;
        } else if (ext.equals("remain")) {
            condition = 3;
        }

        if (sort_by.equals("date")) {
            sortCondition = 1;
        } else if (sort_by.equals("maximum")) {
            sortCondition = 2;
        } else if (sort_by.equals("remain")) {
            sortCondition = 3;
        }

        List<int[]> filteredList = new ArrayList<>();   
        for (int i = 0; i < data.length; i++) {
            if (data[i][condition] < val_ext) {  
                filteredList.add(data[i]);
            }
        }        
        final int finalSortCondition = sortCondition;
        filteredList.sort((a, b) -> Integer.compare(a[finalSortCondition], b[finalSortCondition]));

        
        int[][] answer = new int[filteredList.size()][4];
        for (int i = 0; i < filteredList.size(); i++) {
            answer[i] = filteredList.get(i);
        }

        return answer;
    }
}