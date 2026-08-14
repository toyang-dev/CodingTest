import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        Map<String, Integer> newphoto = new HashMap<>();
        
        // name은 그리워 하는 사람의 이름 모음
        // yearnign은 name i 번째의 그리워하는 사람 점수 모음.
        // 포토에 사진 모음. 각 사진에는 사람들의 이름이 들어가있음.
        
         // 1단계: 이름 -> 그리움 점수 매핑
        Map<String, Integer> scoreMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }
        
        
         // 2단계: 각 사진(행)마다 등장하는 사람들 점수 합산
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (String person : photo[i]) {
                sum += scoreMap.getOrDefault(person, 0);
            }
            answer[i] = sum;
        }
        
        return answer;
       
  
    }
}