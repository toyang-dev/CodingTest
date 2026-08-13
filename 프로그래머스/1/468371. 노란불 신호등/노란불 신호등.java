class Solution {
    
    private long gcd(long a, long b){ // 완전히 나누어 떨어지는 제일 큰 수
            return b == 0 ? a : gcd(b, a%b);
            
        }
        
        private long lcm(long a, long b){  // 최초 만나는 지점
            return (a * b) / gcd(a, b);
        }
    
    
    public int solution(int[][] signals) {
        
        
        long lcm = 1;
        for(int s[] : signals){
            int p = s[0] + s[1] + s[2];
            lcm = lcm(lcm, p); 
        }
        
        
        
        
        //각각 주기를 돌면서 노란 구간 범위 최소부터 최대를 구하고 겹치는 구간 판단.
        // 모든 것은 처음 등장 이후  g + y + b 이후에 다시 등장.
        // 등장하여 노란 시간동안 유지
        //전체 주기가 있을 때 해당 시각이 어느 주기에 해당 하는가.   
        for(int j = 1; j <= lcm; j++){
            boolean yellow = true;
            
            for(int i = 0; i < signals.length; i++){
                int g = signals[i][0];
                int y = signals[i][1];
                int r = signals[i][2];
                
                int position = (j - 1) % (g + y + r) + 1;
                
                if(!(g < position && position <= g + y)){
                    yellow = false;
                    break;
                }   
            }
            if(yellow){
                return j;
            }
            
        }     
        return -1;
        
    }
}