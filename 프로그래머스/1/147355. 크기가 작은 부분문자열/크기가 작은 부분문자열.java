class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        
        //두 자리수 이상일 경우 , 첫 인덱스 다음부터 두자리수 카운트
        
        int x = p.length();
        
        for(int i = 0; i <= t.length()-x; i++){
            String sub = t.substring(i, i + x);  // 부분 문자열 통째로 뽑기
            long subNum = Long.parseLong(sub);
            
            if(subNum <= Long.parseLong(p)){
                answer++;
            }
            }
        
         return answer;
        }
        
       
    }
