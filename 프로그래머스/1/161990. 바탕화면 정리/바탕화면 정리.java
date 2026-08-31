class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = -1;
        int luy = Integer.MAX_VALUE;
        int rdx = 0;
        int rdy = 0;
        
        // 배열에 있는 모든 #들을 삭제할 수 있는 최소 거리를 구하라
        
        //먼저 모든 행을 반복문으로 돌린다.  마지막 나온 행에서 샵이 나온다면 샵 인덱스 위치 + 1이 항상 rdx 값이 됨.        
        
        // 맨 처음 나온 행에서 샵이 나온 다면 그 그 행이 lux가 된다.
        
        
        // 각 행에서 처음 나온 샵보다  다음 행에서 나온 샵이 작다면, 첫다음 행 샵 인덱스가 luy가 된다.
        
        // 각 행을 돌았을 때 제일 샵이 마지막 위치에 있는 인덱스가  인덱스 +1 해서 rdy가 된다.
        
        for (int i = 0; i < wallpaper.length; i++) {          // 행 순회
            for (int j = 0; j < wallpaper[i].length(); j++) {  // 그 행의 각 글자 순회
        char c = wallpaper[i].charAt(j);
                if (c == '#') {
                    if(lux == -1) {
                        lux = i;
                    }
                    rdx = i;
                    luy = Math.min(luy, j);
                    rdy = Math.max(rdy, j);
                    
                }
            }
        }
        
        int[] answer = new int[]{lux, luy, rdx+1, rdy+1};
        return answer;
    }
}