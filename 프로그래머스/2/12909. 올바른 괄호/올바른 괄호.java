class Solution {
    boolean solution(String s) {
        int count = 0;
        char[] cArray = s.toCharArray();
        
        
        
        for (int i = 0; i<cArray.length; i++ ) {
            if (count < 0) {
                return false;
            }
            if (cArray[i] == '(') {
                count++;
            } else {
                count--;
            }
        }
        
        return count == 0 ? true : false;
    }
}