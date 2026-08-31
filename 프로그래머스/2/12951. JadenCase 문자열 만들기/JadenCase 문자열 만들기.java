class Solution {
    public String solution(String s) {
        String[] split = s.split(" ", -1);
        StringBuilder answer = new StringBuilder();

        for (String str : split) {

            if (str.isEmpty()) {
                answer.append(" ");
                continue;
            }

            String lowerCase = str.toLowerCase();
            char[] charArray = lowerCase.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            
            answer.append(new String(charArray)).append(" ");
        }

        return answer.substring(0, answer.length() - 1);
    }
}