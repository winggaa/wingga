class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int maxHealth = health;
        int sucHeal = 0;
        
        // 0 1 2 3
        for(int i=0; i <= attacks[attacks.length -1][0]; i++){
            int atkCk = 0;       
            // 0 1
            for(int j=0; j <= attacks.length -1 ; j++){
                
                if( i == attacks[j][0]){
                    health -= attacks[j][1] ;
                    sucHeal = 0;
                    atkCk = 1;
                    if(health <= 0){
                        return -1;
                    }
                    break;
                }
            }
            if(atkCk != 1 && i != attacks[attacks.length -1][0] ){
                sucHeal += 1;
                if(sucHeal == bandage[0]){
                    if(maxHealth <= health + bandage[1] + bandage[2]){
                        health = maxHealth;
                        sucHeal = 0;
                    } else {
                        health = health+bandage[1] + bandage[2];
                        sucHeal = 0;
                    }
                } else if(maxHealth <= health + bandage[1]){
                    health = maxHealth;                    
                } else{
                    health = health + bandage[1];                    
                }
            }    
            
        }
        answer = health;
        return answer;
    }
}