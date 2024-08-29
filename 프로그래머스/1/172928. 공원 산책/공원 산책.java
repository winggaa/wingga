class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0; 
        int y = 0; 
        int xLeng = park.length;
        int yLeng = park[0].length();
        
        // 시작위치
        for (int i = 0; i < xLeng; i++) {
            for (int j = 0; j < yLeng; j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        
        for (String route : routes) {
            String direction = route.split(" ")[0]; 
            int steps = Integer.parseInt(route.split(" ")[1]); 
            
            int tempX = x;
            int tempY = y;
            boolean canMove = true;
            
            for (int step = 0; step < steps; step++) {
                if (direction.equals("N")) {
                    tempX--;
                } else if (direction.equals("S")) {
                    tempX++;
                } else if (direction.equals("E")) {
                    tempY++;
                } else if (direction.equals("W")) {
                    tempY--;
                }

                
        if (tempX < 0 || tempX >= xLeng || tempY < 0 || tempY >= yLeng || park[tempX].charAt(tempY) =='X') {
                    canMove = false; 
                    break;
                }
            }
            
            if (canMove) {
                x = tempX;
                y = tempY;
            }
        }

        return new int[]{x, y};
    }
}