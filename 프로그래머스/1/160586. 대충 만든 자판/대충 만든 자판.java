import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {

        List<Integer> list = new ArrayList<>();
        
        // 타겟에 있는 값을 반복으로 계속 돌리는 것보다는 먼저 키맵에 있는 값의 최소를
        // 먼저 찾아서 저장.
        
        //행 반복
        //각 행의 값의 클릭 수 put, 하기 전에 이미 존재하는지, 있다면 비교를 해서 최소를 풋, 없다면 바로 풋. 
        
        Map<Character, Integer> key_map = new HashMap<>();
        
        for(int i = 0; i < keymap.length; i++)
            for(int j = 0; j < keymap[i].length(); j++){
                if(key_map.containsKey(keymap[i].charAt(j))){
                    key_map.put(keymap[i].charAt(j), Math.min(key_map.get(keymap[i].charAt(j)), j+1));
                }
                else{
                    key_map.put(keymap[i].charAt(j), j+1);
                }
            }
        for(int i = 0; i < targets.length; i++){
            int sum = 0;
            for(int j = 0; j < targets[i].length(); j++){
                if(key_map.containsKey(targets[i].charAt(j))){
                    sum = sum + key_map.get(targets[i].charAt(j));
                }
                else{
                    sum = -1;
                    break;
                }
            }
            list.add(sum);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
        
        
    }
}