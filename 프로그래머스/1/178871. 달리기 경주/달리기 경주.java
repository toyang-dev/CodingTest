import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        Map<String, Integer> Idxrank = new HashMap<>();
        
        for(int i = 0; i < players.length; i++){
            Idxrank.put(players[i], i);
        }
        
        for(String s : callings){
            int curIdx = Idxrank.get(s);
            int beforeidx = curIdx-1;
            String beforeName = players[beforeidx];
            
            players[beforeidx] = s;
            players[curIdx] = beforeName;
            
            Idxrank.put(beforeName, curIdx);
            Idxrank.put(s, beforeidx);
            
        }
        
        return players;
    }
}